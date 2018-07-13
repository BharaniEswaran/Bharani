public class Prp8 {
	public static void main(String[] args){
		Scanner sv=new Scanner(System.in);
		char ch=sv.next().charAt(0);
	
		//char ch=sv.next().charAt(0);
		if(( ch>=65 && ch<=90) ||(ch>=97 && ch<=122)){
		
			System.out.println("Alphabets");	
			
		}
		
		else if(ch>=48 && ch<58){
			System.out.println("Digits");
		}
		
		else{
			System.out.print("Special characters");
		}
	}
