package aplicacion.ing.soft;
import java.util.Scanner;

public class AplicacionIngSoft {

    public static boolean Palindromo(String Palabra)
    {
        for(int i=0 ; i < Palabra.length(); i++)
        {
              if (Palabra.charAt(i) != Palabra.charAt(Palabra.length() -i -1) )
              {
                  return false;
              }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        String Palabra;
        Scanner Teclado = new Scanner(System.in);
        System.out.print("Ingrese palabra:  ");
        Palabra = Teclado.next();
        
        if (Palindromo(Palabra) == true)
        {
            System.out.printf("La frase \"%s\" es un palindromo%n", Palabra);
        }else
        {
            System.out.printf("La frase \"%s\" no es un palindromo%n", Palabra);
        }
    
    }
    
}
