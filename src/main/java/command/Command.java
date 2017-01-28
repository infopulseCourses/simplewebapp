package command;


import javax.servlet.http.HttpServletRequest;

/**
 * @author Stepan
 */
public interface Command {

    String execute(HttpServletRequest httpRequest);

}
