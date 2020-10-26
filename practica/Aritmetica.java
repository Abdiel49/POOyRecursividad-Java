
public class Aritmetica
{
    
    private int numeroA;
    private int numeroB;

    public Aritmetica(int numeroA, int numB)
    {
        this.numeroA = numeroA;
        this.numeroB = numB;
    }
    
    public int suma()
    {// a = 4 b = 6
        this.numeroA=numeroA+numeroB; // =10
        this.numeroB *= 2;   // = 12
        return numeroA+numeroB;
    }
    public int suma(int a, int b)
    {
        return a+b;
    }
    // void
    public int suma(int a, double b)
    {
        return  a + (int)b;
    }

}
