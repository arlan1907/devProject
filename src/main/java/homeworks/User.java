package homeworks;

public class User {

    private String fullName;
    private String userName;
    private String password;
    private int id;

    public User(String fullName, String userName, String password, int id) {
        this.fullName = fullName;
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return
                "Full name: " + fullName + '\n' +
                "Username: " + userName + '\n' +
                "Password: " + password + '\n' +
                "UserId: " + id ;
    }
}
