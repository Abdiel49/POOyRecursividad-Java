public class Fecha{
    int dia;
    int mes;
    int anio;

    public Fecha(int dia, int mes, int anio){
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }
    public boolean esValido( Fecha fecha ) {
        boolean resp = false;
        if( dia > 0 && dia < 31 && anio <= 2020)
            resp = true;
        //if()
        return resp;
    }
}