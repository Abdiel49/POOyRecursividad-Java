public class PersonaPendeja extends Persona {
  
  private double IQ;
  private String chistesMalos;
  // ...

  public PersonaPendeja (double iq, String chistesMal,
                          String nombre, 
                          int edad, 
                          int carnet, 
                          Fecha fechaNac){

    super(nombre, edad, carnet, fechaNac);

    this.IQ=iq;
    this.chistesMalos = chistesMal;

  }

  public double getIQ(){
    return this.IQ;
  }

  public void contarChistesMalos(){
    System.out.println("Contando chiste malo " + this.chistesMalos);
    this.IQ -= 2.5;
  }


}
