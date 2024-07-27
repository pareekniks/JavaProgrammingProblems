
public class CapitalizeString {

	public static void main(String[] args) {

		String s = "my name niks";
		String str[] = s.split(" ");
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		task:
		nik:
		for (String a: str) {

		sb = sb.append(a.substring(0, 1).toUpperCase()+a.substring(1));
		sb2 = sb2.append(a.substring(0, a.length()-1)+a.substring(a.length()-1,  a.length()).toUpperCase());
			

		}
		System.out.println(sb);
		System.out.println(sb2);

	}

}
