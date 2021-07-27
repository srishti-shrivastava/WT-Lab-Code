public class que2c {

	public static void main(String[] args) {
		
		try{
		String tihString = null;
		System.out.println("length of String = "+ tihString.length());	
		}catch(NullPointerException e){
			System.out.println("Performing operation on null reference");
		}
		
		System.out.println("Task after exception handling");
	}

}