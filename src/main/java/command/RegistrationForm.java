package command;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Stepan
 */
public class RegistrationForm implements Command {

    @Override
    public String execute(HttpServletRequest httpRequest) {
        return "jsp/registration.jsp";
    }
}
