import java.util.Scanner;

public class Bank{
    float roi;

    public float getRoi() {
        return roi;
    }

    public void setRoi(float roi) {
        this.roi = roi;
    }

}
public abstract class BankAbs{
    float roi;

    abstract void  setRoi(float roi);

    public float getRoi() {
        return roi;
    }
}
public class HDFC extends Bank{

    @Override
    public void setRoi(float roi) {
        super.roi=roi;
    }

}
public class SBI extends BankAbs{

    @Override
    void setRoi(float roi) {
        super.roi=roi;
    }
}
public class Kotak extends Bank{
    @Override
    public void setRoi(float roi) {
        super.roi=roi;
    }
}

public static void main(String[] args) {
    float roi;
        //Hdfc

        HDFC hdfc=new HDFC();
        System.out.println("Enter Rate of Intrest HDFC: ");
        Scanner scanner=new Scanner(System.in);
        roi=scanner.nextFloat();
        hdfc.setRoi(roi);
        System.out.println("Rate of Intrest HDFC: "+hdfc.getRoi());

        //SBI
        SBI sbi=new SBI();
        System.out.println("Enter Rate of Intrest SBI: ");
        roi=scanner.nextFloat();
        sbi.setRoi(roi);
        System.out.println("Rate of Intrest SBI: "+sbi.getRoi());

        //Kotak
        Bank bank=new Kotak();
        System.out.println("Enter Rate of Intrest SBI: ");
        roi=scanner.nextFloat();
        bank.setRoi(roi);
        System.out.println("Rate of Intrest Kotak: "+bank.getRoi());

    }
}