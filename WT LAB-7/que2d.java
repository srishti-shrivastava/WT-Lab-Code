public class que2d{

	public static void main(String[] args) {

		try{
			String tihString = "java101";
			int courseCode = Integer.parseInt(tihString);
		}catch(Exception e){
			System.out.println("Illegal conversion operation performed");
		}

		System.out.println("Task after exception");
	}

}