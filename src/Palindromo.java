import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindromo {

	public static void main(String [] a) {
		
		PilaLineal MiPila;
		char ch;
		boolean comparacion;
		String palabra;
		BufferedReader entrada = new BufferedReader(
		new InputStreamReader(System.in));
		
	try {
		MiPila = new PilaLineal(); // crea pila vac�a
		System.out.print("Ingresa la palabra/frase" + " a verificar si es pal�ndromo: ");
		palabra = entrada.readLine().toLowerCase(); // se crea la pila con los caracteres de la palabra //toLowerCase para las min�sculas
	
		for (int i = 0; i < palabra.length(); ) {
		Character c;
		c = new Character(palabra.charAt(i++));
		MiPila.insertar(c);

		}
// se comprueba si es pal�ndromo
	comparacion = true;
	for (int j = 0; comparacion && !MiPila.pilaVacia(); ) {
		Character c;
		c = (Character) MiPila.quitar();
		comparacion = palabra.charAt(j++) == c.charValue();
		}
	MiPila.limpiarPila();
		if (comparacion)
			System.out.println("La palabra/frase " + "��"+palabra+"��" + " es un pal�ndromo " + "("+comparacion+")");
		else
			System.out.println("La palabra/frase " + "��"+palabra+"��" + " no es un pal�ndromo " + "("+comparacion+")");
		}
		catch (Exception er)
		{
			System.err.println("Excepcion: " + er);
		}
	}
}
