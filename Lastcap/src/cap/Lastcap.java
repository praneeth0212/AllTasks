package cap;

public class Lastcap {
	
	public static void main(String[] args) {
		
	String s="iam hungry today";
	System.out.println(convertToLastcap(s));
	}

	public static String convertToLastcap(String s) {
	String ar[]= s.split(" ");
	int i;
	StringBuilder sb=new StringBuilder();
	for (int w = 0; w < ar.length; w++) {
		i=ar[w].length()-1;
		sb.append(ar[w].substring(0,i)).append(Character.toUpperCase(ar[w].charAt(i))).append(" ");
	}
		return sb.toString().trim();
	}
}
