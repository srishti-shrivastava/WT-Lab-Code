/**
 * student
 */
public class student {

    int roll;
    String name;
    void getdata()
    {
        roll=1905647;
        name="srishti";
    }
    void display()
    {
        System.out.println("Roll numbere of student is:"+roll);
        System.out.println("Name of student is:"+name);
    }
    public static void main(String[] args) {
        student s1=new student();
        s1.getdata();
        s1.display();
        
    }
}