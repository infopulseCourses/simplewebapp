package command;

import dto.UserDTO;
import service.LoginService;
import service.ServiceFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author Stepan
 */
public class Login implements Command {

    @Override
    public String execute(HttpServletRequest httpRequest) {
        String login = httpRequest.getParameter("login");
        String password = httpRequest.getParameter("password");
        HttpSession session = httpRequest.getSession(true);
        if( login.equals("") || password.equals("")){
           session.setAttribute("error","Validation error");
           return "WEB-INF/jsp/login.jsp";
        }
        LoginService loginService = ServiceFactory.getInstance().getLoginService();
        boolean success = loginService.login(login,password);
        if(!success){
            session.setAttribute("error","Login incorrect");
            return "WEB-INF/jsp/login.jsp";
        }
        session.setAttribute("login",login);
        List<UserDTO> users = ServiceFactory.getInstance().getLoginService().getAllUsers();
        session.setAttribute("users",users);
        return "WEB-INF/jsp/profile.jsp";
    }
}
