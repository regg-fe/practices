package unidad5;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class E1 {	
	public static void main(String[] args) {
		Cliente cliente[];
		Menu menu[] = new Menu[5];
		String nombre,apellido, nombreP;
		double precio;
		int cPlato[],f, m;
	
		menu[0] = new Menu("Omelette de caviar Sevruga",50,0);
		menu[1] = new Menu("Jamón ibérico Cinco Jotas",32,1);
		menu[2] = new Menu("Queso de leche de alce",48,2);
		menu[3] = new Menu("Matsukake",65,3);
		menu[4] = new Menu("Sukiyaki de Wagyu",90,4);
	
			
		f = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de personas para su reservacion: "));
		cliente = new Cliente[f];
		for	(int i = 0;i < f; i++) {
			nombre = JOptionPane.showInputDialog(i+". Digite el nombre: ");
			apellido = JOptionPane.showInputDialog(i+". Digite el apellido: ");
			cliente[i] = new Cliente(nombre,apellido);
		}
		
		System.out.println("Platillos disponibles esta noche, seleccione segun el codigo: ");
		for (int i=0; i<menu.length;i++) {
			System.out.println(menu[i].getMenu());
		}
		
		m = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos platillos desea escoger?"));
		cPlato = new int[m];
		int j = 0;
		do {
			cPlato[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del platillo: "));
			j++;
		} while(j<m);
		
		precio = 0;
		for(int i=0;i<cPlato.length;i++) {
			precio += menu[cPlato[i]].getPrecio();
		}

		System.out.println("FACTURA");
		
		System.out.println("CLIENTES");
		for (int i=0;i<cliente.length;i++) {
			System.out.println(cliente[i].getCliente());
		}
		System.out.println("PLATILLOS SOLICITADOS");
		for(int i=0;i<cliente.length;i++) {
			System.out.println(menu[cPlato[i]].getMenu());
		}
		System.out.println("TOTAL A PAGAR: "+precio);
		
 	}
}

class Cliente {
	private String nombre;
	private String apellido;
	
	public Cliente(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getCliente() {
		return "Nombre: "+nombre+", Apellido: "+apellido;
	}
}

class Menu {
	
	private String nombreP;
	private double precio;
	private int cPlato;
	
	public Menu(String nombreP, double precio, int cPlato) {
		this.nombreP = nombreP;
		this.precio = precio;
		this.cPlato = cPlato;
	}
	
	public String getMenu() {
		return "Codigo del plato: "+cPlato+", Nombre del platillo: "+nombreP+", Precio: "+precio; 
	}
	public double getPrecio() {
		return precio;
	}
	public int getCplato() {
		return cPlato;
	}
}