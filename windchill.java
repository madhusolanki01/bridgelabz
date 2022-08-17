package functionalprogram;

public class windchill{
	
	public static void main(String args[]) {
		double t=90;
        double v=70;
        double w= 35.74 + 0.6215 * t +(0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println(w);
	}
}