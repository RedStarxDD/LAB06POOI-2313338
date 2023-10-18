package banco;

public class CuentaFree extends CuentaAhorro {
	    private boolean numIlimitadoRetiro;

		public CuentaFree(String numeroCuenta, String descripcionCuenta, String cuentaCCI, double tasaInteresAnual,
				String[] beneficios, boolean numIlimitadoRetiro) {
			super(numeroCuenta, descripcionCuenta, cuentaCCI, tasaInteresAnual, beneficios);
			this.numIlimitadoRetiro = numIlimitadoRetiro;
		}

		public boolean isNumIlimitadoRetiro() {
			return numIlimitadoRetiro;
		}

		public void setNumIlimitadoRetiro(boolean numIlimitadoRetiro) {
			this.numIlimitadoRetiro = numIlimitadoRetiro;
		}

		@Override
		public String toString() {
			return "CuentaFree [numIlimitadoRetiro=" + numIlimitadoRetiro + ", isNumIlimitadoRetiro()="
					+ isNumIlimitadoRetiro() + "]";
		}

}
