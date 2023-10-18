package banco;

public class CuentaCorriente extends CuentaBancaria{

	private double tasaInteresAnual = 0.2 ;
	private double COMISIONFIJA = 2.0 ;
	int maxRetiro ;
		
	public CuentaCorriente(String numeroCuenta, String descripcionCuenta, String cuentaCCI, int maxRetiro) {
		super(numeroCuenta, descripcionCuenta, cuentaCCI);
		this.maxRetiro = maxRetiro;
	}

	public int getMaxRetiro() {
		return maxRetiro;
	}

	public void setMaxRetiro(int maxRetiro) {
		this.maxRetiro = maxRetiro;
	}


	@Override
	public String toString() {
		return "CuentaCorriente [tasaInteresAnual=" + tasaInteresAnual + ", COMISIONFIJA=" + COMISIONFIJA
				+ ", maxRetiro=" + maxRetiro + "]";
	}
	
	
}
	
	
	
	


