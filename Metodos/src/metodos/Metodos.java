package metodos;


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
    
    public static void parImpar(int a){
        if (a%2==0) {
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
    
    public static void multiplo(int a){
        if (a%10==0) {
            System.out.println("Es multiplo");
        }else{
            System.out.println("No es multiplo");
        }
    }
    //Para leer un caracter se usa variable =(char)System.in.read
    public static void mayuscula(char a){
        if (Character.isUpperCase(a)) {
            System.out.println("Es una letra mayuscula");
        }else{
            System.out.println("No es una letra mayuscula");
        }
    }
    
    public static void caracteresIguales(char a, char b){
        if (a==b) {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
    //if a>='a' && a<='z'
    public static void minuscula(char a){
        if (Character.isLowerCase(a)) {
            System.out.println("Es minuscula");
        }else{
            System.out.println("No es minuscula");
        }
    }
    
    
}