package parqueadero;

import java.util.ArrayList;

public class Factura {
	public Vehiculo vehiculo; 
	
	public void crearDatos() {
		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		vehiculo = new Vehiculo("ABZ115", 12, 17.45);
		vehiculos.add(vehiculo);
		
		vehiculo = new Vehiculo("AHG751", 17, 12.23);
		vehiculos.add(vehiculo);
		
		vehiculo = new Vehiculo("AYE453", 11, 14.30);
		vehiculos.add(vehiculo);
		
		vehiculo = new Vehiculo("GBW11C", 5, 13.33);
		vehiculos.add(vehiculo);
		
		vehiculo = new Vehiculo("HFS48D", 20, 16.57);
		vehiculos.add(vehiculo);
		
		vehiculo = new Vehiculo("FAG45F", 2, 18.12);
		vehiculos.add(vehiculo);
		
		vehiculo = new Vehiculo("1001457845", 21, 17.34);
		vehiculos.add(vehiculo);
		
		vehiculo = new Vehiculo("52487954", 22, 15.36);
		vehiculos.add(vehiculo);
		
		vehiculo = new Vehiculo("1024578945", 16, 11.15);
		vehiculos.add(vehiculo);
	}
}
