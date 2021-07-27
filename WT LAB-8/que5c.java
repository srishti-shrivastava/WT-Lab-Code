import java.util.*;
public class que5c {
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      String str1,str2;
      System.out.println("Enter first String");
      str1=sc.nextLine();
      System.out.println("Enter second String");
      str2=sc.nextLine();
      String s1=str1.concat(str2);
      System.out.println("concatinated String=" + s1);
      System.out.println("upper String=" + s1.toUpperCase());
      System.out.println("lower String=" + s1.toLowerCase());

      System.out.println("Equaling 1st and 2nd String " + str1.equals(str2));
      System.out.println("comparing 1st and 2nd String " + str1.compareTo(str2));

      System.out.println("finding index of 2nd string in cancatinated string " + s1.indexOf(str2));

      System.out.println("finding char at 4 " + s1.charAt(5));

      sc.close();
}
}