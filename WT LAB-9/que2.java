public class que2 {

    public static void main(String[] args)
    {

        StringBuffer str1=new StringBuffer("Java is my favorite Programming Language");
        StringBuffer str2=new StringBuffer(" Ji Haan");

        System.out.println("........\nAppend\n.......");
        str1.append(str2);
        System.out.println("Appended String= " + str1);

        System.out.println("Now, \n String 1 =" + str1 + " \n String 2 =" + str2);

        System.out.println("........\nInsert\n.......");
        str2.insert(0,str1);

        System.out.println("Inserting first string in second string= " + str2);
        System.out.println("Now, \n String 1 =" + str1 + " \n String 2 =" + str2);

        System.out.println("......Deleting......... ");
        str1.delete(11,20);
        System.out.println("Deleting some part in string= " + str1);
        System.out.println("Now, \n String 1 =" + str1 + " \n String 2 =" + str2);

        System.out.println("......Ensuring Capacity......... ");
        str1.ensureCapacity(60);
        System.out.println("Capacity ensured to 60");
        System.out.println("Now, \n String 1 =" + str1 + " \n String 2 =" + str2);

        System.out.println("......Showing Capacity......... ");
        System.out.println("Capacity of string " + str1.capacity());
        System.out.println("Now, \n String 1 =" + str1 + " \n String 2 =" + str2);

        System.out.println("......Reversing......... ");
        str1.reverse();
        System.out.println("String is reversed =" + str1);
        System.out.println("Now, \n String 1 =" + str1 + " \n String 2 =" + str2);
    }
}