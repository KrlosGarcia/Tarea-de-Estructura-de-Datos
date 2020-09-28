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
		MiPila = new PilaLineal(); // crea pila vac韆
		System.out.print("Ingresa la palabra/frase" + " a verificar si es pal韓dromo: ");
		palabra = entrada.readLine().toLowerCase(); // se crea la pila con los caracteres de la palabra //toLowerCase para las min鷖culas
	
		for (int i = 0; i < palabra.length(); ) {
		Character c;
		c = new Character(palabra.charAt(i++));
		MiPila.insertar(c);

		}
// se comprueba si es pal韓dromo
	comparacion = true;
	for (int j = 0; comparacion && !MiPila.pilaVacia(); ) {
		Character c;
		c = (Character) MiPila.quitar();
		comparacion = palabra.charAt(j++) == c.charValue();
		}
	MiPila.limpiarPila();
		if (comparacion)
			System.out.println("La palabra/frase " + "创"+palabra+"创" + " es un pal韓dromo " + "("+comparacion+")");
		else
			System.out.println("La palabra/frase " + "创"+palabra+"创" + " no es un pal韓dromo " + "("+comparacion+")");
		}
		catch (Exception er)
		{
			System.err.println("Excepcion: " + er);
		}
	}
}
