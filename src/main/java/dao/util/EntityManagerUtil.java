package dao.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Stepan
 */
public class EntityManagerUtil {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("em");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void closeFactory(){
        factory.close();
    }
}
