abstract class student {
    String name="SRISHTI";
    int roll_no=1905647;
    int regno=1010;
    public abstract void course(); 
}

class kiitian extends student {
    public void course()
    {
        System.out.println("Registered courses for " + name + " having roll no " + roll_no +" are ");
        System.out.println("WT and COA");
    }
}
public class que3 {
    public static void main(String[] args){
        kiitian obj=new kiitian();
        obj.course();
    }
}