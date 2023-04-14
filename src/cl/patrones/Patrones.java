/* 
 * Desafío - Patrones - parte 1
 * Autor Claudio Mella
 * 
 * token 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
 */
package cl.patrones;
import java.util.Scanner;

public class Patrones {
static Scanner sc = new Scanner(System.in);
static int n=0;
static int i=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("Ingresa un número: ");
		n = sc.nextInt();
		
		patron1(); //se generan 3 métodos , uno por cada patron
		patron2();
		patron3();
		sc.close();
	}
	/* 
	 * Se detecta patron par e impar y se dibuja caracter correspondiente
	 *  * Pares
	 *  - Impares
	 */
	static void patron1() { 
		for(i=0;i<n;i++) {
		 if(i%2==0)
			System.out.printf("*");
		 else
			System.out.printf(".");
		}
	}
	/* 
	 * Se detecta patrón númerico con tope de grupos de 4, Se refia con % el resto
	 * de cada número comprando que:
	 * 1 = 1
	 * 2 = 2
	 * 3 = 3
	 * 0 = 4
	 */
	static void patron2() {
		System.out.println("");
		for(i=1;i<=n;i++) {
		      if(i%4==1)
			  System.out.printf("1");
		 else if (i%4==2) {
			  System.out.printf("2");
		 }
		 else if (i%4==3) {
			  System.out.printf("3");
		 }
		 else {
			  System.out.printf("4");
		 }
		}
	}
	/* 
	 * Se detecta patrón grupos de 3, Se refia con % el resto
	 * de cada número comprando que:
	 * 1 = |
	 * 2 = |
	 * 0 = *
	 * 
	 */
	static void patron3() {
		System.out.println("");
		for(i=1;i<=n;i++) {
			if(i%3==1)
				System.out.printf("|");
			 else if (i%3==2) {
				System.out.printf("|");
			 }
			 else  {
				System.out.printf("*");
			 }
			}
		}
}
