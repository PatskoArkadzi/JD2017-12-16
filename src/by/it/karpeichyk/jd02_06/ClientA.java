package by.it.karpeichyk.jd02_06;

/**
 * Created by user on 12.02.2018.
 */
public class ClientA {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            SingleLogger.getInstance().log("Error"+i);

        }
    }
}
