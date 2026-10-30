import java.util.UUID;
public class CuentaConstructor {
    private UUID id;
    private String nombre;
    private String email;
    private boolean activo;

    public CuentaConstructor(UUID id,String nombre,String email,boolean activo){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.activo = activo;
    }
    public CuentaConstructor(UUID id,String nombre,String email){
        this(id,nombre,email,true);
    }
    public CuentaConstructor(String nombre, String email){
        this (UUID.randomUUID(),nombre,email);
    }
    public void mostrar (){
        System.out.println("id:"+id);
        System.out.println("nombre"+nombre);
        System.out.println("email:"+email);
        System.out.println("activo:"+activo);
    }
}
