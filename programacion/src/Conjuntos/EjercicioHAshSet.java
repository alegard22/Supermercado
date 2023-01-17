package Conjuntos;

import java.util.Set;

public class EjercicioHAshSet {

	public static void main(String[] args) {
		Set<String> conjuntoB = Set.of("Luis", "Ana","Ines","Beto");
		
		Set<String> conjuntoB2 = Set.of("Beto", "Luis", "Ines", "Ana");
		
		Set<String> conjuntoN = Set.of("Pedro", "Ana","Beto");
		
		System.out.println("ConjuntoB: " + conjuntoB);
		
		System.out.println("ConjuntoB2: " + conjuntoB2);
		
		System.out.println("ConjuntoN: " + conjuntoN);
		
		System.out.println("ConjuntoB luis: " + conjuntoB.contains("Luis"));	
		System.out.println("ConjuntoN luis: " + conjuntoN.contains("Luis"));
		
		System.out.println("ConjuntoB==ConjuntoN = " + conjuntoB.equals(conjuntoN));
		
		

	}

}