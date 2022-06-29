package parqueadero;

public class Bicicleta extends Vehiculo{

    public Bicicleta(String tipoVehiculo, String vehiculoId, int numParqueadero, String fecha, String horaEntrada) {
        super(tipoVehiculo, vehiculoId, numParqueadero, fecha, horaEntrada);
   
    }

	@Override
	public int valuesMinute() {
		// TODO Auto-generated method stub
		return 30;
	}
}	
    
