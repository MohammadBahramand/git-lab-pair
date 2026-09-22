/**
 * Represents a student in the academic system.
 */
public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getInfo() {
        return name + " (ID: " + studentId + ")";
    }
}
