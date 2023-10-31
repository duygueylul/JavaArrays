package JavaTemel;

import java.util.Scanner;
public class JavaArrays {

	public static void main(String[] args) {
	
		int i,s = 0;
		int array[] = new int[5];
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("5 Tane Sayı Giriniz: ");
		for(i = 0; i < 5; i++) {
			array[i] = scan.nextInt();
		}
	
	    for(i = 0; i < 5; i++) {
	    	s = s + array[i];
	    }
	    System.out.println("\nDizideki tüm elemanların toplamı: " + s);
	
	
	}
	

}
