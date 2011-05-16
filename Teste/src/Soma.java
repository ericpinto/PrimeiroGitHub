import java.util.*;
import java.util.InputMismatchException;

	public class Soma
	{
	public static int quociente(int numerador, int denominador)
	{
		int result=0;
		
			result=numerador/denominador;
		
		
		return (result);
		
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean keepLoop=true;
		
	do{	
	try{	
	System.out.println("Coloque um numerador");
	int numerador=sc.nextInt();
	System.out.println("Coloque um denominador");
	int denominador=sc.nextInt();
	int resultado= quociente(numerador, denominador);
	System.out.printf("\n %d / %d = %d\n",numerador , denominador, resultado);
	keepLoop=false;
	}
	catch( InputMismatchException i){
		System.err.printf("\n Exception: %s\n", i);
		sc.nextLine(); 
		System.out.println("\nIsso não é um numero. Digite novamente\n");
	}
	catch(ArithmeticException e)
	{
	System.err.printf("\n Exception : %s\n", e);	
	System.out.println("\nZero e um denominador invalido. Tente de novo.\n");	
	}
	}while(keepLoop);
	}
	}
