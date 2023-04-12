package week3.day3;

public  class LeStatic {

	static int x=5;
	int y=5;
	
	public static void incr() {
		x=x+5;
	}
	
	public void refer() {
		y=y+5;
	}
	
	public static void main(String[] args) {
		
		LeStatic ls= new LeStatic();
		System.out.println(ls.y);
	System.out.println(x);
	ls.refer();
	System.out.println("y->"+ls.y);
	incr();
	System.out.println("x->"+x);
	
	System.out.println("---------------");
	LeStatic ls2= new LeStatic();
	
	ls2.refer();
	System.out.println("y->"+ls.y);
	incr();
	System.out.println("x->"+x);
	System.out.println("--------------");

	LeStatic ls3= new LeStatic();
	ls3.refer();
	System.out.println("y->"+ls.y);
	incr();
	System.out.println("x->"+x);
	System.out.println("--------------");
	LeStatic ls4= new LeStatic();
	ls4.refer();
	System.out.println("y->"+ls.y);
	incr();
	System.out.println("x->"+x);
	
	}

}
