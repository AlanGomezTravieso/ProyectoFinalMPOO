
public class Empleado {
	private String nombre;
	private int numEmpleado;
	private int sueldo;

    /**
     * Constructor
     */
	public Empleado() {}
	/**
	 * 
	 * @param nombre
	 * @param numEmpleado
	 * @param sueldo
	 */
    public Empleado(String nombre,int numEmpleado, int sueldo) {
	this.nombre=nombre;
	this.numEmpleado=numEmpleado;
	this.sueldo=sueldo;
     }
    /**
     * 
     * @return nombre
     */
    public String getNombre() {
    	return nombre;
    }
    /**
     * 
     * @param nombre
     */
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }
    /**
     * 
     * @return Numero de empleado
     */
    public int getNumEmpleado() {
    	return numEmpleado;
    }
    /**
     * 
     * @param numEmpleado
     */
    public void setNumEmpleado(int numEmpleado) {
    	this.numEmpleado=numEmpleado;
    } 
    /**
     * 
     * @return sueldo
     */
    public int getSueldo() {
    	return sueldo;
    }
    /**
     * 
     * @param sueldo
     */
    public void setSueldo(int sueldo) {
    	this.sueldo=sueldo;
    }
    /**
     * Escribe datos en pantalla
     */
    public String toString() {
    	return "Empleado {"+"nombre="+nombre+", numEmpleado="+numEmpleado+", sueldo="+sueldo+"}";
    }
    /**
     * 
     * @param porcentaje para aumentar sueldo
     */
    public void aumentarSueldo(int porcentaje) {
    	sueldo +=(int) (sueldo*porcentaje/100);
    }

}
