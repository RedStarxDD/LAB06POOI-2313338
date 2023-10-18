package banco;

public class CuentaCTS extends CuentaBancaria{
	
	private double tasaInteresAnual = 0.7;
	private double puntos;
	
	public CuentaCTS(String numeroCuenta, String descripcionCuenta, String cuentaCCI, double puntos) {
		super(numeroCuenta, descripcionCuenta, cuentaCCI);
		this.puntos = puntos;
	}

	public double getPuntos() {
		return puntos;
	}
	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "CuentaCTS [tasaInteresAnual=" + tasaInteresAnual + ", puntos=" + puntos + "]";
	}
	
	}


