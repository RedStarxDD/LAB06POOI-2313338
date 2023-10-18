package banco;

public class CuentaAhorro extends CuentaBancaria{

	private double tasaInteresAnual=0.3;
	private String[] beneficios;

	public CuentaAhorro(String numeroCuenta, String descripcionCuenta, String cuentaCCI, double tasaInteresAnual,
			String[] beneficios) {
		super(numeroCuenta, descripcionCuenta, cuentaCCI);
		this.tasaInteresAnual = tasaInteresAnual;
		this.beneficios = beneficios;
	}

	public double getTasaInteresAnual() {
		return tasaInteresAnual;
	}



	public void setTasaInteresAnual(double tasaInteresAnual) {
		this.tasaInteresAnual = tasaInteresAnual;
	}

	public String[] getBeneficios() {
		return beneficios;
	}

	public void setBeneficios(String[] beneficios) {
		this.beneficios = beneficios;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [tasaInteresAnual=" + tasaInteresAnual + ", beneficios=" + beneficios + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}

