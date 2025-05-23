
package co.edu.konradlorenz.model;

import co.edu.konradlorenz.view.View;
import java.io.*;

public class SistemaLogin {
    private static final String ARCHIVO_USUARIOS = "usuarios.txt";

     public static void registrarUsuario() throws EmptyInputException {
        View.mostrarMensaje("Nuevo nombre de usuario: ");
        String username = View.ingresarDatoString();
        View.mostrarMensaje("Nueva contraseña: ");
        String password = View.ingresarDatoString();

        if (usuarioExiste(username)) {
            View.mostrarMensaje("¡Ese nombre de usuario ya está registrado!");
            return;
        }

        try (FileWriter fw = new FileWriter(ARCHIVO_USUARIOS, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            User nuevo = new User(username, password);
            bw.write(nuevo.toFileString());
            bw.newLine();
            View.mostrarMensaje("¡Registro exitoso!");
        } catch (IOException e) {
            View.mostrarMensaje("Error al guardar el usuario.");
        }
    }
      public static void iniciarSesion() throws EmptyInputException {
       View.mostrarMensaje("Usuario: ");
        String username = View.ingresarDatoString();
        View.mostrarMensaje("Contraseña: ");
        String password = View.ingresarDatoString();

        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_USUARIOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                User u = User.fromFileString(linea);
                if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                    View.mostrarMensaje("¡Inicio de sesión exitoso!");
                    return;
                }
            }
          View.mostrarMensaje("Usuario o contraseña incorrectos.");
        } catch (IOException e) {
           View.mostrarMensaje("Error al leer los usuarios.");
        }
    }

    public static boolean usuarioExiste(String username) {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_USUARIOS))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                User u = User.fromFileString(linea);
                if (u.getUsername().equals(username)) {
                    return true;
                }
            }
        } catch (IOException e) {
            // Si no existe el archivo aún, no hay usuarios.
        }
        return false;
    }
}
