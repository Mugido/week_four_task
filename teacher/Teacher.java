package teacher;

public class Teacher {
    private String teacherId;
    private String eMail;
    private String firstName;
    private String lastName;

    public Teacher(String teacherId, String eMail, String firstName, String lastName) {
        this.teacherId = teacherId;
        this.eMail = eMail;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String geteMail() {
        return eMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return
                teacherId + '\'' + " " +
                eMail + '\'' + " " +
                firstName + '\'' + " " +
                lastName + '\'' + " ";
    }
}

