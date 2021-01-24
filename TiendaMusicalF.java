/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusicalf;

import java.util.Scanner;

public class TiendaMusicalF {
   public static void main(String[] args) {
      LimpiarPantalla limpiar = new LimpiarPantalla();
      Scanner leer = new Scanner(System.in);
      PausarPrograma pausa = new PausarPrograma();
      AdministrarEmpleados adEmp = new AdministrarEmpleados();
      System.out.println("Cargando Programa......");
      pausa.pausa();
      limpiar.limpiar();

      char opc;
      label29:
      do {
         System.out.println("A que apartado quiere ir ? ");
         System.out.println("1.- Administracion (Para gerente)");
         System.out.println("2.- Venta de productos");
         System.out.println("0.- Cerrar el programa");
         opc = leer.next().charAt(0);
         switch(opc) {
         case '0':
            System.out.println("Saliendo.......");
            break;
         case '1':
            System.out.println("Entrando a las opciones de Gerente");
            pausa.pausa();
            limpiar.limpiar();

            while(true) {
               System.out.println("Bienvenido a las opciones del Gerente");
               System.out.println("Las opciones son: ");
               System.out.println("1.-Agregar Empleado");
               System.out.println("2.-Eliminar Empleado");
               System.out.println("3.-Buscar Empleado");
               System.out.println("0.-Salir ");
               char opcion = leer.next().charAt(0);
               switch(opcion) {
               case '0':
                  System.out.println("Saliendo......");
                  pausa.pausa();
                  limpiar.limpiar();
                  break;
               case '1':
                  System.out.println("Entrando...");
                  pausa.pausa();
                  limpiar.limpiar();
                  adEmp.crearNuevoEmpleado();
                  break;
               case '2':
                  System.out.println("Entrando...");
                  pausa.pausa();
                  limpiar.limpiar();
                  adEmp.eliminarEmpleado();
                  break;
               case '3':
                  System.out.println("Entrando...");
                  pausa.pausa();
                  limpiar.limpiar();
                  adEmp.buscarEmpleado();
                  break;
               default:
                  System.out.println("Opción no válida ");
                  pausa.pausa();
                  limpiar.limpiar();
               }

               if (opcion == '0') {
                  continue label29;
               }
            }
         case '2':
            System.out.println("Hola 2");
            break;
         default:
            System.out.println("Opción no válida ");
            pausa.pausa();
            limpiar.limpiar();
         }
      } while(opc != '0');

   }
}
