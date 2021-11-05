package ca.concordia.cejv416.fall2021.Class_13;

public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private String permCode;

    private static int lastId = 0;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", permCode='" + permCode + '\'' +
                '}';
    }

    //    @Override
//    public String toString()
//    {
//        return "This is a student" + firstName + lastName;
//    }

    public Student(String firstName, String lastName, String permCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.permCode = permCode;

        this.id = ++lastId;
    }

    public static void SetLastID(int newId)
    {
        Student.lastId = newId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPermCode() {
        return permCode;
    }

    public void setPermCode(String permCode) {
        this.permCode = permCode;
    }

    public int whatIsTheNextId()
    {
        return Student.lastId + 1;
    }
}
