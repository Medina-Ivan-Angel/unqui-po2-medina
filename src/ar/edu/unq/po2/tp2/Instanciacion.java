package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Instanciacion {

	public static void main(String[] args) {
		
		//3 empleados permanentes
		
		EmpleadoPermanente p1 = 
				new EmpleadoPermanente("Ivan", "Calle falsa 123", false, LocalDate.of(1991, 5, 1) , 1000, 0, 5);
		
		EmpleadoPermanente p2 = 
				new EmpleadoPermanente("Julian", "Calle arroz 231", true, LocalDate.of(1998, 8, 17) , 1000, 0, 10);
		
		EmpleadoPermanente p3 = 
				new EmpleadoPermanente("Angel", "Calle verdadera 321", true, LocalDate.of(1992, 12, 10) , 1000, 3, 15);
		
		//3 empleados temporales

		EmpleadoTemporal t1 =
				new EmpleadoTemporal("Miguel", "5746", true, LocalDate.of(1978, 8, 17), 100, LocalDate.of(2025, 10, 10), 10);
		
		EmpleadoTemporal t2 =
				new EmpleadoTemporal("Laura", "1745", false, LocalDate.of(1988, 2, 19), 100, LocalDate.of(2028, 12, 11), 0);
		
		EmpleadoTemporal t3 =
				new EmpleadoTemporal("Jorge", "3336", true, LocalDate.of(1983, 2, 4), 100, LocalDate.of(2030, 5, 7), 20);
		
		//Empresa
		Empresa empresa = new Empresa();
		
		//Añadimos empleados
		empresa.addEmpleado(p1);
		empresa.addEmpleado(p2);
		empresa.addEmpleado(p3);
		empresa.addEmpleado(t1);
		empresa.addEmpleado(t2);
		empresa.addEmpleado(t3);
		
		
		//I) Calculo total de sueldo neto
		System.out.println("TOTAL SUELDO NETO: " + empresa.montoTotalNeto());
		
		
		//II) Liquidacion de sueldos
		empresa.liquidarSueldos();
		
		//Chequeamos que se hayan realizado los recibos de haberes
		for(Empleado empleado : empresa.getEmpleados()) {
			System.out.println(empleado.getReciboDeHaberes().desgloce() + "\n");
		}
		
		
		
	}
	
	
	
	
	
}
