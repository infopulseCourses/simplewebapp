package dto;

/**
 * @author Stepan
 */
public class UserDTO {

    private int id;

    private String firstName;

    private String login;

    private String password;

    public UserDTO(int id, String firstName, String login, String password) {
        this.id = id;
        this.firstName = firstName;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
