package week3.day1;

public class ParentInh extends GrandParentInh{

	
	public void ecrHouse() {
		System.out.println("p-4bhk");
	}
	
	public static void main(String[] args) {
		
//		GrandParentInh gp= new GrandParentInh();
//		gp.ownHouse();
//		gp.ownLand();
		
		
		ParentInh p= new ParentInh();
		
		p.ecrHouse();
		p.ownHouse();
		p.ownLand();
		
	}
}
