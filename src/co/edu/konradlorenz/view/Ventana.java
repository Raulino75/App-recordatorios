package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {

    private Scanner sc = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String pedirDato() {
        return sc.nextLine();
    }

    public int pedirEntero() {
        return sc.nextInt();
    }

}
