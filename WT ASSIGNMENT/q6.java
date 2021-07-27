import java.util.*;
class WrongMarksException extends Exception{
    String s;
    WrongMarksException(String s){
      this.s=s;
    }
    public String toString(){
        return("WrongMarksException caught\n" + s);
    }
}
public class q6 { 
    static public void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        for(int i=0; i<20; i++){
            System.out.println("enter marks no" + (i+1));
            array[i]=scan.nextInt();

            scan.close();
        }

        try{
            for(int i=0; i<20;i++){
                if(array[i]<0){
                    throw new WrongMarksException("marks less than zero");
                    
                }

                else if(array[i]>100){
                    throw new WrongMarksException("marks more than 100");
                }
            }
        }
        catch(WrongMarksException e){
            System.out.println(e);
        }
    }
}
