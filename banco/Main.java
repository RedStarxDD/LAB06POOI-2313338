package banco;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente=new Cliente("101", "David", "Fernandez", "SJL", 987400543, 75432120);
			
		String[] beneficiosFree = {"Acceso a teatro", "Acceso a restaurantes", "Acceso a cursos"};		
		String[] beneficiosSueldo = {"tiene un 15% en ropa y calzado en Ripley" , "Obtiene una promocion de 1/4 de pollo en pardos a 15.90"," tiene un 25% mensual en SmartFit", "Obtiene un 10% en concierto y eventos en Teletickect, tiene un 30% en Booking en reserva de hoteles"};
		
		CuentaBancaria cuentaFree=new CuentaFree("385728935892", "Cuenta free", "9582893293", beneficiosFree, false);
		CuentaBancaria cuentaSueldo=new CuentaSueldo("53252624664", "Cuenta sueldo", "75474434", beneficiosSueldo, "Inkafarma");		
		CuentaBancaria cuentaCorriente1=new CuentaCorriente("5745754754", "Cuenta corriente 1", "34283473284", 5);		
		CuentaBancaria cuentaCorriente2=new CuentaCorriente("6436344", "Cuenta corriente 2", "531511447", 5);		
		CuentaBancaria cuentaCTS=new CuentaCTS("6436344", "Cuenta corriente 2", "531511447", 50000 );
		
		CuentaBancaria[] cuentasBancarias= {cuentaFree, cuentaSueldo, cuentaCorriente1, cuentaCorriente2, cuentaCTS};		
		cliente.setCuentas(cuentasBancarias);
		
        cuentaSueldo.setSaldoDisponible(1500);
		cuentaFree.setSaldoDisponible(20000);
		
		for(CuentaBancaria cuenta: cliente.getCuentas()) {
			if (cuenta instanceof CuentaAhorro) {
				for(int i=1; i<=12; i++) {
					cuenta.calcularInteresMensual(CuentaAhorro.getTasaInteresAnual());
				}
				System.out.println("Saldo final de "+cuenta.getDescripcionCuenta()+": "+Math.round(cuenta.getSaldoDisponible()*100.00)/100.00);
			}
		}
		
		EventoBancario eventobancario1 =new EventoBancario(new Date(),"La gran revelacion","Lanzamientode un nuevo producto");		
		EventoBancario eventobancario2 =new EventoBancario(new Date(),"Revolucion de Tasas","Cambios en las tasas de interes");		
		EventoBancario eventobancario3 =new EventoBancario(new Date(),"Banco digital 2.0","Implementacion de tecnologia financiera");		
		EventoBancario eventobancario4 =new EventoBancario(new Date(),"Nueva era, nuevas lideranzas","Cambios en la Alta dirrecion");		
		EventoBancario eventobancario5=new EventoBancario(new Date(),"Innovando con responsabilidad","Cambios en las Politicas y regulaciones");
	
		EventoBancario[] eventosbancarios= {eventobancario1, eventobancario2,eventobancario3,eventobancario4,eventobancario5};
		cliente.setEventoBancarios(eventosbancarios);
		
		MovimientoCuenta movimientocuenta1 =new MovimientoCuenta("7503627890", "Descripción de la operación 1", new Date(), 100.00, "Crédito");
		MovimientoCuenta movimientocuenta2 =new MovimientoCuenta("7890269012", "Descripción de la operación 2", new Date(), 120.00, "Crédito");
		MovimientoCuenta movimientocuenta3 =new MovimientoCuenta("2346788901", "Descripción de la operación 3", new Date(), 640.00, "Débito");
		MovimientoCuenta movimientocuenta4 =new MovimientoCuenta("8904567890", "Descripción de la operación 4", new Date(), 100.00, "Crédito");
		MovimientoCuenta movimientocuenta5 =new MovimientoCuenta("4566788901", "Descripción de la operación 5", new Date(), 400.00, "Débito");
		MovimientoCuenta movimientocuenta6 =new MovimientoCuenta("6787899012", "Descripción de la operación 6", new Date(), 530.00, "Crédito");
		MovimientoCuenta movimientocuenta7 =new MovimientoCuenta("8904567890", "Descripción de la operación 7", new Date(), 100.00, "Crédito");
		MovimientoCuenta movimientocuenta8 =new MovimientoCuenta("2346788901", "Descripción de la operación 8", new Date(), 640.00, "Débito");
		MovimientoCuenta movimientocuenta9 =new MovimientoCuenta("7890269012", "Descripción de la operación 9", new Date(), 120.00, "Crédito");
		MovimientoCuenta movimientocuenta10 =new MovimientoCuenta("7503627890", "Descripción de la operación 10", new Date(), 100.00, "Crédito");
		
		MovimientoCuenta[] movimientoscuentas= {movimientocuenta1,movimientocuenta2,movimientocuenta3,movimientocuenta4,movimientocuenta5,movimientocuenta6,movimientocuenta7,movimientocuenta8,movimientocuenta9,movimientocuenta10};
		
		cuentaFree.setMovimientos(movimientoscuentas);
		
		System.out.println(cliente.toString());		
	}
}
