package unidad5;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class E0 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		Productos array[];
		int f, codigo, cantidad;
		String nombre;
		double peso;
		
		f = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de articulos a agregar: "));
		array = new Productos[f];
		System.out.println("Numero de articulos a agregar: "+f);
		
		for(int i=0;i<f;i++) {
			System.out.println("Articulo: "+i);
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del producto"));
			nombre = JOptionPane.showInputDialog("Digite el nombre del producto");
			peso = Double.parseDouble(JOptionPane.showInputDialog("Digite el peso del producto"));
			cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos"));
			array[i] = new Productos(codigo,nombre,peso,cantidad);
		}
	
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}

class Productos {
	private int codigo;
	private String nombre;
	private double peso;
	private int cantidad;

	public Productos(int codigo, String nombre, double peso, int cantidad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.peso = peso;
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Producto: "+codigo+", nombre: "+nombre+", peso: "+peso+", cantidad: "+cantidad;
	}
}