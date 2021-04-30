package reparaFix;

import java.time.LocalDate;

public class App {
	
	public static void main(String[] args) {
		
		pruebaExc1();
		pruebaExc2();
		pruebaExc3();
		
	}
	
	public static void pruebaExc1() {
		
		Trabajador tb1 = new Trabajador("Jorge","@",new Oficio("Carpintero"),100,0.2);
		Trabajo tr1 = new Trabajo(new ServicioEstandar(new Oficio("Cerrajero"),false,100.0,0.1),LocalDate.now());
		
		try {
			tb1.agregarTarea(tr1);
			System.out.println("Hulala");
		} catch(OficioNoCoincideException e) {
			System.out.println(e.getMessage());
		}catch(AgendaOcupadaException e) {
			System.out.println(e.getMessage());			
		}
		
	}
	
	public static void pruebaExc2() {
		
		Trabajador tb1 = new Trabajador("Jorge","@",new Oficio("Carpintero"),100,0.2);
		Trabajo tr1 = new Trabajo(new ServicioEstandar(new Oficio("Carpintero"),false,100.0,0.1),LocalDate.now());
		Trabajo tr2 = new Trabajo(new ServicioEstandar(new Oficio("Carpintero"),false,100.0,0.1),LocalDate.now());
		
		try {
			tb1.agregarTarea(tr1);
			tb1.agregarTarea(tr2);
		} catch(OficioNoCoincideException e) {
			System.out.println(e.getMessage());
		}catch(AgendaOcupadaException e) {
			System.out.println(e.getMessage());			
		}
		
		
	}
	
	public static void pruebaExc3() {
		
		Usuario us1 = new Usuario("Nahuel Riquelme","nahuelriquelme00@gmail.com");
		
		Herramienta h1 = new Herramienta("Martillo",50);
		Herramienta h2 = new Herramienta("Escalera",100);
		Herramienta h3 = new Herramienta("Cinta Metrica",30);
		
		try {
			us1.contratar(h1,LocalDate.now(),4);
			us1.contratar(h2,LocalDate.now(),4);
			us1.contratar(h3,LocalDate.now(),4);
		} catch (AlquilerNoEntregadoException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}