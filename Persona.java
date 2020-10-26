
public class Persona
{
    protected String nombre;
    protected int edad;
    protected int carnet;
    protected Fecha fechaNac; // 12-06-2012 dd-mm-yy
    // live share
    public Persona (String nombre, int edad, int carnet, Fecha fechaNac){ // 
        this.nombre = nombre;
        this.edad = edad;
        this.carnet = carnet;
        this.fechaNac = fechaNac;
    }
    // void
    public String presentarse(String otraPersona){
        return("Hola " + otraPersona + " me llamo: " + this.nombre );
    }

    public void cambiarNombre (String name){
        this.nombre = name;
    }
    public String getNombre(){
        return this.nombre;
    }
    

}


