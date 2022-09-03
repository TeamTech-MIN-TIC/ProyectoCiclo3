package com.ProyectoCiclo3.proyectociclo3;

import com.ProyectoCiclo3.proyectociclo3.entity.EntidadEmpleado;
import com.ProyectoCiclo3.proyectociclo3.entity.EntidadEmpresa;
import com.ProyectoCiclo3.proyectociclo3.entity.EntidadMovDinero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proyectociclo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyectociclo3Application.class, args);

		EntidadMovDinero movDinero = new EntidadMovDinero();
		movDinero.setMonto("35000");
		movDinero.setConcepto("Prestamo");
		movDinero.setUsuario("User1");

		System.out.println("Dinero: "+ movDinero.getMonto());
		System.out.println("Concepto: "+ movDinero.getConcepto());
		System.out.println("Usuario: "+ movDinero.getUsuario());

		EntidadEmpresa empresa = new EntidadEmpresa();
		empresa.setNomempresa("Salamanca");
		empresa.setDiremprresa("Car 12 Nro.52a - 119");
		empresa.setNitempresa("890938952-2");
		empresa.setTelempresa("6042888888");

		System.out.println("Nombre de la empresa es: "+ empresa.getNomempresa());
		System.out.println("Direccion de la empresa es: "+ empresa.getDirempresa("Car 12 Nro 52a - 119"));
		System.out.println("Nit de la empresa es: "+ empresa.getNitempresa());
		System.out.println("Telefono de la empresa es: "+ empresa.getTelempresa());

		EntidadEmpleado empleado = new EntidadEmpleado();
		empleado.setNombre("Jose Soto");
		empleado.setCorreo("pp@gmail.com");
		empleado.setEmpresa("empresa");
		empleado.setRol("Tecnico");

		System.out.println("Nombre del Empleado: "+empleado.getNombre());
		System.out.println("Correo del Empleado: "+empleado.getCorreo());
		System.out.println("Empresa del Empleado: "+empleado.getEmpresa());
		System.out.println("Rol del Empleado: "+empleado.getRol());

	}


}
