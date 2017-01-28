package dao;

import dto.UserDTO;

/**
 * @author Stepan
 */
public interface UserDao {

     boolean saveUser(String firstName, String login, String password);

     UserDTO getUserByLogin(String login);
}
