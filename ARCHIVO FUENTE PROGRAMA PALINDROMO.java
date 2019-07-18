package aplicacion.ing.soft;

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
        String Palabra = "anallevaalosolaavellana";
        
        if (Palindromo(Palabra) == true)
        {
            System.out.printf("La frase \"%s\" es un palindromo%n", Palabra);
        }else
        {
            System.out.printf("La frase \"%s\" no es un palindromo%n", Palabra);
        }
    
    }
    
}
