package parqueadero;

public class Moto extends Vehiculo{

    public Moto(String tipoVehiculo, String vehiculoId, int numParqueadero, String fecha, String horaEntrada) {
        super(tipoVehiculo, vehiculoId, numParqueadero, fecha, horaEntrada);
    }

	@Override
	public int valuesMinute() {
		// TODO Auto-generated method stub
		return 40;
	}
    
    

}