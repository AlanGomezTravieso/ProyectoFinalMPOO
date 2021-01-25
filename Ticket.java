import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Ticket {
	

	private String modPago;
	private String producto;
	private String costo;
	private String monTot;
	private String vendedor;
	private BufferedReader br;

	public void Impresion(){
		try {
	br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Kissteria System");
	
	System.out.println("Modo de pago: ");
	modPago=br.readLine();
	System.out.println("Producto: ");
	producto=br.readLine();
	System.out.println("Costo: ");
	costo=br.readLine();
	System.out.println("Monto total: ");
	monTot=br.readLine();
	System.out.println("Atendio: ");
	vendedor=br.readLine();
	
	System.out.println("Modo de pago: "+modPago);
	System.out.println("Productos:"+producto+"........................................$"+costo);
	//System.out.println(costo);
	System.out.println("Monto total: "+monTot);
	System.out.println("Atendio:"+vendedor);
	
	FileWriter fw=new FileWriter("ticket.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	PrintWriter salida=new PrintWriter(bw);
	
	salida.println("*************************Tienda Musica Kissteria**************************");
	salida.println("Modo de pago: "+modPago);
	salida.println("Productos:"+producto+"........................................$"+costo);
	//salida.println(costo);
	salida.println("Monto total: "+monTot);
	salida.println("Atendio:"+vendedor);
	salida.println("Gracias por su compra\n Vuelva pronto");
	
	salida.close();
	br.close();
	}catch(IOException e) {}
	}
}
