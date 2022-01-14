/**
 * 
 * Author Pau Robusté 
 * 
 */
public class DosVariablesApp {

	public static void main(String[] args) {
		
		int x = 5;
		int y = 10;
		double n = 2.6;
		double m = 1.6;
		
		System.out.println("Suma de x + y es:"+(x+y));
		System.out.println("Resta de x - y es:"+(x-y));
		System.out.println("Producto de x * y es:"+(x*y));
		System.out.println("Cociente de x / y es:"+(x/y));
		System.out.println("Resto de x % y es:"+(x%y));
		System.out.println("Suma de n + m es:"+(n+m));
		System.out.println("Resta de n - m es:"+(n-m));
		System.out.println("Producto de n * m es:"+(n*m));
		System.out.println("Cociente de n / m es:"+(n/m));
		System.out.println("Resto de n % m es:"+(n%m));
		System.out.println("Suma de x + n es:"+(x+n));
		System.out.println("Cociente de y / m es:"+(y/m));
		System.out.println("Resto de y % m es:"+(y%m));
		System.out.println("El doble de cada variable:");
		System.out.println("x: "+(x*2));
		System.out.println("y: "+(y*2));
		System.out.println("n: "+(n*2));
		System.out.println("m: "+(m*2));
		System.out.println("La suma de todas las variable: "+(x+y+n+m));
		System.out.println("El producto de todas las variables: "+(x*y*n*m));

	}

}