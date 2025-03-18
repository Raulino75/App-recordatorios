<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
package co.edu.konradlorenz.control;

import co.edu.konradlorenz.view.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AplMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido " + nombre + ", seleccione una opcion");

        Menu menu1 = new Menu();
        menu1.Mostrarmenu1();

    }
}
