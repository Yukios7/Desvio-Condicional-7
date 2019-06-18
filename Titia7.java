package EDNA7;

import java.util.Scanner; 

public class Titia7 {

	public static void main(String[] args) {
		
		Scanner osh = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n1 = osh.nextInt();
		System.out.println("Digite um número: ");
		int n2 = osh.nextInt();
		System.out.println("Escolha um operador, Obs: 0 para soma, 1 para subtração, 2 para divisão e 3 para multiplicação: ");
		int R0 = osh.nextInt();
		
		if (R0==0) {
			System.out.println(n1+n2);
			}
		else if (R0==1) {
			System.out.println(n1-n2);
		}
		else if (R0==2) {
			System.out.println(n1/n2);
		}
		else if (R0==3)	{
			System.out.println(n1*n2);
		}
		else {
			System.out.println("Este operador não é valido!!! ");
		}
			
	}

}
