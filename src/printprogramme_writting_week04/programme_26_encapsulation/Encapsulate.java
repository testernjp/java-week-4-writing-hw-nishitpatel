package printprogramme_writting_week04.programme_26_encapsulation;

public class Encapsulate {
    // Private variables declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    // Set method for name to access private variable name
    public void setName(String name) {
        this.name = name;
    }

    // get method for Name to access private variable age
    public String getName() {
        return name;
    }

    // get method for roll to access private variable rollno
    public int getRollNo() {
        return rollNo;
    }

    // set method for roll to access private variable rollno
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    // get method for age to access private variable age
    public int getAge() {
        return age;
    }

    // set method for age to access private variables age
    public void setAge(int age) {
        this.age = age;
    }
}
