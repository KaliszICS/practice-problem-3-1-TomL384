public class PracticeProblem {

	public static void main(String args[]) { }

	public static String evenOrOdd (int int1)  {  
		if (int1 % 2 == 0){
			return "Even" ;
		}
		return "Odd";
	}

	public static String teacherOrStudent (String v1){
		if (v1.equals("Kalisz")){
			return "Teacher";
		}
		return "Student";
	}

	public static int fartherFromZero (int int1){
		if (int1 > 0){
			int1= int1 + 5 ;
		}
		if (int1 < 0){
			int1 = int1 - 5 ;
		}  
		return int1 ; 
		 }
		

	

}
