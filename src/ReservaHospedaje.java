

import java.util.Scanner; // Captura datos del tipo int, double, string y etc.//

	
public class ReservaHospedaje {
	
		static Scanner scanner = new Scanner(System.in); //Creo este static, ya que me permite acceder a las variables y métodos aunque no tenga una instancia del objeto que lo contiene.//
		
		public static void main (String[] args) {
			
			int opcion=0; //inicializo en 0 para despues el usuario le asigne la eleccion.//
			do {
				System.out.println("--- Bienvenido a Cabañas Paisajes de Ensueño ---");
				System.out.println("Cabañas desde 1 hasta 7 personas, ubicadas en una zona de privilegiadas vistas a las Sierras Chicas.\r\n"
						+ "Cercana a los mejores balnearios de Santa Rosa sobre el Río y a minutos del centro comercial.\r\n"
						+ "Amplio parque con arboleda y asadores, para disfrutar el tranquilo y bellísimo paisaje.\r\n"
						+ "Atención cordial y personalizada de sus dueños.");
				System.out.println("-----------------------------------------");
				System.out.println("Consultar disponibilidad");
				System.out.println("¿Alojamiento para cuantas personas necesita? Digite Numero.");
				
				opcion=scanner.nextInt();
			//Opciones de cantidades de personas y eleccion automatica de cabaña.//
			switch(opcion) {
			case 1: 
				dptouno();
				break;
			case 2: 
				dptodos();
				break;
			case 3: 
				dptotres();
				break;
			case 4: 
				cabañacuatro();
				break;
			case 5:
				cabañacinco();
				break;
			case 6:
				cabañaseis();
				break;
			case 7:
				cabañasiete();
				break;
				//Para los numeros fuera del rando de 1 a 7//
				default:
					System.out.println("¡ATENCION CONTAMOS CON DISPONIBILIDAD DE 1 HASTA 7 PERSONAS, SOLO DIGITE HASTA ESAS CANTIDADES!");
					System.out.println("-----------------------------------------------------------------------------------------------");
			}
			}
			while (opcion == 0);
		System.out.println("Muchas gracias por su consulta, esperamos verlos pronto.");

			}
		//Defino cada una de las elecciones posibles del usuario//
		static void dptouno(){
			System.out.println("Para usted, podemos ofrecerle un dpto con todas las comodidades de las demas cabañas.");
		}
		static void dptodos() {
			System.out.println("Para ustedes dos, podemos ofrecerles un dpto con todas las comodidades de las demas cabañas.");
		}
		static void dptotres() {
			System.out.println("Para ustedes tres, podemos ofrecerles un dpto con todas las comodidades de las demas cabañas.");
		}
		static void cabañacuatro() {
			System.out.println("Para ustedes cuatro, podemos ofrecerles una cabaña con muchas comodidades.");
		}
		static void cabañacinco() {
			System.out.println("Para ustedes cinco, podemos ofrecerles una cabaña con muchas comodidades, la cual tiene capacidad maxima de siete.");
		}
		static void cabañaseis() {
			System.out.println("Para ustedes seis, podemos ofrecerles una cabaña con muchas comodidades, la cual tiene capacidad maxima de siete.");
		}
		static void cabañasiete() {
			System.out.println("Para ustedes siete, podemos ofrecerles una cabaña con muchas comodidades.");
		}
}