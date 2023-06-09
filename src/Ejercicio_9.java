/* Escribir un programa que mientras que el usuario ingrese un carácter dígito o carácter letra minúscula,
 imprima si es carácter dígito o carácter letra minúscula, y si es letra minúscula imprimir si es vocal o consonante.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Ejercicio_9 {
    public static void main(String[] args) {
        char c;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        try {
            do {
                System.out.println("Ingrese un caracter: ");
                c = entrada.readLine().charAt(0);
                if (c>='0'&& c<='9') {
                    System.out.println("El caracter " + c + " es digito");
                }
                else if(c>='a'&&c<='z'){
                    if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
                        System.out.println("El caracter " + c + " es vocal");
                    }
                    else{
                        System.out.println("El caracter " + c + " es consonante");
                    }
                }

            }
            while ((c>='0'&& c<='9')||(c>='a'&&c<='z'));
        } catch (Exception exc) {
            System.out.println(exc);
        }
    }
}
