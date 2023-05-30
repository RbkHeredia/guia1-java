/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;
import java.util.Scanner;
/**
 *
 * @author rebek
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in); 
        //definir 6 variables
//        String name;
//        int numberPhone;
//        boolean isTall;
//        float height;
//        char lastName;
//        String pets;
//        
//        //detección de errores
//        String nombre;
//        boolean bandera;
//        char character;
        
        //ejercicio2 
        //agregar valores a las variables
        String name = "Rebeca";
        int numberPhone = 0303456;
        boolean isTall = false;
        float height = (float) 1.60;
        char lastName = 'R';
        String pets = "A dog";
        
        //detección de errores
        int numero = 48;
        double decimales = 3.55;
        boolean bandera = false;
        
        //ejercicio3
        
//        int num1 = 10;
//        int num2 = 20;
//        int suma = num1 + num2;
//        int resta = num2 - num1;
//        int contador = num1++;
//        boolean mayorQue =  num2 > num1;
        
        //ejercicio4
//        String nombre = "Rebeca";
//        String apellido = "Heredia";
//        System.out.println(nombre + " " + apellido);
        
//      ejercicio5
        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingresa tu nombre");
//        String nombre = leer.nextLine();
//
//        
//        System.out.println("Ingresa tu edad");
//        int edad = leer.nextInt();
        
        
        //ejercicio6
//        System.out.println("Ingrese dos numeros");
//        num1 = leer.nextInt();
//        num2 = leer.nextInt();
//        boolean comp1 = num1 > 25;
//        boolean comp2 = num2 > 25;
//        if (comp1 && comp2){
//            System.out.println("Ambos numeros son mayores a 25 ");    
//        } else if (comp1){
//            System.out.println("El primer numero es mayor a 25 ");
//        } else if (comp2){
//            System.out.println("El segundo numero es mayor a 25 ");
//        } else {
//            System.out.println("Ambos numeros son menores a 25");
//        }


//ejercicio7
//        System.out.println("Ingrese el tipo de motor (de 1 a 4)");
//        int tipoMotor = leer.nextInt();
//        switch (tipoMotor) {
//            case 1:
//                System.out.println("La bomba es una bomba de agua.");
//                break;
//            case 2:
//                System.out.println("La bomba es una bomba de gasolina.");
//                break;
//            case 3:
//                System.out.println("La bomba es una bomba de hormigon.");
//                break;
//            case 4:
//                System.out.println("La bomba es una bomba de pasta alimenticia.");
//                break;
//            default:
//                System.out.println("No existe un valor para esa bomba.");
      
                

//        ejercicio8
           
//          System.out.println("Ingrese un numero entre 1 y 10");
//          int num = leer.nextInt();
//          while (num > 10 || num < 1){
//              System.out.println("Incorrecto, verificar numero");
//              num = leer.nextInt();
//        }
          

//ejercicio9
//            int counter = 1;
//            int num;
//            int total = 0;
//            
//            do{
//                System.out.println("Ingrese el numero " + counter);
//                num = leer.nextInt();
//                if (num == 0 ){
//                    System.out.println("Se capturó el numero 0. Programa finalizado");
//                    break;
//                } else {
//                    total += num;
//                    counter ++;
//                }
//            } while (counter <= 20);
//            System.out.println("La suma de los numeros es: " + total);
          

            //ejercicio10
//            int n1;
//            for (int i = 0; i < 4; i++) {
//                System.out.println("Ingrese un numero del 1 al 20");
//                n1 = leer.nextInt();
//                System.out.print(n1 + " ");
//                for (int j = 0; j < n1; j++) {
//                    System.out.print("*");
//                }
//                System.out.println("");
//            }


            //ejercicio11
//        int longitud;
//        char letter;
//        String newFrase = "";
//        System.out.println("Ingrese una frase");
//        String frase = leer.nextLine();
//        longitud = frase.length();
//        for (int i = 0; i < longitud; i++) {
//            
//            switch(frase.charAt(i)){
//                case 'a':
//                    letter = '@';
//                    
//                    break;
//                case 'e':
//                    letter = '#';
//                    break;
//                case 'i':
//                    letter = '$';
//                    break;
//                case 'o':
//                    letter = '%';
//                    break;
//                case 'u':
//                    letter = '*';
//                    break;
//                default:
//                    letter = frase.charAt(i);
//            }
//            newFrase = newFrase.concat(String.valueOf(letter));
//        }
//        System.out.println(newFrase);
        

        //ejercicio12
//        int num1, num2;
//        System.out.println("Ingrese 2 numeros para saber si son multiplos");
//        num1 = leer.nextInt();
//        num2 = leer.nextInt();
//        esMultiplo(num1, num2);


        //ejercicio13 y 14
        String[] vector = new String [5];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese un nombre:");
            vector[i] = leer.nextLine();
        }
        
        for (String element : vector) {
            System.out.println(element);
        }
    }
    
    public static void esMultiplo(int num1, int num2){
        if (num1%num2 == 0){
            System.out.println("Es multiplo");
        } else {
            System.out.println("No es multiplo");
        }
    }
    
    
}


