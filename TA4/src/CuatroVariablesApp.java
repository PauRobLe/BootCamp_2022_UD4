/**
 * 
 * Author Pau Robusté
 * 
 */
public class CuatroVariablesApp {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 8;
		int c = 16;
		int d = 32;
		
		b = c;
		c = a;
		a = d;
		d = b;
		
		System.out.println("a = "+a+"\nb = "+b+"\nc = "+c+"\nd = "+d);

	}

}