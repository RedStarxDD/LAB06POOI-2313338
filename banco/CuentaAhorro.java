package banco;

public class CuentaAhorro extends CuentaBancaria{

	private static double tasaInteresAnual=0.3;
	private String[] beneficios;

	public CuentaAhorro(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String[] beneficios) {
		super(numeroCuenta, descripcionCuenta, cuentaCCI);
		this.beneficios = beneficios;
	}

	public static double getTasaInteresAnual() {
		return tasaInteresAnual;
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

