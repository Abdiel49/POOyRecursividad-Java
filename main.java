public class main {
  public static void main(String[] args) {
     
    Fecha fechaNac = new Fecha(12,13,2010);

    PersonaDiscapacitada chovis = new PersonaDiscapacitada("Pendeja", "Chovis", 27, 88888, fechaNac);
    PersonaPendeja javi = new PersonaPendeja(20, "Busco chicas cochabamba", "javi", 24, -2365, fechaNac);
    /*
    String dis = chovis.getDiscapacidad();
    System.out.println("Discapacidad de Chovis :"+dis);
    System.out.println(chovis.getNombre()+ " marchado: "+ chovis.getMarchado() + " Bloqueando: "+chovis.getBloqueando());

    chovis.marcharPorBono();
    System.out.println(chovis.getNombre()+ " marchado: "+ chovis.getMarchado() + " Bloqueando: "+chovis.getBloqueando());
    */
    System.out.println("IQ Javi : "+javi.getIQ());
    javi.contarChistesMalos();
    
    System.out.println("IQ Javi : "+javi.getIQ());
    System.out.println(javi.presentarse("papi"));
    
    
    
    /*  
    Fecha fechaNac = new Fecha(23, 05, 2030);
    Persona pepe = new Persona("Pepe", 25, 922215, fechaNac);

    System.out.println("Persona nombre: "+ pepe.getNombre());

    Persona juan = new Persona("Juan", 25, 922215, fechaNac);
    Persona Maria = juan;

    juan.cambiarNombre("Juan");

    System.out.println("Persona Juan nombre: "+ juan.getNombre());
    System.out.println("Persona Pepe nombre: "+ pepe.getNombre());

    pepe.cambiarNombre("Pepe");

    System.out.println("Persona Juan nombre: "+ juan.getNombre());
    System.out.println("Persona Pepe nombre: "+ pepe.getNombre());

    /**
     * por valor: primitivos 
     * 
     * por referencia: referencia 
     * 
     */
    /*
     * `System.out.println(fechaNac.esValido(fechaNac)); String saludo =
     * pepe.presentarse("Goloso"); System.out.println(saludo);
     */
  }

  public static int suma (int a){
    a = a + 10;
    return a;
  }
}
