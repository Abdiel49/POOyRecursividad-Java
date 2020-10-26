
public class PersonaDiscapacitada extends Persona {
  
  private String discapacidad;
  private boolean marchando;
  private boolean bloqueando;

 
  public PersonaDiscapacitada(
          String discapacidad, 
          String nombre, 
          int edad, 
          int carnet, 
          Fecha fechaNac){

    super(nombre, edad, carnet,fechaNac);
    this.discapacidad = discapacidad;
    this.bloqueando = false;
    this.marchando = false;
  }
  public boolean getMarchado(){
    return this.marchando;
  }
  public boolean getBloqueando(){
    return this.bloqueando;
  }

  public String getDiscapacidad(){
    return this.discapacidad;
  }
  public void marcharPorBono(){
    this.marchando = true;
    this.bloqueando = false;
    System.out.println("Marchando... !");
  }
  public void bloqueandoPorBono(){
    this.bloqueando = true;
    this.marchando = false;
    System.out.println("bloqueando");
  }


}
