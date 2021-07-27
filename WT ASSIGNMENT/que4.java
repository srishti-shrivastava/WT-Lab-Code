public class que4 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("programming");
        System.out.println("string: " + sb);
        System.out.println("reverse: " + sb.reverse());



        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println( sb1.equals(sb2));

        String str1=sb1.toString();
        String str2=sb2.toString();
        System.out.println(str1.compareTo(str2));

        if(sb1 == sb2)
            System.out.println("True");
        else
            System.out.println("False");

        StringBuffer sbf = new StringBuffer("KIIT Univsesddsrity");
        System.out.println(sbf);
        sbf.replace(9, 16, "ers");
        System.out.println(sbf);

        String s1 = "This is indexOf method";
        int index = s1.indexOf("method");
        System.out.println("index of substring "+index);


    }
}