/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusicalf;

import java.io.File;
import java.util.Scanner;

public class AdministrarEmpleados {
   boolean confirmar;
   boolean seguir = true;
   char opc;
   String nombre;
   int sueldo;
   int nEmpl;
   String secc;
   Scanner leer;
   LimpiarPantalla limpiar;
   PausarPrograma pausa;
   String turno;

   public AdministrarEmpleados() {
      this.leer = new Scanner(System.in);
      this.limpiar = new LimpiarPantalla();
      this.pausa = new PausarPrograma();
   }

   public void eliminarEmpleado() {
      System.out.println("Ingrese el nombre del empleado que se quiere eliminar del registro");
      this.nombre = this.leer.nextLine();

      try {
         File archivo = new File(this.nombre + ".txt");
         if (archivo.delete()) {
            System.out.println("El empleado ha sido eliminado del registro");
         } else {
            System.out.println("No se ha borrado el empleado");
         }
      } catch (Exception var2) {
         System.out.println("Error, no se ha encontrado al Empleado");
      }

   }

   public void crearNuevoEmpleado() {
      do {
         System.out.println("Por favor, ingrese que empleado esta a punto de agregar");
         System.out.println("1.-Gerente, 2.-Acomodador, 3.-Vendedor, 0.- Salir");
         this.opc = this.leer.next().charAt(0);
         switch(this.opc) {
         case '0':
            System.out.println("Saliendo");
            this.pausa.pausa();
            this.limpiar.limpiar();
            break;
         case '1':
            System.out.println("Ingrese el nombre del Gerente: ");
            this.nombre = this.leer.next();
            System.out.println("Ingrese el sueldo de : " + this.nombre);
            this.sueldo = this.leer.nextInt();
            System.out.println("Nùmero de empleado :");
            this.nEmpl = this.leer.nextInt();
            System.out.println("Turno de trabajo: ");
            this.turno = this.leer.next();
            Gerente gt = new Gerente(this.nombre, this.nEmpl, this.sueldo, this.turno);
            Archivos geren = new Archivos();
            geren.arcGer(gt);
            geren.lecArcGer(gt);
            break;
         case '2':
            System.out.println("Ingrese el nombre del Acomodador: ");
            this.nombre = this.leer.next();
            System.out.println("Ingrese el sueldo de : " + this.nombre);
            this.sueldo = this.leer.nextInt();
            System.out.println("Nùmero de empleado:");
            this.nEmpl = this.leer.nextInt();
            System.out.println("Ingrese la sección donde trabajará : " + this.nombre);
            this.secc = this.leer.next();
            Acomodador aco = new Acomodador(this.nombre, this.nEmpl, this.sueldo, this.secc);
            Archivos ar = new Archivos();
            ar.arcAco(aco);
            ar.lecArcAco(aco);
            break;
         case '3':
            System.out.println("Ingrese el nombre del vendedor: ");
            this.nombre = this.leer.next();
            System.out.println("Ingrese el sueldo de : " + this.nombre);
            this.sueldo = this.leer.nextInt();
            System.out.println("Nùmero de empleado:");
            this.nEmpl = this.leer.nextInt();
            System.out.println("Ingrese el porcentaje de comisiones: ");
            float comi = this.leer.nextFloat();
            Vendedor vendedor = new Vendedor(this.nombre, this.nEmpl, this.sueldo, comi);
            Archivos ven = new Archivos();
            ven.arcVen(vendedor);
            ven.lecArcVen(vendedor);
            break;
         default:
            System.out.println("Opciones no válida ");
            this.pausa.pausa();
            this.limpiar.limpiar();
         }
      } while(this.opc != '0');

   }

   public void buscarEmpleado() {
      Archivos buscar = new Archivos();

      char tipo;
      do {
         System.out.println("El empleado es: ");
         System.out.println("1.-Gerente");
         System.out.println("2.-Acomodador");
         System.out.println("3.-Vendedor");
         System.out.println("0.-Regresar");
         tipo = this.leer.next().charAt(0);
         String nombre;
         switch(tipo) {
         case '0':
            break;
         case '1':
            System.out.println("Ingrese el nombre del empleado");
            nombre = this.leer.next();
            buscar.buscarGeren(nombre);
            break;
         case '2':
            System.out.println("Ingrese el nombre del empleado");
            nombre = this.leer.next();
            buscar.buscarAcom(nombre);
            break;
         case '3':
            System.out.println("Ingrese el nombre del empleado");
            nombre = this.leer.next();
            buscar.buscarVen(nombre);
            break;
         default:
            System.out.println("Opción no válida");
            this.pausa.pausa();
            this.limpiar.limpiar();
         }
      } while(tipo != '0');

   }
}