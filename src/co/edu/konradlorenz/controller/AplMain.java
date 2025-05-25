package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.view.Home;

public class AplMain {

    public static void main(String[] args) {
        // new Controller().run();
        
        //TODO: BORRAR DE LA 11 A LA 14 cuando el controller esté listo
        Controller ctrl = new Controller();
        Home home = new Home(ctrl);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }
}
