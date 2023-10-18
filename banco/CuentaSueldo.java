package banco;

public class CuentaSueldo extends CuentaAhorro {
	    private String nombreEmpresa;

		public CuentaSueldo(String numeroCuenta, String descripcionCuenta, String cuentaCCI, double tasaInteresAnual,
				String[] beneficios, String nombreEmpresa) {
			super(numeroCuenta, descripcionCuenta, cuentaCCI, tasaInteresAnual, beneficios);
			this.nombreEmpresa = nombreEmpresa;
		}

		public String getNombreEmpresa() {
			return nombreEmpresa;
		}

		public void setNombreEmpresa(String nombreEmpresa) {
			this.nombreEmpresa = nombreEmpresa;
		}

		@Override
		public String toString() {
			return "CuentaSueldo [nombreEmpresa=" + nombreEmpresa + ", getNombreEmpresa()=" + getNombreEmpresa() + "]";
		}




}
