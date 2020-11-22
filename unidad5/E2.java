package unidad5;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class E2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		Conductor array[];
		int f, cedula;
		String nombre, apellido, matricula;
		double litros;
		
		f = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de conductores a agregar: "));
		array = new Conductor[f];
		System.out.println("Numero de conductores a agregar: "+f);
		
		for(int i=0;i<f;i++) {
			System.out.println("Articulo: "+i);
			cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del conductor"));
			nombre = JOptionPane.showInputDialog("Digite el nombre del conductor: ");
			apellido = JOptionPane.showInputDialog("Digite el apellido del conductor: ");
			matricula = JOptionPane.showInputDialog("Digite la matricula del vehiculo: ");
			litros = Double.parseDouble(JOptionPane.showInputDialog("Digite los litros a llenar: "));
			array[i] = new Conductor(cedula,nombre,apellido,matricula,litros);
		}
	
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}

class Conductor {
	private int cedula;
	private String nombre,apellido, matricula;
	private double litros;
	
	public Conductor(int cedula, String nombre, String apellido, String matricula, double litros) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.matricula = matricula;
		this.litros = litros;
	}
	@Override
	public String toString() {
		return "Cedula: "+cedula+", nombre: "+nombre+", apellido: "+apellido+", matricula: "+matricula+
				", litros: "+litros;
	}
}