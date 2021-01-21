
public class Acomodador extends Empleado {
	private String seccion;
	
	    public Acomodador(){
	    }
	   
	    public Acomodador(String nombre,int numEmpleado,int sueldo, String seccion) {
	    	super (nombre, numEmpleado, sueldo);
	    	this.seccion=seccion;}
	   
	    public String getSeccion() {
	    	return seccion;
	    }
	   
	    public void setPresupuesto(String seccion) {
	    	this.seccion=seccion;
	    }
	    
	    public String toString() {
	    	return super.toString()+"Acomodador{"+"Seccion="+seccion+"}";
	    }

}
