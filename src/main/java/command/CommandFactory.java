package command;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Stepan
 */
public class CommandFactory {
    private static CommandFactory instance = new CommandFactory();
    private Map<String,Command> commands = new HashMap<String, Command>();

    private CommandFactory(){
        commands.put("/loginForm", new LoginForm());
        commands.put("/registrationForm", new RegistrationForm());
        commands.put("/registration", new Registration());
        commands.put("/login", new Login());
    }

    public static CommandFactory getInstance(){
        return instance;
    }

    public Command getCommand(HttpServletRequest req) {
        String uri = req.getRequestURI();
        return commands.get(uri);
    }

}
