class exception{
    public void excp1(){}

    public void excp2(){}

    public void excp3() throws ArithmeticException{}
}



public class ExceptionOverriding extends exception {

    //Unchecked Exception Does not throw error
    @Override
    public void excp1() throws ArithmeticException {
        super.excp1();
    }


    //A checked Exception shows error in child class override
//    @Override
//    public void excp2() throws IOException { //error
//        super.excp2();
//    }


    //Normal Override does not cause any error
    @Override
    public void excp3() throws ArithmeticException {
        super.excp3();
    }

    public static void main(String args[]) {
        
    }
}