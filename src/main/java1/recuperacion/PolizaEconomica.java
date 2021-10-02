package recuperacion;

public class PolizaEconomica extends Poliza{

	private String codigoDeDescuento;

	public PolizaEconomica(String nombre, String categoria, String descripcion, String beneficio,
			String codigoDeDescuento, String codigoDeSalud) {
		super(nombre, categoria, descripcion, beneficio, codigoDeDescuento, codigoDeSalud);
		// TODO Auto-generated constructor stub
	}	
	
	public String getCodigoDeDescuento() {
		return codigoDeDescuento;
	}

	public void setCodigoDeDescuento(String codigoDeDescuento) {
		this.codigoDeDescuento = codigoDeDescuento;
	}
}
