
/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class User {

    private String email;
    private String name;
    private int hashedPassword;

    public User(String email, String name, int hashedPassword) {
        this.email = email;
        this.name = name;
        this.hashedPassword = hashedPassword;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.hashedPassword;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        return this.hashedPassword == other.hashedPassword;
    }

    @Override
    public String toString() {
        return "User{" + "email=" + email + ", name=" + name + ", hashedPassword=" + hashedPassword + '}';
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getHashedPassword() {
        return hashedPassword;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHashedPassword(int hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

}
