package banco;

public class CuentaSueldo extends CuentaAhorro {
	    private String nombreEmpresa;

		public CuentaSueldo(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String[] beneficios,
				String nombreEmpresa) {
			super(numeroCuenta, descripcionCuenta, cuentaCCI, beneficios);
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
			return "CuentaSueldo [nombreEmpresa=" + nombreEmpresa + ", toString()=" + super.toString() + "]";
		}


}
