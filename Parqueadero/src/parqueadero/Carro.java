package parqueadero;

public class Carro extends Vehiculo{

    public Carro(String tipoVehiculo, String vehiculoId, int numParqueadero, String fecha, String horaEntrada) {
        super(tipoVehiculo, vehiculoId, numParqueadero, fecha, horaEntrada);
    }

	@Override
	public int valuesMinute() {
		// TODO Auto-generated method stub
		return 50;
	}




}
