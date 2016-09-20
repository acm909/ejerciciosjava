
package principal;
import java.util.Scanner;


public class Ejercicio1 {

  
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int n=sc.nextInt();
        if (primo(n)){
            System.out.println("El numero " +n +" es un numero primo");
        }
        else{
            System.out.println("El numero " +n +" no es un numero primo");
        }
               
    }
    public static boolean primo(int n){
        int a=0;
        for (int i=2;i<n;i++){
            if (n%i==0){
                a++;
                
            }
            
        }
        if (a<1){
            return true;
        }
        else {
            return false;
        }
        
    }
    
}
