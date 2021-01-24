/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusicalf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Archivos {
   PausarPrograma pausa = new PausarPrograma();
   LimpiarPantalla limpiar = new LimpiarPantalla();

   public void arcGer(Gerente ger) {
      try {
         OutputStream is = new FileOutputStream(ger.getNombre() + ".txt");
         ObjectOutputStream gerente = new ObjectOutputStream(is);
         gerente.writeObject(ger);
         gerente.close();
         System.out.println("Registro completado. ");
      } catch (IOException var4) {
         System.err.println("Error -> " + var4.getMessage());
      }

   }

   public void arcAco(Acomodador aco) {
      try {
         OutputStream is = new FileOutputStream(aco.getNombre() + ".txt");
         ObjectOutputStream acomodador = new ObjectOutputStream(is);
         acomodador.writeObject(aco);
         acomodador.close();
         System.out.println("Registro completado. ");
      } catch (IOException var4) {
         System.err.println("Error -> " + var4.getMessage());
      }

   }

   public void arcVen(Vendedor ven) {
      try {
         OutputStream is = new FileOutputStream(ven.getNombre() + ".txt");
         ObjectOutputStream vendedor = new ObjectOutputStream(is);
         vendedor.writeObject(ven);
         vendedor.close();
         System.out.println("Registro completado. ");
      } catch (IOException var4) {
         System.err.println("Error -> " + var4.getMessage());
      }

   }

   public void lecArcAco(Acomodador aco) {
      try {
         FileInputStream os = new FileInputStream(aco.getNombre() + ".txt");
         ObjectInputStream acom = new ObjectInputStream(os);
         Acomodador acolec = (Acomodador)acom.readObject();
         this.pausa.pausa();
         this.limpiar.limpiar();
         System.out.println("Los datos almacenados son: ");
         System.out.println("Nombre: " + acolec.getNombre());
         System.out.println("N.Empleado: " + acolec.getNumEmpleado());
         System.out.println("Sueldo: " + acolec.getSueldo());
         System.out.println("Lugar de trabajo: " + acolec.getSueldo());
         this.pausa.pausa();
         this.limpiar.limpiar();
      } catch (Exception var5) {
      }

   }

   public void lecArcVen(Vendedor ven) {
      try {
         FileInputStream os = new FileInputStream(ven.getNombre() + ".txt");
         ObjectInputStream vendedor = new ObjectInputStream(os);
         Vendedor vend = (Vendedor)vendedor.readObject();
         this.pausa.pausa();
         this.limpiar.limpiar();
         System.out.println("Los datos almacenados son: ");
         System.out.println("Nombre: " + vend.getNombre());
         System.out.println("N.Empleado: " + vend.getNumEmpleado());
         System.out.println("Sueldo: " + vend.getSueldo());
         System.out.println("Porcentaje de comision: " + vend.getComisiones());
         this.pausa.pausa();
         this.limpiar.limpiar();
      } catch (Exception var5) {
      }

   }

   public void lecArcGer(Gerente ger) {
      try {
         FileInputStream os = new FileInputStream(ger.getNombre() + ".txt");
         ObjectInputStream gerente = new ObjectInputStream(os);
         Gerente geren = (Gerente)gerente.readObject();
         this.pausa.pausa();
         this.limpiar.limpiar();
         System.out.println("Los datos almacenados son: ");
         System.out.println("Nombre: " + geren.getNombre());
         System.out.println("N.Empleado: " + geren.getNumEmpleado());
         System.out.println("Sueldo: " + geren.getSueldo());
         System.out.println("Turno: " + geren.getTurno());
         this.pausa.pausa();
         this.limpiar.limpiar();
      } catch (Exception var5) {
      }

   }

   public void buscarVen(String nombre) {
      try {
         FileInputStream os = new FileInputStream(nombre + ".txt");
         ObjectInputStream vendedor = new ObjectInputStream(os);
         Vendedor vend = (Vendedor)vendedor.readObject();
         this.pausa.pausa();
         this.limpiar.limpiar();
         System.out.println("Los datos almacenados son: ");
         System.out.println("Nombre: " + vend.getNombre());
         System.out.println("N.Empleado: " + vend.getNumEmpleado());
         System.out.println("Sueldo: " + vend.getSueldo());
         System.out.println("Porcentaje de comision: " + vend.getComisiones());
         this.pausa.pausa();
         this.limpiar.limpiar();
      } catch (Exception var5) {
         System.out.println("No se ha encontrado el empleado");
      }

   }

   public void buscarGeren(String nombre) {
      try {
         FileInputStream os = new FileInputStream(nombre + ".txt");
         ObjectInputStream gerente = new ObjectInputStream(os);
         Gerente geren = (Gerente)gerente.readObject();
         this.pausa.pausa();
         this.limpiar.limpiar();
         System.out.println("Los datos almacenados son: ");
         System.out.println("Nombre: " + geren.getNombre());
         System.out.println("N.Empleado: " + geren.getNumEmpleado());
         System.out.println("Sueldo: " + geren.getSueldo());
         System.out.println("Turno: " + geren.getTurno());
         this.pausa.pausa();
         this.limpiar.limpiar();
      } catch (Exception var5) {
         System.out.println("No se ha encontrado el empleado");
      }

   }

   public void buscarAcom(String nombre) {
      try {
         FileInputStream os = new FileInputStream(nombre + ".txt");
         ObjectInputStream acom = new ObjectInputStream(os);
         Acomodador acolec = (Acomodador)acom.readObject();
         this.pausa.pausa();
         this.limpiar.limpiar();
         System.out.println("Los datos almacenados son: ");
         System.out.println("Nombre: " + acolec.getNombre());
         System.out.println("N.Empleado: " + acolec.getNumEmpleado());
         System.out.println("Sueldo: " + acolec.getSueldo());
         System.out.println("Lugar de trabajo: " + acolec.getSeccion());
         this.pausa.pausa();
         this.limpiar.limpiar();
      } catch (Exception var5) {
      }

   }
}