package parqueadero;

import java.util.Date;
import java.util.Scanner;

public class Parqueadero {

	private Scanner sc = new Scanner(System.in);
	private gestionParqueadero gestionParqueadero = new gestionParqueadero();

	private void mostrarMenu() {
		System.out.println("Bienvenido, por favor seleccione la operación a realizar: "
				+ "\n1. Registro de ingreso de vehículo"
				+ "\n2. Pago de arriendo de parqueadero\n3. Registrar pago de parqueadero\n4. Ver reporte\n5. Hora de salida");
		int opcionSeleccionada = sc.nextInt();
		gestionarOpcionSeleccionada(opcionSeleccionada);
		mostrarMenu();
	}

	private void gestionarOpcionSeleccionada(int opcionSeleccionada) {
		if (opcionSeleccionada == 1) {
			System.out.println("Seleccione el tipo de vehículo: " + "\n1. Carro\n2. Moto\n3. Bicicleta");
			int seleccionVehiculo = sc.nextInt();
			ingresarDatosVehiculo(seleccionVehiculo);
		} else if (opcionSeleccionada == 2) {
			System.out.println("Ingrese el lugar de parqueo asignado al vehiculo");
			int parqueadero = sc.nextInt();
			gestionParqueadero.pagarMensualidad(parqueadero);
		} else if (opcionSeleccionada == 3) {
			System.out.println("Ingrese el lugar en el que se parqueo el vehículo");
			int lugarParqueo = sc.nextInt();
		} else if (opcionSeleccionada == 4) {
			System.out.println("Seleccione el reporte a consultar: "
					+ "\n1. Registro diario de vehículos\n2. Arriendo de parqueaderos");
			int opcionReporte = sc.nextInt();
			mostrarReportes(opcionReporte);
		} else if (opcionSeleccionada == 5) {
			
			mostrarHoraSalida();
		}

		else {
			System.err.println("La opción seleccionada no es válida");
		}
	}

	private void ingresarDatosVehiculo(int seleccionVehiculo) {
		String tipoVehiculo = null;
		System.out.println("Ingrese la placa o identificación del vehículo");
		String placa = sc.next();
		System.out.println("Ingrese el número del parqueadero");
		int parqueadero = sc.nextInt();
		System.out.println("Ingrese la fecha separada por guiones (DD-MM-AAAA)");
		String fecha = sc.next();
		System.out.println("Ingrese la hora de ingreso separada por dos puntos (00:00)");
		String hora = sc.next();
		if (seleccionVehiculo == 1) {
			tipoVehiculo = "Carro";
		} else if (seleccionVehiculo == 2) {
			tipoVehiculo = "Moto";
		} else if (seleccionVehiculo == 3) {
			tipoVehiculo = "Bicicleta";
		} else {
			System.err.println("La opción ingresada no es válida");
		}
		gestionParqueadero.registrarVehiculo(tipoVehiculo, placa, parqueadero, fecha, hora);
		gestionParqueadero.mostrarReporteRegistroDiario();
		System.out.println();
	}

	private void mostrarReportes(int opcionReporte) {
		System.out.println();
		if (opcionReporte == 1) {
			gestionParqueadero.mostrarReporteRegistroDiario();
		} else if (opcionReporte == 2) {
			gestionParqueadero.mostrarReporteMensualidad();
		} else {
			System.err.println("La opción ingresada no es válida");
		}
		System.out.println();
	}

	public void mostrarHoraSalida() {
		/**
		gestionParqueadero.mostrarReporteRegistroDiario();
		for (Vehiculo vehiculo : gestionParqueadero.getRegistroVehiculo()) {
			System.out.println(vehiculo.getVehiculoId() + "-fecha " + vehiculo.getDateFecha().getTime());
		}
		*/
		System.out.println("Registre la identificacion del vehiculo");
		String idVehiculo = sc.next();
		System.out.println("Registre la hora de salida");
		String horaSalida = sc.next();
		System.out.println("Registre la fecha de salida");
		String fechaSalida = sc.next();
		Date date = new Date();
    	String[] fechaSplit = fechaSalida.split("-");
    	
    	date.setDate( Integer.parseInt(fechaSplit[0]) );
    	date.setMonth(Integer.parseInt(fechaSplit[1])-1);
    	date.setYear( Integer.parseInt(fechaSplit[2]) -1900);

    	String[] horaSplit = horaSalida.split(":"); 
    	date.setHours( Integer.parseInt(horaSplit[0]));
    	date.setMinutes(Integer.parseInt(horaSplit[1]));
    	
    	gestionParqueadero.mostrarPrecio(idVehiculo, date);
	}

	public static void main(String[] args) {
		Parqueadero parqueadero = new Parqueadero();
		parqueadero.mostrarMenu();
	}

}