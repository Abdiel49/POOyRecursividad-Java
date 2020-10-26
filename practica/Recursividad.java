public class Recursividad {

  public int factorial(int n){
    // 5 = sumatoria (5*4*3*2*1)
    int resp;
    /*for (int i = n; i > 0; i--) {
      resp = i * resp;//1*5 5*4 (5*4)*3 (5*4*3)*2 (5*4*3*2)*1
    }*/
    if(n == 0 || n == 1){
      resp = 1;
    }else {
      resp = n * factorial(n-1) ;
    }
    

    //    factorial(5)
    /*5 * factorial(4) <- 24 = 120
      4 * factorial(3) <- 6 = 24
      3 * factorial(2) <- 2 = 6
      2 * factorial(1) <- 1 = 2
      1
    /**
     * i=5    resp=1
     * i=4    resp=5*1
     * i=3    resp=(5*1)*4 
     * i=2    resp=(5*4*1)*3
     * i=1    resp=(5*4*1*3)*2
     * i=0    resp=(5*4*1*3*2)*1
     */
    return resp;
  }
  /**
   * Escribe un metodo que permita saber 
   * si todos los d ́ıgitos de un numero n entero positivo, son pares
   * 0 < n < 5000
   * 
   * 1462 false
   * 222  true
   * 312  false
   * 4445 false
   * 000  true
   * 2    true
   * 
   * a = 1462 -> b = a % 10 => 2 es par? seguirbuscando : return false
   * a = (int) a/10 = 122 -> a=122 -> b = a%10 => 2 ???
   * a = 12 
   * a = 1
   * 
   * 
   *  0  1  2  3
   * [25,36,24,62] .lenght = 4
   * String [] char
   *              0   1   2   3   4
   * "holis" -> ['h','o','l','i','s'] -> .lenght = 5
   * 
   * 
   * 
   * 
   * 
   * */ 



  public boolean todosPar(int n){
    int num = 28456;
    String a = num+"";
    for (int i = 0; i < a.length(); i++) {
      int parseN = Integer.parseInt(a.charAt(i)+""); 
      if( parseN %2 ==0 ){

      }
    } 
    

/*
    boolean resp = false;
    if(n < 10){
      if( n % 2 == 0){
        resp = true;
      }
    }else{//1462
      if(todosPar(n%10)){
        resp = todosPar( n/10 );
      }
    }
    return resp;*/
  }





}
