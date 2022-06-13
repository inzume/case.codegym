package SubjectComputerAndCustumer;

import java.io.Serializable;

public class ADMIN implements Serializable {
    String User;
    String Password;

    public ADMIN() {
    }

    public ADMIN(String user, String password) {
        User = user;
        Password = password;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "ADMIN{" +
                "User='" + User + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
