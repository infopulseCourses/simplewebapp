package listener;

import dao.util.EntityManagerUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Stepan
 */
public class ServletContextListenerImpl implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context startup");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context down");
        EntityManagerUtil.closeFactory();
    }
}
