
public class palindrome {

	public static void main(String[] args) {
		palindrome p=new palindrome();
		p.ispalindrome(121);
		System.out.println(p.ispalindrome(121));

	}



	static boolean ispalindrome(int x)
	{
		int temp=x;
		int rev=0;
		
		while(x>0)
		{
			int digit=x%10;
			rev=(rev*10)+digit;
			x=x/10;
		}
		if(rev==temp)
			return true;
		
		else
			return false;
}			
	}