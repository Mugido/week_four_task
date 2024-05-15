package student;

public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    private String gradeLevel;
    private String eMail;
    private String guardianeMail1;
    private String guardianeMail2;
    private String isArchived;
    private String isDeleted;

    public Student(String studentID, String firstName, String lastName, String gradeLevel, String eMail, String guardianeMail1, String guardianeMail2, String isArchived, String isDeleted) {
        this.studentId = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        this.eMail = eMail;
        this.guardianeMail1 = guardianeMail1;
        this.guardianeMail2 = guardianeMail2;
        this.isArchived = isArchived;
        this.isDeleted = isDeleted;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public String geteMail() {
        return eMail;
    }

    public String getGuardianeMail1() {
        return guardianeMail1;
    }

    public String getGuardianeMail2() {
        return guardianeMail2;
    }

    public String getIsArchived() {
        return isArchived;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    @Override
    public String toString() {
        return
                studentId + '\'' +
                firstName + '\'' +
                lastName + '\'' +
                gradeLevel + '\'' +
                eMail + '\'' +
                guardianeMail1 + '\'' +
                guardianeMail2 + '\'' +
                isArchived + '\'' +
                isDeleted + '\'' ;
    }
}

