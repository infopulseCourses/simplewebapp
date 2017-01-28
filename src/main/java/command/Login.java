package command;

import service.LoginService;
import service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Stepan
 */
public class Login implements Command {

    @Override
    public String execute(HttpServletRequest httpRequest) {
        String login = httpRequest.getParameter("login");
        String password = httpRequest.getParameter("password");
        HttpSession session = httpRequest.getSession(true);
        if( login == null || password == null){
           session.setAttribute("error","Validation error");
           return "jsp/login.jsp";
        }
        LoginService loginService = ServiceFactory.getInstance().getLoginService();
        boolean success = loginService.login(login,password);
        if(!success){
            session.setAttribute("error","Login incorrect");
            return "jsp/login.jsp";
        }
        session.setAttribute("login",login);
        return "jsp/profile.jsp";
    }
}
