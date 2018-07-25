public class Calculate {
	public static void main(String[] arg) {
        	System.out.println("Calculate...");
			float first = Float.valueOf(arg[0]);
			float second = Float.valueOf(arg[1]);
			float summ = first + second;
			float matprod = first * second;
			float matdiff = first - second;
			float matdiv = first / second;
			System.out.println("Sum = " + summ);
			System.out.println("matprod = " + matprod);
			System.out.println("matdiff = " + matdiff);
			System.out.println("matdiv = " + matdiv);
        }
}