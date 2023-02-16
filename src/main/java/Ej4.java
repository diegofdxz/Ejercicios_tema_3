/*4. El tiempo de cocción
        Sabiendo que:

        Para cocinar 500 gramos de carne de vacuno, se necesita:

        10 minutos si quieres una cocción casi cruda

        17 minutos si quieres una cocción al punto

        25 minutos si quieres una cocción bien hecha

        Para cocinar 400 gramos de cordero se necesita:

        15 minutos si quieres una cocción casi cruda

        25 minutos si quieres una cocción al punto

        40 minutos si quieres una cocción bien hecha

        El tiempo de cocción es proporcional al peso.

        Dependiendo de la información introducida por el usuario (tipo de carne, modo de cocción y peso), mostrar el tiempo de cocción de una carne en segundos.
*/
import java.util.Scanner;
public class Ej4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tipo de carne (vaca o cordero): ");
        String carne = sc.nextLine();
        System.out.print("Introduce el modo de cocción (crudo, punto o bien hecha): ");
        String coccion = sc.nextLine();
        System.out.print("Introduce el peso de la carne: ");
        int peso = sc.nextInt();
        int tiempo = 0;
        if (carne.equals("vaca")) {
            if (coccion.equals("crudo")) {
                tiempo = 10;
            } else if (coccion.equals("punto")) {
                tiempo = 17;
            } else if (coccion.equals("bien hecha")) {
                tiempo = 25;
            }
        } else if (carne.equals("cordero")) {
            if (coccion.equals("crudo")) {
                tiempo = 15;
            } else if (coccion.equals("punto")) {
                tiempo = 25;
            } else if (coccion.equals("bien hecha")) {
                tiempo = 40;
            }
        }
        System.out.println("El tiempo de cocción es de " + tiempo * peso + " segundos");
    }
}
