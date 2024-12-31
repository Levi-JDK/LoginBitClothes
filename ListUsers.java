package usuarios;

import java.util.*;

public class ListUsers{
    private ArrayList<Usuarios> listUsers;
    private String validacion;
    public ListUsers(){
        listUsers = new ArrayList<>();
    }
public void registrarUsuarios(Usuarios usuarios){
        listUsers.add(usuarios);
        System.out.println("Usuario registrado: " +usuarios.getUser());
    }   

    public void logUsers(String user,String password){
        boolean datosValidos = false;
        for(Usuarios u : listUsers){
            if (u.getUser().equals(user) && u.getPassword().equals(password)) {
                u.ultIngreso();
                System.out.println("Bienvenido "+u.getUser());
                datosValidos = true;
                setValidacion("ok");
            }
        }
       if(datosValidos != true){
        System.out.println("Datos incorrectos");
        System.out.println("");

       } 
    }
    public String getValidacion(){
        return validacion;
    }
    public void setValidacion(String validacion){
        this.validacion = validacion;
    }
}

