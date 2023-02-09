package Task1;

public class JACStudents {
    private String username;
    private String password;
    private String fullname;
    private String instructorEmail;

    public JACStudents(String username, String password, String fullname, String instructorEmail) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.instructorEmail = instructorEmail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getInstructorEmail() {
        return instructorEmail;
    }

    public void setInstructorEmail(String instructorEmail) {
        this.instructorEmail = instructorEmail;
    }

    @Override
    public String toString() {
        return "JACStudents{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", fullname='" + fullname + '\'' +
                ", instructorEmail='" + instructorEmail + '\'' +
                '}';
    }
}
