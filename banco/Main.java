package banco;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente=new Cliente("101", "Lileth", "Fernandez", "SJL", 987400543, 75432120);
			
		String[] beneficiosFree = {"Acceso a teatro", "Acceso a restaurantes", "Acceso a cursos"};
		
		String[] beneficiosSueldo = {"tiene un 15% en ropa y calzado en Ripley" , "Obtiene una promocion de 1/4 de pollo en pardos a 15.90"," tiene un 25% mensual en SmartFit", "Obtiene un 10% en concierto y eventos en Teletickect, tiene un 30% en Booking en reserva de hoteles"};
		
		CuentaBancaria cuentaFree=new CuentaFree("385728935892", "Cuenta free", "9582893293", beneficiosFree, false);

		CuentaBancaria cuentaSueldo=new CuentaSueldo("53252624664", "Cuenta sueldo", "75474434", beneficiosSueldo, "Inkafarma");
		
		CuentaBancaria cuentaCorriente1=new CuentaCorriente("5745754754", "Cuenta corriente 1", "34283473284", 5);
		
		CuentaBancaria cuentaCorriente2=new CuentaCorriente("6436344", "Cuenta corriente 2", "531511447", 5);
		
		CuentaBancaria cuentaCTS=new CuentaCTS("6436344", "Cuenta corriente 2", "531511447", 50000 );
		
		EventoBancario eventobancario1 =new EventoBancario(new Date(),"La gran revelacion","Lanzamientode un nuevo producto");
		
		EventoBancario eventobancario2 =new EventoBancario(new Date(),"Revolucion de Tasas","Cambios en las tasas de interes");
		
		EventoBancario eventobancario3 =new EventoBancario(new Date(),"Banco digital 2.0","Implementacion de tecnologia financiera");
		
		EventoBancario eventobancario4 =new EventoBancario(new Date(),"Nueva era, nuevas lideranzas","Cambios en la Alta dirrecion");
		
		EventoBancario eventobancario5=new EventoBancario(new Date(),"Innovando con responsabilidad","Cambios en las Politicas y regulaciones");
	
		EventoBancario[] eventosbancarios= {eventobancario1, eventobancario2,eventobancario3,eventobancario4,eventobancario5};
		cliente.setEventoBancarios(eventosbancarios);
		
        cuentaSueldo.setSaldoDisponible(1500);
		cuentaFree.setSaldoDisponible(20000);
		
		
		
		CuentaBancaria[] cuentasBancarias= {cuentaFree, cuentaSueldo, cuentaCorriente1, cuentaCorriente2, cuentaCTS};		
		cliente.setCuentas(cuentasBancarias);
		
		System.out.println(cliente.toString());
		
		for(CuentaBancaria cuenta: cuentasBancarias) {
			if (cuenta instanceof CuentaAhorro) {
				for(int i=1; i<=12; i++) {
					cuenta.calcularInteresMensual(CuentaAhorro.getTasaInteresAnual());
				}
				System.out.println("Saldo final: "+cuenta.getSaldoDisponible());
			}
		}
	}
}
