package service;

import dao.DaoFactory;
import dao.UserDao;
import dto.UserDTO;

/**
 * @author Stepan
 */
public class LoginService {

    private UserDao userDao = DaoFactory.getInstance().getUserDao();

    public boolean registration(String firstName, String login, String password) {
        return userDao.saveUser(firstName, login, password);
    }

    public boolean login(String login, String password){
        UserDTO user  = userDao.getUserByLogin(login);
        return user != null && user.getPassword().equals(password);
    }

}
