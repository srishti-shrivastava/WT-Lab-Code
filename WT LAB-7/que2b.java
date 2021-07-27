public class que2b{

	public static void main(String[] args) {
		int[] tihArray = {2,4,6,8,10};
		
		try{
		int firstNum = tihArray[0];
		int secondNum = tihArray[1];
		int thirdNum = tihArray[2];
		int fourthNum = tihArray[3];
		int fifthNum = tihArray[4];
		int sixthNum = tihArray[5]; //Exception occurs	
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Trying to call array index that doesn't exists");
		}

		System.out.println("Next task begins");
	}

}