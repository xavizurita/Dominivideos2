package Excepcions3;
import java.util.*;

public class BB_clase {
	BB_clase(){
		}
	public static int ControlEntrada(String hh) throws Exception  {
		int numero = 0;
		
		if (hh == null) {
			System.out.println("ES UNA NULL");
			throw new Exception("La Opcio te valor NUL");	
		}
		
		if (Character.isDigit(hh.charAt(numero)) == false) {
			System.out.println("ES UNA LLETRA");	
			throw new Exception("HAS PULSAT UNA LLETRA");
		} 

		numero = Integer.parseInt(hh);
		if (numero<=0 || numero>=5) {
			System.out.println("NO ES NI 1 NI 2 NI 4");
			throw new Exception("La Opcion selecionanda no es ni 1 ni 2 ni 4");	
		}
	return numero;
	}
	
	public static int ControlEntrada2(String hh) throws Exception  {
		int numero = 0;
		
		if (hh == null) {
			System.out.println("ES UNA NULL");
			throw new Exception("La Opcio te valor NUL");	
		}
		
		if (Character.isDigit(hh.charAt(numero)) == false) {
			System.out.println("ES UNA LLETRA");	
			throw new Exception("HAS PULSAT UNA LLETRA");
		}
		
		numero = Integer.parseInt(hh);
		if (numero<=0 || numero>=4) {
			System.out.println("NO ES NI 1 NI 2 NI 3");
			throw new Exception("La Opcion selecionanda no es ni 1 ni 2 ni 3");	
		}
	return numero;
	}
	
	public static void ControlEntrada3() throws Exception  {
			System.out.println("debes elegir una opcion, NO pulsar solo intro");
	}

	
	public static int ControlEntrada11(String hh, int v1, int v2) throws Exception  {
		int numero = 0;
		
		if (hh == null) {
			System.out.println("ES UNA NULL");
			throw new Exception("La Opcio te valor NUL");	
		}
		
		if (Character.isDigit(hh.charAt(numero)) == false) {
			System.out.println("ES UNA LLETRA");	
			throw new Exception("HAS PULSAT UNA LLETRA");
		} 
		numero = Integer.parseInt(hh);
		if (numero<=v1 || numero>=v2) {
			System.out.println("NO ES NI 1 NI 2 NI 4");
			throw new Exception("La Opcion selecionanda no es ni 1 ni 2 ni 4");	
		}
	return numero;
	}
}
