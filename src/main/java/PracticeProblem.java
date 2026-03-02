public class PracticeProblem {

	public static final int MAXIMUM = 10;
	public static void main(String args[]) {

	}

	public static int calculate(int x, int y, char z) {
		int a=0;
		switch(z) {
			case '+':
				a=x+y;
				break;
			case '-':
				a=x-y;
				break;
			case '*':
				a=x*y;
				break;
			case '/':
				a=x/y;
				break;
			case '%':
				a=x%y;
				break;
			case '^':
				a=(int)Math.pow(x,y);
				break;
		}
		return a;
	}

	public static boolean totalWordsChecker(String x) {
		x=x.replaceAll("\\(\\)", "");
		x=x.replaceAll("[^a-zA-Z_']", " ");
		String[] z=x.split(" ");
		if (z.length<=MAXIMUM) {
			return true;
		}
		else {
			return false;
		}
	}

	public static String minString (String x, String y, String z) {
		String a=x.toLowerCase();
		String b=y.toLowerCase();
		String c=z.toLowerCase();
		String d="";
		if (a.compareTo(b)<=0) {
			d=x;
		}
		else {
			d=y;
		}
		if (d.toLowerCase().compareTo(c)<=0) {
			return d;
		}
		else {
			return z;
		}
	}

}
