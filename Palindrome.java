public class Palindrome {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();

		int temp;
		temp=num;
		int sum=0;
		 while(num!=0){
			int a=num%10;
	        sum=(sum*10)+a;
	        num=num/10;
		    }
		 System.out.print(sum);
		 num=temp;
		 if(num==sum){
			System.out.println("Palindrome"); 
		 }
		 else{
			 System.out.println("not a palindrome");
		 }
	}
