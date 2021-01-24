package tiendamusicalf;

public class Vendedor extends Empleado {
   private float comisiones;

   public Vendedor() {
   }

   public Vendedor(String nombre, int numEmpleado, int sueldo, float comisiones) {
      super(nombre, numEmpleado, sueldo);
      this.comisiones = comisiones;
   }

   public float getComisiones() {
      return this.comisiones;
   }

   public void setComisiones(float comisiones) {
      this.comisiones = comisiones;
   }

   public void vender() {
   }

   public void comisiones() {
   }

   public String toString() {
      return super.toString() + "Vendedor{" + "comisiones=" + this.comisiones + '}';
   }
}