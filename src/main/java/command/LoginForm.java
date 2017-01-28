package command;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Stepan
 */
public class LoginForm implements Command {

    @Override
    public String execute(HttpServletRequest httpRequest) {
        return "jsp/login.jsp";
    }
}
