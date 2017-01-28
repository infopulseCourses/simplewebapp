package dao;

import dao.impl.UserDaoImpl;
import service.LoginService;
import service.ServiceFactory;

/**
 * @author Stepan
 */
public class DaoFactory {
    private static DaoFactory instance = new DaoFactory();

    private UserDao userDao = new UserDaoImpl();

    public static DaoFactory getInstance(){
        return instance;
    }

    public UserDao getUserDao(){
        return userDao;
    }
}
