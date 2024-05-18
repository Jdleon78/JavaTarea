package tareajava;

import java.util.Scanner;

/**
 *
 * @author Janeth
 */
public class VariosEjercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
      
        do {
        System.out.println("Seleccione el ejercicio que desea ejecutar:");
        System.out.println("1. Mayor de Edad");
        System.out.println("2. Mayor de Dos Números");
        System.out.println("3. Par o Impar");
        System.out.println("4. Factorial con While");
        System.out.println("5. Impares con For");
        System.out.println("6. Impares con While");
        System.out.println("7. Nombre del Día de la Semana");
        System.out.print("Ingrese el número correspondiente al ejercicio: ");
          opcion = scanner.nextInt();
      

        switch(opcion) {
            case 1:
                MayorDeEdad();
                break;
            case 2:
                MayorDeDosNumeros();
                break;
            case 3:
                ParImpar();
                break;
            case 4:
                Factorial();
                break;
            case 5:
                Impares();
                break;
            case 6:
                ImpareW();
                break;
            case 7:
                NombreDiaSemana();
                break;
            default:
                System.out.println("Opción inválida.");
       }
        } while (opcion!= 8);
    }

    public static void MayorDeEdad() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }
    public static void MayorDeDosNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El primer numero es mayor: " + numero1);
        } else {
            System.out.println("El segundo numero es mayor: " + numero2);
        }
    }
        public static void ParImpar() {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero ingresado es par.");
        } else {
            System.out.println("El numero ingresado es impar.");
        }
    }
         public static void Factorial() { 
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero para calcular su factorial:");
        int numero = scanner.nextInt();
        
        int factorial = 1;
        int contador = 1;
        
        while (contador <= numero) {
            factorial *= contador;
            contador++;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial);
    
}
        public static void Impares() { 
         Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero mayor a 10 y menor que 30:");
        int numero = scanner.nextInt();
        
        if (numero > 10 && numero < 30) {
            System.out.println("Números impares desde 1 hasta " + numero + ":");
            for (int i = 1; i <= numero; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("El número ingresado no cumple con las condiciones.");
        }
    }
           public static void ImpareW() { 
           Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero mayor a 10 y menor que 30:");
        int numero = scanner.nextInt();
        
        if (numero > 10 && numero < 30) {
            System.out.println("Números impares desde 1 hasta " + numero + ":");
            int i = 1;
            while (i <= numero) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println();
        } else {
            System.out.println("El número ingresado no cumple con las condiciones.");
        }
 }
        public static void NombreDiaSemana() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 5 para obtener el nombre del día de la semana:");
        int NumeroDia = scanner.nextInt(); 
        }
}