
public class StaticInner {
	
	
	static int  a=1;
	public static void main(String[] args) {
		StaticInner.inner sb= new StaticInner.inner();
		
		
	}
	
	static class inner{
		void msg() {
			System.out.println("this is the static inner class");
			System.out.println(a);
		}
		
	}

}
