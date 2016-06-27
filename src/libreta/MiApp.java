
package libreta;

import libreta.Libreta;
import javax.swing.JOptionPane;
/**
 * contiene el menu de la aplicacion y es donde se llaman los métodos principales de la aplicacion
 * @author propa
 */
public class MiApp {


    public static void main(String[] args) {
        Libreta libreta = new Libreta();
        boolean condicion = true;
        do{
        int seleccion = Integer.parseInt(JOptionPane.showInputDialog("1)Engadir contacto\n2)Listar contactos\n3)Borrar contacto\n5)Crear grupo\n6)Añadir contacto a grupo\n7)Salir"));
        switch(seleccion){
            case 1:
                libreta.engadir();
                break;
            case 2:
                libreta.listar();
                break;
            case 3:
                libreta.borrar();
                break;
            case 5:
                libreta.crearGrupo();
                break;
            case 6:
                libreta.agregarAGrupo();
                break;
            case 7:
                System.exit(0);
            default:
                JOptionPane.showMessageDialog(null, "Opción no válida");
        }
        }while(condicion);
        
        
    }
    
}
