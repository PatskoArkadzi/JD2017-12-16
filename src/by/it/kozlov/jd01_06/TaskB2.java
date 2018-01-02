package by.it.kozlov.jd01_06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskB2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(Poem.text);
        sb = deleteSign(sb);
        sb = deleteElipsis(sb);
        sb.trimToSize();

        System.out.println(sb.toString());
    }

    private static StringBuilder deleteElipsis(StringBuilder sb) {
        Pattern pattern = Pattern.compile("\\.{3}");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            sb.replace(matcher.start(), matcher.end(), " ");
        }
        return sb;
    }

    private static StringBuilder deleteSign(StringBuilder sb) {
        Pattern pattern = Pattern.compile("\\-|,|:|!");
        Matcher matcher = pattern.matcher(Poem.text);
        while (matcher.find()) {
            sb.replace(matcher.start(), matcher.end(), " ");
        }
        return sb;
    }
}
