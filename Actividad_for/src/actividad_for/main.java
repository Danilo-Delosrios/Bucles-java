package actividad_for;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<String>lista_nombres = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int opcion;
        
        for(int i = 0;i<50;i++){
            System.out.println("--Menu--");
            System.out.println("1. Agregar nombre");
            System.out.println("2. Eliminar nombre");
            System.out.println("3. Actualizar nombre");
            System.out.println("4. Mostrar nombres");
            System.out.println("5. --Salir-- ");
            System.out.println("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion){
                case 1:
                    System.out.println("Digita el nombre: ");
                    String agregar_nombre = entrada.nextLine();
                    lista_nombres.add(agregar_nombre);
                    System.out.println("Nombre agregado");
                    break;
                    
                case 2:
                    System.out.println("Ingresa el nombre a eliminar: ");
                    String eliminar_nombre = entrada.nextLine();
                   if (lista_nombres.remove(eliminar_nombre)){
                    System.out.println("Nombre eliminado");
                   }
                   else{
                       System.out.println("Nombre no encontrado");
                   }
                    break;
                    
                case 3:
                    System.out.println("Ingresa el nombre que quieres actualizar: ");
                    String actualizar_nombre = entrada.nextLine();
                    int index = lista_nombres.indexOf(actualizar_nombre);
                    if (index != -1){
                        System.out.println("Ingresa el nuevo nombre: ");
                        String nuevo_nombre = entrada.nextLine();
                        lista_nombres.set(index,nuevo_nombre);
                        System.out.println("Nombre actualizado");
                    }
                    else {
                        System.out.println("Nombre no encontrado");
                    }
                    break;
                    
                case 4:
                    for(String nombre : lista_nombres){
                        System.out.println(nombre);
                    }
                    break;
                    
                case 5:
                    System.out.println("By Danilo De los rios");
                    System.out.println("Saliendo...");
                    return;
            }
        
    }
    }
    
}
