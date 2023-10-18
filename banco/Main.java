package banco;

public class Main {
	
	public static void main(String[] args) {
		Cliente cliente=new Cliente("101", "Lileth", "Fernandez", "SJL", 987400543, 75432120);
		CuentaBancaria cuentaFree=new CuentaFree("385728935892", "Cuenta free", "9582893293", 0.3, null, false);
		CuentaBancaria cuentaSueldo=new CuentaSueldo("53252624664", "Cuenta sueldo", "75474434", 0.3, null, "Inkafarma");
		CuentaBancaria cuentaCorriente1=new CuentaCorriente("5745754754", "Cuenta corriente 1", "34283473284", 3);
		CuentaBancaria cuentaCorriente2=new CuentaCorriente("6436344", "Cuenta corriente 2", "531511447", 3);
		CuentaBancaria cuentaCTS=new CuentaCTS("6436344", "Cuenta corriente 2", "531511447", 100);
		
		cuentaSueldo.setSaldoDisponible(1500);
		cuentaFree.setSaldoDisponible(20000);
		
		CuentaBancaria[] cuentasBancarias= {cuentaFree, cuentaSueldo, cuentaCorriente1, cuentaCorriente2, cuentaCTS};		
		cliente.setCuentas(cuentasBancarias);
		
		System.out.println(cliente.toString());
	}
}
