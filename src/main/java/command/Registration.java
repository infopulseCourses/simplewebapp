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
        if(firstName.equals("") || login.equals("") || password.equals("")){
           session.setAttribute("error","Validation failed");
            System.out.println("null");
           return "WEB-INF/jsp/registration.jsp";
        }

        LoginService loginService = ServiceFactory.getInstance().getLoginService();
        boolean success = loginService.registration(firstName,login,password);
        if(!success){
            session.setAttribute("error","Registration error");
            System.out.println("not success");
            return "WEB-INF/jsp/registration.jsp";
        }
        System.out.println(" success");
        return "WEB-INF/jsp/login.jsp";
    }
}
