
public class TestTime {
	public static void main(String[] args)
	{
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		t1.print();
		System.out.println();
		t2.print();
		//divide 555550000 by 1000 to get 555,550 which is total seconds
		//555,550 / 60  = 9259 minutes
		//555,550 % 60 = 10
		
		
	}
}
