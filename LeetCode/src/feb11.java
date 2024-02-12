
public class feb11 {
	public static int isPalindrome(int x) {
		 int sum=0,target=x;
	   if(x<0)
		   return 0;
	   
	   while(x>0)
	   {
		  
		   int temp=x%10;
		   x=x/10;
		   sum=sum*10+temp;
	   }
	   if(sum==target)
		   return 1;
	   
	}
	public static void main(String ag[]) {
		 isPalindrome(121);
	}

}