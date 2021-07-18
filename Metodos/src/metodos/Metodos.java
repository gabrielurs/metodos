
import java.util.Scanner;

public class Metodos {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double centigrados;
        
        centigrados=ent.nextDouble();
        
        System.out.println(conversionKelvin(centigrados));
        System.out.println(conversionReaumur(centigrados));
       
        
        
    }
    
    public static double conversionKelvin(double a){
        return a+273.15;
    }
    
    public static double conversionReaumur(double a){
        return a*0.8;
    }
}