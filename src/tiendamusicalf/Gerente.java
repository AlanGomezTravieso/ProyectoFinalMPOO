/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendamusicalf;

public class Gerente extends Empleado {
   private String turno;

   public Gerente() {
   }

   public Gerente(String nombre, int numEmpleado, int sueldo, String turno) {
      super(nombre, numEmpleado, sueldo);
      this.turno = turno;
   }

   public String getTurno() {
      return this.turno;
   }

   public void setTurno(String turno) {
      this.turno = turno;
   }

   public String toString() {
      return super.toString() + "Gerente{" + "turno=" + this.turno + '}';
   }
}
