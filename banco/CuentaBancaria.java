package banco;

public class CuentaBancaria {
	private String numeroCuenta, descripcionCuenta, cuentaCCI;
	private double saldoDisponible=0;
	private MovimientoCuenta[] movimientos;
	private String estado;
	
		
	public CuentaBancaria(String numeroCuenta, String descripcionCuenta, String cuentaCCI) {
	    super();
	    this.numeroCuenta = numeroCuenta;
	    this.descripcionCuenta = descripcionCuenta;
	    this.cuentaCCI = cuentaCCI;
	   
	  }

	  public void calcularInteresMensual(double tasaInteresAnual) {
	    // Calcula el interés mensual
	    double interesMensual = Math.round((this.saldoDisponible * tasaInteresAnual/ 12)*100.0)/100*0;

	    
	    // Actualiza el saldo disponible
	    this.saldoDisponible += interesMensual;
	   
	    System.out.println(interesMensual);
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getDescripcionCuenta() {
		return descripcionCuenta;
	}

	public void setDescripcionCuenta(String descripcionCuenta) {
		this.descripcionCuenta = descripcionCuenta;
	}

	public String getCuentaCCI() {
		return cuentaCCI;
	}

	public void setCuentaCCI(String cuentaCCI) {
		this.cuentaCCI = cuentaCCI;
	}

	public double getSaldoDisponible() {
		return saldoDisponible;
	}

	public void setSaldoDisponible(double saldoDisponible) {
		this.saldoDisponible = saldoDisponible;
	}

	public MovimientoCuenta[] getMovimientos() {
		return movimientos;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", descripcionCuenta=" + descripcionCuenta
				+ ", cuentaCCI=" + cuentaCCI + ", saldoDisponible=" + saldoDisponible + ", estado=" + estado + "]";
	}
	
	
}
