/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusicalf;

public class Acomodador extends Empleado {
   private String seccion;

   public Acomodador() {
   }

   public Acomodador(String nombre, int numEmpleado, int sueldo, String seccion) {
      super(nombre, numEmpleado, sueldo);
      this.seccion = seccion;
   }

   public String getSeccion() {
      return this.seccion;
   }

   public void setPresupuesto(String seccion) {
      this.seccion = seccion;
   }

   public String toString() {
      return super.toString() + "Acomodador{" + "Seccion=" + this.seccion + "}";
   }

   public void administrarEmpleados() {
   }

   public void modificarVenta() {
   }

   public void eliminarVenta() {
   }
}
