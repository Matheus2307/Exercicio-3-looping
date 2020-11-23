
package fahrenheit_matheussilva;
import java.util.Scanner;
public class Fahrenheit_MatheusSilva {

  
    public static void main(String[] args) {
         Scanner entrada;
         double i,tempC,tempF;
         
         entrada = new Scanner(System.in);
         
         System.out.print("Digite a temperatura em celsius:");
         tempC = entrada.nextDouble();
         
         tempF = (tempC*1.8)+32;
         i=tempF;
         
         while(i<=100)
         {
          System.out.println(i);
            i=i+10;
            
            
         }
    }
    
}
