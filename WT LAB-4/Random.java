public class Random {
    static int objNumber;

    public Random() {
        objNumber++;
    }

    public static int getObjNumber() {
        return objNumber;
    }

    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(Random.getObjNumber());

        Random random1 = new Random();

        System.out.println(Random.getObjNumber());

        Random random2 = new Random();

        System.out.println(Random.getObjNumber());

        Random random3 = new Random();

        System.out.println(Random.getObjNumber());

        Random random4 = new Random();

        System.out.println(Random.getObjNumber());

        Random random5 = new Random();

        System.out.println(Random.getObjNumber());

        Random random6 = new Random();

        System.out.println(Random.getObjNumber());

        

    }
    
}
