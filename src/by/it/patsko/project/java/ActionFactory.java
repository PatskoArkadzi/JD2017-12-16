package by.it.patsko.project.java;

import javax.servlet.http.HttpServletRequest;

public class ActionFactory {
    ActionCommand defineCommand(HttpServletRequest req){
        ActionCommand command=Actions.ERROR.command;
        String action=req.getParameter("command");
        try {
            Actions currentEnum = Actions.valueOf(action.toUpperCase());
            command=currentEnum.getCommand();
        }catch (IllegalArgumentException e){
            command=Actions.ERROR.getCommand();
        }
        return command;
    }
}
