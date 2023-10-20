package banco;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente=new Cliente("101", "Lileth", "Fernandez", "SJL", 987400543, 75432120);
			
		String[] beneficiosFree = {"Acceso a teatro", "Acceso a restaurantes", "Acceso a cursos"};
		
		CuentaBancaria cuentaFree=new CuentaFree("385728935892", "Cuenta free", "9582893293", beneficiosFree, false);

		CuentaBancaria cuentaSueldo=new CuentaSueldo("53252624664", "Cuenta sueldo", "75474434", null, "Inkafarma");
		
		CuentaBancaria cuentaCorriente1=new CuentaCorriente("5745754754", "Cuenta corriente 1", "34283473284", 5);
		
		CuentaBancaria cuentaCorriente2=new CuentaCorriente("6436344", "Cuenta corriente 2", "531511447", 5);
		
		CuentaBancaria cuentaCTS=new CuentaCTS("6436344", "Cuenta corriente 2", "531511447", 50000 );
		
		
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
