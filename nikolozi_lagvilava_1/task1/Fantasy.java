package midterm.nikolozi_lagvilava_1.task1;

public class Fantasy extends AbstractFantasy implements Dream {
    private String studentName = "Nikoloz Lagvilava";

    public String toString() {
        String result = "";
        result += "Student Name: " + this.studentName;
        
        return result;
    }
}
