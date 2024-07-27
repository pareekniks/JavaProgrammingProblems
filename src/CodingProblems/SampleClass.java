package CodingProblems;

public class SampleClass {

	public static void main(String[] args) {
		

		String ip="my name is nikhil pareek";
		
		char[] ipArray = ip.toCharArray();
		
//		System.out.println(ipArray);
		
		int j=ipArray.length-1;
		char temp='a';
		for(int i=0;i<j;) {
			
			if(!Character.isSpaceChar(ipArray[i]) && !Character.isSpaceChar(ipArray[j])  ) {
				temp=ipArray[i];
				ipArray[i]=ipArray[j];
				ipArray[j]=temp;
				i++;
				j--;	
				
			//	System.out.println(String.valueOf(ipArray));
			}
			else if(Character.isSpaceChar(ipArray[i])) {
				i++;
			}
			else if(Character.isSpaceChar(ipArray[j])) {
				j--;
			}
		}
		
		System.out.println(String.valueOf(ipArray));

	}

}
