package unidad5;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class E3 {

	public static void main(String[] args) {
		Paciente pacientes[] = new Paciente[2];
		Paciente aPacientes[];
		String rpt, nombre, apellido, diagnostico, tratamiento, doctor;
		int p, f, cedula;
		boolean estatus = true;
		
		pacientes[0] = new Paciente("Robert","Gonzalez","Cancer (Garganta)","Quimioterapia","Felipe",27663425,true);
		pacientes[1] = new Paciente("Aida","Velazques","Covid-19","No definido","Escobar",7885321,false);
		
		rpt = JOptionPane.showInputDialog("¿Desea ver los casos existentes?(Si/No)");
		if (rpt.equalsIgnoreCase("Si")) {
			for (int i=0;i<pacientes.length;i++) {
				System.out.println("Paciente "+i+":");
				System.out.println(pacientes[i].getDatosPaciente());
				System.out.println(pacientes[i].getDiagnostico());
				System.out.println(pacientes[i].getEstatus());
			}
			rpt = JOptionPane.showInputDialog("¿Desea dar de alta a alguno de los casos?(Si/No)");
			if (rpt.equalsIgnoreCase("Si")) {
				p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del caso: "));
				pacientes[p].getDatosPaciente();
				String a = pacientes[p].getEstatus();
				if (a.equalsIgnoreCase("Ingresado")) {
					pacientes[p].setEstatus(a);
					System.out.println("Para utilizar otra opcion, debera reinicar el programa");
				}
			}
		} else {
			rpt = JOptionPane.showInputDialog("¿Desea agregar alguno?(Si/No)");
			if (rpt.equalsIgnoreCase("Si")) {
				f = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de pacientes: "));
				aPacientes = new Paciente[f];
				for (int i=0;i<f;i++) {
					nombre = JOptionPane.showInputDialog("Nombre del paciente: ");
					apellido = JOptionPane.showInputDialog("Apellido del paciente: ");
					cedula = Integer.parseInt(JOptionPane.showInputDialog("Cedula del paciente: "));
					diagnostico = JOptionPane.showInputDialog("Diagnostico: ");
					tratamiento = JOptionPane.showInputDialog("Tratamiento del paciente: ");
					doctor = JOptionPane.showInputDialog("Nombre del doctor: ");
					aPacientes[i] = new Paciente(nombre,apellido,diagnostico,tratamiento,doctor,cedula,estatus);
					System.out.println("Paciente "+i+" ingresado con exito...");
				}
				
				for (int i=0;i<aPacientes.length;i++) {
					System.out.println("Paciente "+i+":");
					System.out.println(aPacientes[i].getDatosPaciente());
					System.out.println(aPacientes[i].getDiagnostico());
					System.out.println(aPacientes[i].getEstatus());
				}
				System.out.println("Para utilizar otra opcion, debera reinicar el programa");
			} else {
				System.out.println("\n Reinicia el programa para utilizar otras opciones");
			}
		}
	}
}

class Paciente {
	private String nombre, apellido, diagnostico, tratamiento, doctor;
	private int cedula;
	private boolean estatus;
		 
	public Paciente(String nombre, String apellido, String diagnostico, String tratamiento, 
					String doctor, int cedula, boolean estatus) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.diagnostico = diagnostico;
		this.tratamiento = tratamiento;
		this.doctor = doctor;
		this.cedula = cedula;
		this.estatus = estatus;
	}
	
	public void setEstatus(String estatus) {
		if	(estatus.equalsIgnoreCase("Ingresado")) {
			this.estatus = false;
			System.out.println("Dando de alta...");
		} else {
			System.out.println("Este paciente ya fue dado de alta");
		}
	}
	
	public String getDatosPaciente() {
		return "Nombre: "+nombre+" Apellido: "+apellido+" Cedula: "+cedula;
	}
	
	public String getDiagnostico() {
		return "Diagnostico: "+diagnostico+" Tratamiento: "+tratamiento+" Doctor: "+doctor;
	}

	public String getEstatus() {
		if (estatus == true) {
			return "Ingresado";
		} else {
			return "Dado de Alta";
		}
	}
}
