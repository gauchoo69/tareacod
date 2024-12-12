import java.util.Scanner;

public class cafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la máquina de café");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Espresso");
        System.out.println("2. Americano");
        System.out.println("3. Capuchino");
        System.out.println("4. Salir");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            System.out.println("Preparando un Espresso...");
            System.out.println("Su Espresso está listo. ¡Disfrútelo!");
        } else if (opcion == 2) {
            System.out.println("Preparando un Americano...");
            System.out.println("Su Americano está listo. ¡Disfrútelo!");
        } else if (opcion == 3) {
            System.out.println("Preparando un Capuchino...");
            System.out.println("Su Capuchino está listo. ¡Disfrútelo!");
        } else if (opcion == 4) {
            System.out.println("Gracias por usar la máquina de café. ¡Hasta luego!");
        } else {
            System.out.println("Opción no válida. Por favor, intente de nuevo.");
        }

        scanner.close();
    }
}
