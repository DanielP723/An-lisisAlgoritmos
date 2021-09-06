
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean next = true;
        while (next == true) 
        {
            System.out.println("Ingrese la frase");
            input = sc.next();
            if (isPalindrome(input)) {
                System.out.println("Es palíndromo");
            } else{
                System.out.println("No es palíndromo");
            }
            System.out.println("Quiere seguir? 1=Si,2=No");
            int continuar = sc.nextInt();
            if (continuar == 2){
                next = false;
            }
        }
        sc.close();
    }
    
    public static boolean isPalindrome(String input) 
        {
        int start = 0;
        int end = input.length() - 1;
        boolean PFalse = false;
        while ((start < end) && (!PFalse)) {
            if (input.charAt(start) == input.charAt(end)) {
                start++;
                end--;
            } else {
                PFalse = true;
            }
        }
        return !PFalse;
    }
}