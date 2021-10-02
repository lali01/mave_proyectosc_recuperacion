package recuperacion;

public class PolizaDeVida extends Poliza{

	
	private String codigoDeSalud;
	
	public PolizaDeVida(String nombre, String categoria, String descripcion, String beneficio, String codigoDeDescuento,
			String codigoDeSalud) {
		super(nombre, categoria, descripcion, beneficio, codigoDeDescuento, codigoDeSalud);
		// TODO Auto-generated constructor stub
	}

	//set y get
	public String getCodigoDeSalud() {
		return codigoDeSalud;
	}

	public void setCodigoDeSalud(String codigoDeSalud) {
		this.codigoDeSalud = codigoDeSalud;
	}
}
