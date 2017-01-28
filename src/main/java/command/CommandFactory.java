package command;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Stepan
 */
public class CommandFactory {
    private static CommandFactory instance = new CommandFactory();
    private Map<String,Command> commands = new HashMap<>();

    private CommandFactory(){
        commands.put("/auth/loginForm", new LoginForm());
        commands.put("/auth/registrationForm", new RegistrationForm());
        commands.put("/auth/registration", new Registration());
        commands.put("/auth/login", new Login());
    }

    public static CommandFactory getInstance(){
        return instance;
    }

    public Command getCommand(HttpServletRequest req) {
        String uri = req.getRequestURI();
        System.out.println(uri);
        return commands.get(uri);
    }

}
