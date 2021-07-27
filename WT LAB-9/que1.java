public class que1 {
    public static void main(String args[]) {
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        String s3 = "Hey, welcome to my website";
        String replaceString = s3.replace("website", "code");
        System.out.println(replaceString);

        String s4 = "program";
        System.out.println(s4.substring(0));
        System.out.println(s4.substring(3));
        String s5;

        s5 = String.join("-", "Java", "is", "fun");
        System.out.println(s5); 

        String s6 = "Javatpointtt"; 
        System.out.println("Returning words:");  
        String[] arr = s6.split("t", 0);  
        for (String w : arr) {  
            System.out.println(w);  
        }  
        System.out.println("Split array length: "+arr.length);  

    }
}