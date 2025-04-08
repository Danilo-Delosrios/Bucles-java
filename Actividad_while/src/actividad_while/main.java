/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad_while;

import java.util.Scanner;

/**
 *
 * @author Danilo de los Rios
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float nota1 = 0;
        float nota2 = 0;
        float nota3 = 0;
        int opcion = 0;
        
        while(opcion != 5){
           System.out.println("--- CALCULO DE NOTA --- \n 1. Nota 1  \n 2. Nota 2  \n 3. Nota 3  \n 4. Calcular nota  \n 5. Salir");
           System.out.println("Seleccione una opcion: ");
           opcion = entrada.nextInt();

           switch (opcion ){
               case 1: 
                   System.out.println("Digita la nota 1(Si es decimal usa coma): ");
                   nota1 = entrada.nextFloat();
                   break;
                   
               case 2:
                   System.out.println("Digita la nota 2(Si es decimal usa coma): ");
                   nota2 = entrada.nextFloat();
                   break;
                   
               case 3:
                   System.out.println("Digita la nota 3(Si es decimal usa coma): ");
                   nota3 = entrada.nextFloat();
                   break;
                   
               case 4:
                   double nota_final = (nota1+nota2+nota3)/3;
                   System.out.println("La nota final es:"+nota_final);
                   break;
                   
               case 5:
                   System.out.println("Procesado finalizado");
                   break;
                   }
           }
           }
        }
        
    
    
