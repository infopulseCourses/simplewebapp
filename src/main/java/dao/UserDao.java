package dao;

import dto.UserDTO;

import java.util.List;

/**
 * @author Stepan
 */
public interface UserDao {

     boolean saveUser(String firstName, String login, String password);

     UserDTO getUserByLogin(String login);

    List<UserDTO> getAllUsers();
}
