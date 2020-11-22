package unidad5;

import javax.swing.JOptionPane;

public class E4 {

	public static void main(String[] args) {
		Rutas rutas[] = new Rutas[3];
		Paradas paradas[] = new Paradas[4];
		Buses buses[] = new Buses[3];
		int f;
		double tiempo, velocidad, distancia, pasaje, pasajeros, total;
		rutas[0] = new Rutas("Corta",100);
		rutas[1] = new Rutas("Media",300);
		rutas[2] = new Rutas("Larga",600);
		paradas[0] = new Paradas("Linares","Diagonal a la Plaza Linares",12);
		paradas[1] = new Paradas("Falcon","Banco Bicentenario",32);
		paradas[2] = new Paradas("Miranda","Mercado Viejo",7);
		paradas[3] = new Paradas("Sucre","Diagonal a la Plaza Linares",40);
		buses[0] = new Buses("Bad boy","San Jose",23,60);
		buses[1] = new Buses("Mis Hijos","Mapegadaro",12,90);
		buses[2] = new Buses("Barriotera","Bacalao",14,120);
		
		
		
		System.out.println("Primera ruta: ");
		System.out.println(rutas[0].getRuta());
		System.out.println("Paradas de la primera ruta: ");
		System.out.println(paradas[0].getParadas());
		System.out.println(paradas[1].getParadas());
		System.out.println("Bus disponible: ");
		System.out.println(buses[0].getBus());
		
		System.out.println("Segunda ruta: ");
		System.out.println(rutas[1].getRuta());
		System.out.println("Paradas de la segunda ruta: ");
		System.out.println(paradas[0].getParadas());
		System.out.println(paradas[2].getParadas());
		System.out.println(paradas[3].getParadas());
		System.out.println("Bus disponible: ");
		System.out.println(buses[1].getBus());
		
		System.out.println("Tercera ruta: ");
		System.out.println(rutas[2].getRuta());
		System.out.println("Paradas de la tercera ruta: ");
		System.out.println(paradas[0].getParadas());
		System.out.println(paradas[1].getParadas());
		System.out.println(paradas[2].getParadas());
		System.out.println(paradas[3].getParadas());
		System.out.println("Bus disponible: ");
		System.out.println(buses[2].getBus());
		
		f= Integer.parseInt(JOptionPane.showInputDialog("Escoja la ruta a utilizar(0/1/2)"));
		if (f == 0) {
			
			velocidad = buses[0].getVelocidad();
			pasaje = buses[0].getPasaje();
			distancia = rutas[0].getDistancia();
			tiempo = velocidad/distancia;
			pasajeros = paradas[0].getPasajeros() + paradas[1].getPasajeros();
			total = pasajeros * pasaje;
			System.out.println("El bus demora en finalizar al ruta aproximadamente: "+tiempo+"m/s y"+
			" recolecta aproximadamente: "+total+"$ por recorrido en esta ruta, con "+pasajeros+" pasajeros");		
		}  else if (f == 1) {
			velocidad = buses[1].getVelocidad();
			pasaje = buses[1].getPasaje();
			distancia = rutas[1].getDistancia();
			tiempo = velocidad/distancia;
			pasajeros = paradas[0].getPasajeros() + paradas[2].getPasajeros() + paradas[3].getPasajeros();
			total = pasajeros * pasaje;
			System.out.println("El bus demora en finalizar al ruta aproximadamente: "+tiempo+"s y"+
			" recolecta aproximadamente: "+total+"$ por recorrido en esta ruta, con "+pasajeros+" pasajeros");	
		} else if (f == 2) {
			velocidad = buses[2].getVelocidad();
			pasaje = buses[2].getPasaje();
			distancia = rutas[2].getDistancia();
			tiempo = velocidad/distancia;
			pasajeros = paradas[0].getPasajeros() + paradas[1].getPasajeros() + paradas[2].getPasajeros() +
					paradas[3].getPasajeros() + paradas[4].getPasajeros();
			total = pasajeros * pasaje;
			System.out.println("El bus demora en finalizar al ruta aproximadamente: "+tiempo+"m/s y"+
			" recolecta aproximadamente: "+total+"$ por recorrido en esta ruta, con "+pasajeros+" pasajeros");
		} else {
			System.out.println("Esta ruta no esta implementada");
		}
		
	}
}

class Buses {
	private String nombre, cooperativa;
	private double pasaje, velocidad;
	
	public Buses(String nombre, String cooperativa, double pasaje, double velocidad) {
		this.nombre = nombre;
		this.cooperativa = cooperativa;
		this.pasaje = pasaje;
		this.velocidad = velocidad;
	}
	
	public String getBus() {
		return "Nombre del bus: "+nombre+" Cooperativa: "+cooperativa+" Pasaje: "+pasaje+" Velocidad: "+
				velocidad+"m/s";
	}
	
	public double getPasaje() {
		return pasaje;
	}
	public double getVelocidad() {
		return velocidad;
	}
}

class Paradas {
	private String nombre, direccion;
	private double pasajeros;
	
	public Paradas(String nombre, String direccion, double pasajeros) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.pasajeros = pasajeros;
	}
	
	public String getParadas() {
		return "Nombre de parada: "+nombre+" Direccion: "+direccion+" Pasajeros: "+pasajeros;
	}
	
	public double getPasajeros() {
		return pasajeros;
	}
}

class Rutas {
	private String nombre;
	private double distancia;
	
	public Rutas(String nombre, double distancia) {
		this.nombre = nombre;
		this.distancia = distancia;
	}
	
	public String getRuta() {
		return "Nombre de parada: "+nombre+" Direccion: "+distancia+"m Pasajeros: ";
	}
	
	public double getDistancia() {
		return distancia;
	}
}
