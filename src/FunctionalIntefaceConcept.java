
@FunctionalInterface
interface FI{
	
	void show(int a);
	
}

public class FunctionalIntefaceConcept {
	public static void main(String[] args) {
		FI obj = new FI() {
			
			@Override
			public void show(int a) {
			
				System.out.println("This is normal way to call method");
				
			}
		};
		obj.show(10);
		
		FI obj1 =a -> System.out.println("This is new way " + a);
		obj1.show(20);
	}

	
}
