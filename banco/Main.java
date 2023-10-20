package banco;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente=new Cliente("101", "Lileth", "Fernandez", "SJL", 987400543, 75432120);
		
		CuentaBancaria cuentaFree=new CuentaFree("385728935892", "Cuenta free", "9582893293", null, false);
		
		CuentaBancaria cuentaSueldo=new CuentaSueldo("53252624664", "Cuenta sueldo", "75474434", null, "Inkafarma");
		
		CuentaBancaria cuentaCorriente1=new CuentaCorriente("5745754754", "Cuenta corriente 1", "34283473284", 5);
		
		CuentaBancaria cuentaCorriente2=new CuentaCorriente("6436344", "Cuenta corriente 2", "531511447", 5);
		
		CuentaBancaria cuentaCTS=new CuentaCTS("6436344", "Cuenta corriente 2", "531511447", 50000 );
		
        cuentaSueldo.setSaldoDisponible(1500);
		cuentaFree.setSaldoDisponible(20000);
		
		CuentaBancaria[] cuentasBancarias= {cuentaFree, cuentaSueldo, cuentaCorriente1, cuentaCorriente2, cuentaCTS};		
		cliente.setCuentas(cuentasBancarias);
		
		System.out.println(cliente.toString());
				
		for(CuentaBancaria cuenta:cliente.getCuentas()) {
			 if (cuenta instanceof CuentaAhorro) {
				 for (int i = 1; i <= 12; i++) {
					 cuenta.calcularInteresMensual(CuentaAhorro.getTasaInteresAnual());			
				}
				 System.out.println("Saldo final: "+Math.round(cuenta.getSaldoDisponible()*100.00)/100.00);
			 }
		}
		
		MovimientoCuenta movimiento1 = new MovimientoCuenta("7503627890", "Descripción de la operación 10", new Date(), 100.00, "Crédito", cuentaFree);
		MovimientoCuenta movimiento2 = new MovimientoCuenta("7890269012", "Descripción de la operación 9", new Date(), 120.00, "Crédito", cuentaFree);
		MovimientoCuenta movimiento3 = new MovimientoCuenta("2346788901", "Descripción de la operación 8", new Date(), 640.00, "Débito", cuentaFree);
		MovimientoCuenta movimiento4 = new MovimientoCuenta("8904567890", "Descripción de la operación 7", new Date(), 100.00, "Crédito", cuentaFree);
		MovimientoCuenta movimiento5 = new MovimientoCuenta("4566788901", "Descripción de la operación 5", new Date(), 400.00, "Débito", cuentaFree);
		MovimientoCuenta movimiento6 = new MovimientoCuenta("6787899012", "Descripción de la operación 6", new Date(), 530.00, "Crédito", cuentaFree);
        MovimientoCuenta movimiento7 = new MovimientoCuenta("8904567890", "Descripción de la operación 7", new Date(), 100.00, "Crédito", cuentaFree);
        MovimientoCuenta movimiento8 = new MovimientoCuenta("2346788901", "Descripción de la operación 8", new Date(), 640.00, "Débito", cuentaFree);
        MovimientoCuenta movimiento9 = new MovimientoCuenta("7890269012", "Descripción de la operación 9", new Date(), 120.00, "Crédito", cuentaFree);
        MovimientoCuenta movimiento10 = new MovimientoCuenta("7503627890", "Descripción de la operación 10", new Date(), 100.00, "Crédito", cuentaFree);
        
        MovimientoCuenta[] movimientos= {movimiento1,movimiento2,movimiento3,movimiento4,movimiento5,movimiento6,movimiento7,movimiento8,movimiento9,movimiento10};
        
	}
}
