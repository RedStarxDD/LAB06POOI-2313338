package banco;

public class CuentaFree extends CuentaAhorro {
	    private boolean numIlimitadoRetiro;

		public CuentaFree(String numeroCuenta, String descripcionCuenta, String cuentaCCI, String[] beneficios,
				boolean numIlimitadoRetiro) {
			super(numeroCuenta, descripcionCuenta, cuentaCCI, beneficios);
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
			return "CuentaFree [numIlimitadoRetiro=" + numIlimitadoRetiro + ", toString()=" + super.toString() + "]";
		}

}
