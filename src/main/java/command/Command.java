package command;

import com.sun.deploy.net.HttpRequest;

/**
 * @author Stepan
 */
public interface Command {
    void execute(HttpRequest httpRequest);

}
