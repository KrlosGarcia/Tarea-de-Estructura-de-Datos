import java.util.Stack;

public class VerificarParentesis {

	public static void main(String[] args) {
		
		System.out.println("VERIFICACION DE PARENTESIS Y CORCHETES");
		System.out.println("\n");
		String cadenaParentesis = "(Cadena equilibrada en parentesis ((a+b)*5) - 7)";
		System.out.println("Cadena de Parentesis correcta: ((a+b)*5) - 7)");
		System.out.println("Cadena de Corchetes incorrecta: 2*[(a+b)/2.5 + x - 7*y)");
		System.out.println("\n");
		System.out.println("LA VERIFICACION DE cadenaParentesis DA COMO RESULTADO " + "'" + verificarExpresion(cadenaParentesis) + "'");
		String cadenaCorchetes = "(Cadena no equilibrada en corchetes  2*[(a+b)/2.5 + x - 7*y)";
		System.out.println("LA VERIFICACION DE cadenaCorchetes DA COMO RESULTADO " + "'" + verificarExpresion(cadenaCorchetes) + "'");
	}
	public static boolean verificarParentesis (String cadena) {
		Stack<String> pila = new Stack<String>();
		int i = 0;
		while(i < cadena.length()) {
			if (cadena.charAt(i) == '(') {
				pila.push("(");
			}
			else if (cadena.charAt(i) == ')') {
				if(!pila.empty()) {
					pila.pop();
				}
				else {
					pila.push(")");
					break;
				}
			}
			i++;
		}
		if (pila.empty()) 
			return true;
		else
			return false;
		}
//-----------------------------------------------------------------------------------------------------------
	public static boolean verificarCorchetes (String cadena) {
		Stack<String> pila = new Stack<String>();
		int i = 0;
		while(i < cadena.length()) {
			if (cadena.charAt(i) == '[') { 
				pila.push("["); 
			}
			else if (cadena.charAt(i) == ']') {
				if(!pila.empty()) {
					pila.pop();
				}
				else {
					pila.push("]");
					break;
				}
			}
			i++;
		}
		if (pila.empty()) 
			return true;
		else
			return false;
		}
	
	public static boolean verificarExpresion (String cadena) {
		return verificarParentesis(cadena) == true & verificarCorchetes(cadena) == true;		
	}
}
