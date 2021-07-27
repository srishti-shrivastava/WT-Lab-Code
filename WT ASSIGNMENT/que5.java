import java.util.*;
class plate{
    int l2,w2;
    plate(int length,int width){
     l2=length;
     w2=width;
     System.out.println("plate constructor\nlength="+length+" width="+w2);
    }
}
class box extends plate {
    int l1,w1,h1;
    box(int length,int width,int height){
      super(length,width);
      l1 = length;
      w1=width;
      h1=height;
      System.out.println("box constructor\nlength=" + l1 +" width=" + w1 + " height=" + h1);
    }
}
class woodbox extends box{
    int l,w,h,t;
  woodbox(int length,int width,int height,int thick){
    super(length,width,height);
    l=length;
    w=width;
    h=height;
    t=thick;
    System.out.println("woodbox constructor\nlength=" + l +" width=" + w + " height=" + h + " thick=" + t);
    
  }
}
public class que5 {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
        int length,width,height,thick;
    System.out.println("Enter length");
    length=scan.nextInt();
    System.out.println("Enter width");
    width=scan.nextInt();
    System.out.println("Enter height");
    height=scan.nextInt();
    System.out.println("Enter thickness");
    thick=scan.nextInt();
    woodbox obj=new woodbox(length,width,height,thick);

    scan.close();
    }
    
}