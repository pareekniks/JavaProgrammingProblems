package CodingProblems;

public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = { 3, 1, 2, 4, 6, 5, 8, 9 }; 
		
		int num=9;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==num) {
				System.out.println("Number matched at "+ i);
				break;
			}
		}

	}

}
