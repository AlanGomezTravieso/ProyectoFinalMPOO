package tiendamusicalf;

import java.io.Serializable;

public class Empleado implements Serializable {
   private String nombre;
   private int numEmpleado;
   private int sueldo;

   public Empleado() {
   }

   public Empleado(String nombre, int numEmpleado, int sueldo) {
      this.nombre = nombre;
      this.numEmpleado = numEmpleado;
      this.sueldo = sueldo;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getNumEmpleado() {
      return this.numEmpleado;
   }

   public void setNumEmpleado(int numEmpleado) {
      this.numEmpleado = numEmpleado;
   }

   public int getSueldo() {
      return this.sueldo;
   }

   public void setSueldo(int sueldo) {
      this.sueldo = sueldo;
   }

   public String toString() {
      return "Empleado {nombre=" + this.nombre + ", numEmpleado=" + this.numEmpleado + ", sueldo=" + this.sueldo + "}";
   }

   public void aumentarSueldo(int porcentaje) {
      this.sueldo += this.sueldo * porcentaje / 100;
   }
}
