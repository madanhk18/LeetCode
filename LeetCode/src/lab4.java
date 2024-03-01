
class mypoint
{
	int x,y;
	
	mypoint()
	{
		x=y=0;
	}
	mypoint(int a, int b)
	{
		x=a;
		y=b;
	}
	void setxy(int a,int b)
	{
		x=a;
		y=b;
	}
	int [] getxy()
	{
		return new int [] {x,y};
	}
	public String toString()
	{
		return ("X="+x+"Y="+y);
	}
	double distance(int a,int b)
	{
		return Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
		}
	double distance(mypoint another)
	{
		return distance(another.x,another.y);
	}
	double distance()
	{
		return distance(0,0);
	}
}
public class lab4 {
	public static void main(String s)
	{
		mypoint m=new mypoint();
		m.setxy(1, 2);
		System.out.println("X="+m.getxy()[0]+"Y="+m.getxy()[1]);
		
		mypoint n=new mypoint(3,4);
		System.out.println("m tostring ()"+m);
		System.out.println("n tostring ()"+n);
		System.out.println("m.distance(3,4)"+m.distance(3, 4));
		System.out.println("m.distance(n)"+m.distance(n));
		System.out.println("m.distance()"+m.distance());


	}
	
}
