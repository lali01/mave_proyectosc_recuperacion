package recuperacion;

public class Poliza extends Main{

	private String nombre;
	public String categoria;
	public String descripcion;
	public String beneficio;
	
	public Poliza(String nombre, String categoria, String descripcion, String beneficio, String codigoDeDescuento, String codigoDeSalud) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.beneficio = beneficio;
		
	}
	
	public Poliza(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public Poliza(String string) {
		// TODO Auto-generated constructor stub
	}

	//set y get 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getBeneficio() {
		return beneficio;
	}
	public void setBeneficio(String beneficio) {
		this.beneficio = beneficio;
	}

	@Override
	public String toString() {
		return "Poliza [nombre=" + nombre + ", categoria=" + categoria + ", descripcion=" + descripcion + ", beneficio="
				+ beneficio + "]";
	}

	public static Object get(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
