package clase005.poo.escenario2.dominio;

public class Coche extends Vehiculo {
	
	private boolean cajaAutomatica;

	public Coche(String marca, String modelo, Flota flota, boolean cajaAutomatica) {
		super(marca, modelo, flota);
		this.cajaAutomatica = cajaAutomatica;
	}
	

	public boolean isCajaAutomatica() {
		return cajaAutomatica;
	}

	public void setCajaAutomatica(boolean cajaAutomatica) {
		this.cajaAutomatica = cajaAutomatica;
	}



	@Override
	public void mover() {
		System.out.println(this.cajaAutomatica? "AVISO: este coche tiene caja automática.":"AVISO: este coche tiene caja manual.");
		System.out.println("Este coche se está moviendo.");
		
	}

}
