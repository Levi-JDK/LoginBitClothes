package usuarios;
import java.util.Scanner;

public class appLogin {
    
    public static void main(String[] args) {
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        ListUsers listUsers = new ListUsers();
        Usuarios    usuarios = new Usuarios();
        while (loop == true) {   
        System.out.println( " BITCLOTHES  ");
        System.out.println("Elija una opcion: ");
        System.out.println("1. Registrarse. ");
        System.out.println("2. Iniciar Sesion. ");  
        System.out.println("3. Salir");   
        int opc = sc.nextInt();
        sc.nextLine();
        switch (opc) {
            case 1:
                System.out.println(" ----- REGISTRO BITCLOTHES ----");
                System.out.println("Usuario:  ");
                String user = sc.nextLine();
                System.out.println("Contraseña: ");
                String password = sc.nextLine();
                Usuarios nuevoUsuario = new Usuarios(user,password);
                listUsers.registrarUsuarios(nuevoUsuario);
                nuevoUsuario.ultIngreso();
            break;
            case 2:
            boolean logIn = false;
                while (logIn == false) {
                    System.out.println(" ----- LOGIN BITCLOTHES ----");
                    System.out.print("Usuario: ");
                    String userLog = sc.nextLine();
                    System.out.print("Contraseña: ");
                    String passLog = sc.nextLine();
                    listUsers.logUsers(userLog, passLog);
                    if ("ok".equals(listUsers.getValidacion())) {
                        logIn = true;  
                    usuarios.menuUser();
                    break;
                    } else {
                            System.out.println("Intenta nuevamente.");
                    }
                }
            break;
            case 3:
                    System.out.println("Saliendo del sistema...");
                    loop = false; 
                    break;

                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
                    break;
        }    
    }
    sc.close();
    //System.out.println("Bienvenido nuevamente "+ nuevoUsuario.getUser());
    System.out.println("Gracias por usar BITCLOTHES");
}
}