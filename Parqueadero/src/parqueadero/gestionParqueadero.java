package parqueadero;

import java.util.ArrayList;
import java.util.Date;

public class gestionParqueadero {
public Vehiculo vehiculo; 
private ArrayList<Vehiculo> registroVehiculo = new ArrayList<Vehiculo>();
	
    public ArrayList cargarDatosDeArriendo() {
      
	ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	vehiculo = new Vehiculo("Carro", "GRE123", 1, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);	
	vehiculo = new Vehiculo("Carro", "AHG751", 2, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);
	vehiculo = new Vehiculo("Carro", "AYE453", 3, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);
	vehiculo = new Vehiculo("Moto", "GBW11C", 4, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);
	vehiculo = new Vehiculo("Moto", "HFS48D", 5, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);
	vehiculo = new Vehiculo("Moto", "FAG45F", 6, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);
	vehiculo = new Vehiculo("Bicicleta", "1001457845", 7, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);
	vehiculo = new Vehiculo("Bicicleta", "52487954", 8, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);
	vehiculo = new Vehiculo("Bicicleta", "1024578945", 9, "23-11-2021", "00:00");
	vehiculos.add(vehiculo);
        
        
        return vehiculos;
    }
    
    public void pagarMensualidad(int parqueadero) {
    	
    	if(parqueadero-1 > cargarDatosDeArriendo().size()){
            System.out.println("El parqueadero ingresado no se encuentra arrendado");
        }
        
        for (int i = 0; i < cargarDatosDeArriendo().size(); i++) {
            if (i == parqueadero-1) {
                System.out.println("Su pago se realizó exitosamente");
            }
        }
    
    }
    
    
    public void mostrarReporteMensualidad() {
    	for (int i = 0; i < cargarDatosDeArriendo().size() ; i++) {
            
            System.out.println(cargarDatosDeArriendo().get(i).toString());
    	}
    }
    
    public ArrayList registrarVehiculo(String tipoCarro, String placa, int parqueadero, String fecha, String hora) {
        
        if (tipoCarro.equals("Bicicleta")) {
        	registroVehiculo.add(new Bicicleta(tipoCarro, placa, parqueadero, fecha, hora));
        }else if(tipoCarro.equals("Moto")) {
        	registroVehiculo.add(new Moto(tipoCarro, placa, parqueadero, fecha, hora));
        }else{	
        	registroVehiculo.add(new Carro(tipoCarro, placa, parqueadero, fecha, hora));
        } 
        return registroVehiculo;
    }
        
    
    public void mostrarReporteRegistroDiario() {
    	//for (int i = 0; i < registroVehiculo.size(); i++) {
    	System.out.println( "| Tipo Vehiculo | Placa/Id | Numero Parq | Fecha | Hora Entrada |");
        for ( Vehiculo vehiculo : registroVehiculo ) {
            System.out.println(vehiculo.beautifullView());
        
    	}
    }

	public ArrayList<Vehiculo> getRegistroVehiculo() {
		return registroVehiculo;
	}
	public void mostrarPrecio(String placa, Date fechaSalida){
		 for ( Vehiculo vehiculo : registroVehiculo ) {
	            if(vehiculo.getVehiculoId().equals(placa)) {
	            	
	            	if(vehiculo.getDateFecha().getHours()>= 21 && fechaSalida.getHours()<= 9){
	            		if(vehiculo.getTipoVehiculo().equals("Carro")) {
	            			System.out.println("El vehiculo debe pagar $11000"  );
	            		} else if(vehiculo.getTipoVehiculo().equals("Moto")) {
	            			System.out.println("El vehiculo debe pagar $8000" );
	            		}else{
	            			System.out.println("El vehiculo debe pagar $5000" );
	            		}
	            	}else {
	            		System.out.println("fecha de salida " + fechaSalida.toString());
		            	System.out.println("fecha de entrada " + vehiculo.getDateFecha().toString());
			            long tiempoEnMiliseg = fechaSalida.getTime() - vehiculo.getDateFecha().getTime();
			            int tiempoEnMinutos = Math.round((tiempoEnMiliseg / 1000L) / 60L) + 1 ;
			            System.out.println("El tiempo trasncurrido ha sido " + tiempoEnMinutos);
			            int values = vehiculo.valuesMinute() * tiempoEnMinutos;
			            System.out.println("El vehiculo debe pagar $" + values);
	            	}
	            	
	            	
	            }
	        
	    	}
	}
}


