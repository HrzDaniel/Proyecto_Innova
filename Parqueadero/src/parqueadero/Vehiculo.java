
package parqueadero;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Vehiculo {
        private String tipoVehiculo;
        private	String vehiculoId;
		private	int numParqueadero;
        private String fecha;
        private String horaEntrada;

    public Vehiculo(String tipoVehiculo, String vehiculoId, int numParqueadero, String fecha, String horaEntrada) {
        this.tipoVehiculo = tipoVehiculo;
        this.vehiculoId = vehiculoId;
        this.numParqueadero = numParqueadero;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public String getVehiculoId() {
        return vehiculoId;
    }

    public int getNumParqueadero() {
        return numParqueadero;
    }

    public String getFecha() {
        return fecha;
    }
    
    public Date getDateFecha() {
    	Date date = new Date();
    	String[] fechaSplit = fecha.split("-");
    	
    	date.setDate( Integer.parseInt(fechaSplit[0]) );
    	date.setMonth(Integer.parseInt(fechaSplit[1])-1);
    	date.setYear( Integer.parseInt(fechaSplit[2]) -1900);

    	String[] horaSplit = horaEntrada.split(":"); 
    	date.setHours( Integer.parseInt(horaSplit[0]));
    	date.setMinutes(Integer.parseInt(horaSplit[1]));
    	
    	return date;
    }

    @Override
    public String toString() {
      String vehiculo = "tipo de vehiculo: " + tipoVehiculo + ", placa o ID " + vehiculoId + ", número del parqueadero " + numParqueadero + ", Fecha " + fecha + ", hora de entrada " + horaEntrada;    
    	return vehiculo;
    }
    
    public String beautifullView() {
        return  "|" + tipoVehiculo + "|" + vehiculoId +  "|" + numParqueadero + "|" + fecha +  "|" + horaEntrada + "|";
    }
    public int valuesMinute() {
    	
    	return 0;
    }
}
