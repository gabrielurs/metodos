package metodos;
import java.util.Scanner;

public class Metodos {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        double centigrados;
        int a = 10, b = 20;

        centigrados = ent.nextDouble();

        System.out.println(conversionKelvin(centigrados));
        System.out.println(conversionReaumur(centigrados));

        MostrarDesdeMenorAMayor(a, b);
    }

    public static double conversionKelvin(double a) {
        return a + 273.15;
    }

    public static double conversionReaumur(double a) {
        return a * 0.8;
    }

    public static void parImpar(int a) {
        if (a % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }

    public static void multiplo(int a) {
        if (a % 10 == 0) {
            System.out.println("Es multiplo");
        } else {
            System.out.println("No es multiplo");
        }
    }

    //Para leer un caracter se usa variable =(char)System.in.read
    public static void mayuscula(char a) {
        if (Character.isUpperCase(a)) {
            System.out.println("Es una letra mayuscula");
        } else {
            System.out.println("No es una letra mayuscula");
        }
    }

    public static void caracteresIguales(char a, char b) {
        if (a == b) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

    //if a>='a' && a<='z'
    public static void minuscula(char a, char b) {
        if (Character.isLowerCase(a)) {
            System.out.println("La primera letra es minuscula");
        } else {
            System.out.println("La primera letra no es minuscula");
        }

        if (Character.isLowerCase(b)) {
            System.out.println("La segunda letra es minuscula");
        } else {
            System.out.println("La segunda letra no es minuscula");
        }
    }

    public static void condicional_7(char a) {
        if (Character.isDigit(a)) { //car1>='0' && car1<='9'
            System.out.println("Esta entre 0 y 9");
        } else {
            System.out.println("No esta entre 0 y 9");
        }
    }

    public static double condicional_8(double a, double b) {
        double resultado = a / b;
        return resultado;
    }

    public static void numeroMayor(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                System.out.println("El mayor es:" + a);
            } else {
                System.out.println("El mayor es: " + c);
            }
        } else if (b > c) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("El mayor es: " + c);
        }
    }

    public static void hora(int a, int b, int c) {
        if (a >= 0 && a < 24 && b >= 0 && b < 60 && c >= 0 && c < 60) {
            System.out.println("La hora es correcta");
        } else {
            System.out.println("La hora no es correcta");
        }
    }

    public static void meses(int mes) {
        if (mes == 1 && mes == 3 && mes == 5 && mes == 8 && mes == 10 && mes == 12) {
            System.out.println("tiene 31 dias");
        } else if (mes == 2) {
            System.out.println("Tiene 28 dias");
        } else {
            System.out.println("Tiene 30 dias");
        }
    }

    public static void MostrarDesdeMenorAMayor(int a, int b) {
        if (a > b) {
            System.out.println(a + " Es mayor");
            for (int i = b; i <= a; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println(b + " Es mayor");
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }

    public static void MostrarPares(int a, int b, int menor, int mayor) {
        if (a > b) {
            mayor = a;
            menor = b;
        } else {
            mayor = b;
            menor = a;
        }
        for (int i = menor; i < mayor; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    
    public static void mostrarMultiplos(int a, int b){
        for (int i = a; i < b; i++) {
            if (i%b==0) {
                System.out.println(i);
            }
        }
    }
    
    
}
