package recuperacion;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Scanner inInt = new Scanner(System.in);
		
		
		String opcion = "";
		String categoria = "";
		String descripcion = "";
		String beneficio = "";
		String nombreABuscar = "";
		int posicion = 0;
		String nombre = "";
		
		Poliza listaPoliza[] = new Poliza[50];
		
	
		do {
			System.out.println("Elija una Opcion: ");
			System.out.println("1. Ingresar Poliza ");
			System.out.println("2. Buscar Poliza ");
			System.out.println("3. SALIR ");
			opcion = in.nextLine();

			switch (opcion) {

			case "1":
				System.out.println("****************************");
				System.out.println("Ingresar Nombre: ");
				nombre = in.nextLine();
				System.out.println("Ingrese la Categoria: ");
				System.out.println("1. Economico");
				System.out.println("2. DE Vida");
				categoria = in.nextLine();
				if (categoria.equals("1")) {
					System.out.println("Ingrese Codigo de Descuento: ");
					String descuento = in.next();
				} else {
					System.out.println("Ingrese Codigo de Salud: ");
					String codigo = in.next();
				}
				System.out.println("3. Ingrese descripcion: ");
				descripcion = in.next();
				System.out.println("4. Ingresar el beneficio: ");
				beneficio = in.nextLine();
				System.out.println("****************************");

				Poliza poliza1 = new Poliza("nombre=" + nombre + ", categoria=" + categoria + ", descripcion="
						+ descripcion + ", beneficio=" + beneficio);
				poliza1.setNombre(nombre);
				poliza1.setCategoria(categoria);
				poliza1.setDescripcion(descripcion);
				poliza1.setBeneficio(beneficio);

				listaPoliza[posicion] = poliza1;
				posicion++;
				System.out.println(Arrays.toString(listaPoliza));
				System.out.println("La informacion ha sido guardada exitosamente");
				break;

			case "2":
				System.out.println("****************************");
				System.out.println("Ingresar el nombre: ");
				nombreABuscar = in.nextLine();
				for (int i = 0; i<50; i++) {
					Poliza poliza = listaPoliza[i];
					
					nombreABuscar.equals(nombre);
					
				boolean resultado = poliza.contains(nombreABuscar);
				System.out.println("Poliza Encontrada: " + Arrays.toString(listaPoliza));
				
//					if(nombreABuscar.equals(listaPoliza)){
//						System.out.println("Poliza Encontrada: ");
//						System.out.println(Arrays.toString(listaPoliza));
//				
//						}else {
//							System.out.println("Nombre no encontrado");
				
				}
				break;
			}
				
		}while(!opcion.equals("3"));
		System.out.println("Usted ha salido del sistema");
		System.out.println("BUEN DIA");
		
		}
		}
	

