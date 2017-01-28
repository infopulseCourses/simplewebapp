package command;

import service.LoginService;
import service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Stepan
 */
public class Registration implements Command {

    @Override
    public String execute(HttpServletRequest httpRequest) {

        String firstName = httpRequest.getParameter("firstName");
        String login = httpRequest.getParameter("login");
        String password = httpRequest.getParameter("password");
        HttpSession session = httpRequest.getSession(true);
        if(firstName == null || login == null || password == null){
           session.setAttribute("error","Validation failed");
           return "jsp/registration.jsp";
        }

        LoginService loginService = ServiceFactory.getInstance().getLoginService();
        boolean success = loginService.registration(firstName,login,password);
        if(!success){
            session.setAttribute("error","Registration error");
            return "jsp/registration.jsp";
        }

        return "jsp/login.jsp";
    }
}
