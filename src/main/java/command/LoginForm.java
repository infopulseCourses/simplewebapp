package command;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Stepan
 */
public class LoginForm implements Command {

    @Override
    public String execute(HttpServletRequest httpRequest) {
        System.out.println("login form execute");
        return "WEB-INF/jsp/login.jsp";
    }
}
