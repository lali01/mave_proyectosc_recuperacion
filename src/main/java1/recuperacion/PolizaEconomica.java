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
//String estadoBusqueda = Poliza.get(1).getEstado
//////String busquedaNombre = (String) Poliza.get(i);
//////if(busquedaNombre.equals((Poliza.get(i)).getNombre()))
//////
////Poliza poliza = listaPoliza[i];
////nombre = poliza.getNombre();
////boolean resultado2 = buscar.equals(nombre1);
////
////if (resultado == true)
////resultado = true;
////}
//////estadoBusqueda = listaLibros.get(1).getEstado
////// if(busquedaCodigo.equals(listaLibros.get(1).getCodigo())
//////&& busquedaCedula==listaLibros.get(1).getCedula()
//////&& estadoBusqueda==listaLibros.get(1).getEstado()
//////system.out.println(listaLibros.get(1).toString2());
////
////}
////if (resultado == true) {
////System.out.println("Poliza Encontrada: ");
////System.out.println(Arrays.toString(listaPoliza));
////} else {
////System.out.println("Estudiante No encontrado");
////}
////break;
////}