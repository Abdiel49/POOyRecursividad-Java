public class Triangulos extends FIguraGeometrica {
  double catetoA;
  double catetoB;
  double catetoC;

  double alto;
  double ancho;

  public Triangulos(){
    //super();
    this.area = calcularArea();
  }
  double calcularArea(){
    return 2.0;
  }

}
