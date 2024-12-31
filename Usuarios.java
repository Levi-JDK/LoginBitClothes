package usuarios;

import java.time.LocalDateTime;
import java.time.format.*;
import java.util.Scanner;
public class Usuarios {
    private String user;
    private String password;
    private LocalDateTime lastLogin;
    // Constructor
    public Usuarios(){
    }
    //Metodos Setter y Getter
    public Usuarios(String user,String password){
        this.user = user;
        this.password = password;
        this.lastLogin = null;
    }
    public LocalDateTime getLastLogin(){
        return lastLogin;
    }
    public void setLastLogin(LocalDateTime lastLogin){
        this.lastLogin = lastLogin;
    }
    public String getUser(){
        return user;
    }
    public void setUser(String user){
        this.user = user;}

    public String getPassword(){return password; }

    public void setPassword(String password){
        this.password = password;
    }

    public void antLogin(){
        if (this.lastLogin == null){
                System.out.println("Bienvenido por primera vez");
        } else{
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
            System.out.println("La ultima fecha de ingreso a la plataforma fue: " + lastLogin.format(formato));
        }
        
    }
    public void ultIngreso(){
        antLogin();
        this.lastLogin = LocalDateTime.now();
    }
    public void menuUser(){
        boolean menu = true;
        while(menu == true){
                System.out.println("");
                System.out.println("");
                System.out.println(" BBBBB   III  TTTTT   CCCC   L        OOO   TTTTT  H   H  EEEEE  SSSS ");
                System.out.println(" B   B    I     T    C       L       O   O    T    H   H  E      S    ");
                System.out.println(" BBBBB    I     T    C       L       O   O    T    HHHHH  EEEE   SSS  ");
                System.out.println(" B   B    I     T    C       L       O   O    T    H   H  E          S  ");
                System.out.println(" BBBBB   III    T     CCCC   L L LL   OOO     T    H   H  EEEEE  SSSS ");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.print("Pulse 1 para cerrar sesion: ");
                Scanner sc = new Scanner(System.in);
                int salir = sc.nextInt();
                if(salir != 1){
                    menu = true;
                }else{
                    menu = false;
                }


    }
}
}
