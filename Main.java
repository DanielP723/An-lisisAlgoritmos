
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //1
        String input; //1
        boolean next = true; //1
        while (next == true) //1
        {
            System.out.println("Ingrese la frase"); //1
            input = sc.next(); //1
            if (isPalindrome(input)) { //1
                System.out.println("Es palíndromo"); //1
            } else{
                System.out.println("No es palíndromo");
            }
            System.out.println("Quiere seguir? 1=Si,2=No"); //1
            int continuar = sc.nextInt(); //1
            if (continuar == 2){ //1
                next = false; //1
            }
        }
        sc.close(); //1
    }
    
    public static boolean isPalindrome(String input) 
        {
        int start = 0; //1
        int end = input.length() - 1; //1
        boolean PFalse = false; //1
        while ((start < end) && (!PFalse)) { //n/2
            if (input.charAt(start) == input.charAt(end)) { //1
                start++; //1
                end--; //1
            } else {
                PFalse = true;
            }
        }
        return !PFalse; //1
    }
}