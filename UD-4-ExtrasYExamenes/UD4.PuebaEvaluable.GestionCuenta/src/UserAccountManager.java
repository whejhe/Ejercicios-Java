
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Carlos Fernandez
 * @version 1.0
 */
public class UserAccountManager {
    
    private Map<String,User> registerUsers;
    private Set<User> loggedUsers;
    Scanner sc = new Scanner(System.in);

    public UserAccountManager() {
        registerUsers = new HashMap<>();
        loggedUsers = new HashSet<>();
        
    }
    
    public boolean createUser(String email,String name,String password){
        if(registerUsers.containsValue(email)){
            System.out.println("Error, el email ya esta registrado");
            return false;
        }else if(password.length()<8){
            System.out.println("Error, la contraseña debe constar de al menos 8 caracteres");
            return false;
        }else if(name.length()<=1 || !email.contains("@")){
            System.out.println("Error, nombre o email no validos");
            return false;
        }else{
            registerUsers.put(email,new User(email,name,password.hashCode()));
            return true;
        }   
    }
    
    public boolean tryLoginUser(String email,String password){
        User u = registerUsers.get(email);
        if(u==null){
            System.out.println("Error,no se encontro ningun Usuario registrado con este correo ");
            return false;
        }
        if(u.getHashedPassword() !=password.hashCode()){
            System.out.println("Error de contraseña");
            return false;
        }
        if(loggedUsers.contains(u)){
            System.out.println("Error, este usuario ya tiene una sesión abierta");
            return false;
        }
        loggedUsers.add(u);
        System.out.println("Inicio de sesión");
        return true;
    }
    
    public boolean tryLogoutUser(String email){
        User u = registerUsers.get(email);
        if(u==null){
            System.out.println("Error, no se encontro ningun usuario registrado con este correo");
            return false;
        }
        if(!loggedUsers.contains(registerUsers.get(email))){
            System.out.println("Error, usuario no conectado");
            return false;
        }
        loggedUsers.remove(u);
        System.out.println("Cierre de sesión");
        return true;
    }
    
    public void listUserAccounts(){
        System.out.println("List of logged users:");
        if(registerUsers.isEmpty()){
            System.out.println("Zero user accounts registered at the moment");
        }else{
            Iterator<User> iter = registerUsers.values().iterator();
            while(iter.hasNext()){
                System.out.println(iter.next().toString());
            }
        }
        
    }
    
    public void listLoggedUsers(){
        System.out.println("List of logged users:");
        if(loggedUsers.isEmpty()){
            System.out.println("Zero logged users at the moment");         
        }
        Iterator<User> iter = loggedUsers.iterator();
        while(iter.hasNext()){
            User u = iter.next();
            System.out.println(u.getName());
        }
    }
    
    public void run(){
        int option;
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("1-Create a user account");
            System.out.println("2-User login");
            System.out.println("3-User logout");
            System.out.println("4-List of user accounts");
            System.out.println("5-List of logged users");
            System.out.println("6-Exit");
            
            option=sc.nextInt();
            
            switch(option){
                case 1:
                    System.out.println("Email:");
                    String UserEmail = sc.next();
                    System.out.println("Nombre:");
                    String UserName = sc.next();
                    System.out.println("Contraseña:");
                    String UserPassword = sc.next();
                    createUser(UserEmail,UserName,UserPassword);
                    if(createUser(UserEmail,UserName,UserPassword)){
                        System.out.println("Cuenta creada con exito");
                    }else{
                        System.out.println("Se produjo algun error durante la creacion de la cuenta");
                    }
                    System.out.println("-----------------------------------");
                    break;
                case 2:
                    System.out.println("Email:");
                    UserEmail = sc.next();
                    System.out.println("Contraseña:");
                    UserPassword = sc.next();
                    tryLoginUser(UserEmail,UserPassword);
                    System.out.println("-----------------------------------");
                    break;
                case 3:
                    System.out.println("Email:");
                    UserEmail = sc.next();
                    tryLogoutUser(UserEmail);
                    System.out.println("-----------------------------------");
                    break;
                case 4:
                    listUserAccounts();
                    System.out.println("-----------------------------------");
                    break;
                case 5:
                    listLoggedUsers();
                    System.out.println("-----------------------------------");
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opcion incorrecta, prueba otra vez");
                    System.out.println("-----------------------------------");
            }
            
        }while(option!=6);
    }
    
    
    
}
