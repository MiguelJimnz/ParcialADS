package org.example;

public class LineaTelefonica{
//n cadenas  lineas de telefono
//metodos crear llamadas locales 50, largaDistancia350, celular 150
     //crear linea telefonica. Escoger linea telefonica. mostar info detallada por cabina,
    //main pedir usuario tiempo de llamada
    //Mostar info de todas las cabinas
    //reiniciar
    private int minLlamadaLocal=50;
    private int minLlamadaLarDis=350;
    private int minLlamadaCelular=150;
    private int minutosLlamadaLocal=0;
    private int minutosLlamadaLargaDIs=0;
    private int minutosLlamadaCelular=0;
    private int costoLlamadas=0;

    public int getMinLlamadaLocal() {
        return minLlamadaLocal;
    }

    public void setMinLlamadaLocal(int minLlamadaLocal) {
        this.minLlamadaLocal = minLlamadaLocal;
    }

    public int getMinLlamadaLarDis() {
        return minLlamadaLarDis;
    }

    public void setMinLlamadaLarDis(int minLlamadaLarDis) {
        this.minLlamadaLarDis = minLlamadaLarDis;
    }

    public int getMinLlamadaCelular() {
        return minLlamadaCelular;
    }

    public void setMinLlamadaCelular(int minLlamadaCelular) {
        this.minLlamadaCelular = minLlamadaCelular;
    }

    public int getMinutosLlamadaLocal() {
        return minutosLlamadaLocal;
    }

    public void setMinutosLlamadaLocal(int minutosLlamadaLocal) {
        this.minutosLlamadaLocal = minutosLlamadaLocal;
    }

    public int getMinutosLlamadaLargaDIs() {
        return minutosLlamadaLargaDIs;
    }

    public void setMinutosLlamadaLargaDIs(int minutosLlamadaLargaDIs) {
        this.minutosLlamadaLargaDIs = minutosLlamadaLargaDIs;
    }

    public int getMinutosLlamadaCelular() {
        return minutosLlamadaCelular;
    }

    public void setMinutosLlamadaCelular(int minutosLlamadaCelular) {
        this.minutosLlamadaCelular = minutosLlamadaCelular;
    }

    public int getCostoLlamadas() {
        return costoLlamadas;
    }

    public void setCostoLlamadas(int costoLlamadas) {
        this.costoLlamadas = costoLlamadas;
    }

    public LineaTelefonica() {
    }

    public LineaTelefonica(int minLlamadaLocal, int minLlamadaLarDis, int minLlamadaCelular, int minutosLlamadaLocal, int minutosLlamadaLargaDIs, int minutosLlamadaCelular, int costoLlamadas) {
        this.minLlamadaLocal = minLlamadaLocal;
        this.minLlamadaLarDis = minLlamadaLarDis;
        this.minLlamadaCelular = minLlamadaCelular;
        this.minutosLlamadaLocal = minutosLlamadaLocal;
        this.minutosLlamadaLargaDIs = minutosLlamadaLargaDIs;
        this.minutosLlamadaCelular = minutosLlamadaCelular;
        this.costoLlamadas=costoLlamadas;
    }

    @Override
    public String toString() {
        return "LineaTelefonica{" +
                "minLlamadaLocal=" + minLlamadaLocal +
                ", minLlamadaLarDis=" + minLlamadaLarDis +
                ", minLlamadaCelular=" + minLlamadaCelular +
                ", minutosLlamadaLocal=" + minutosLlamadaLocal +
                ", minutosLlamadaLargaDIs=" + minutosLlamadaLargaDIs +
                ", minutosLlamadaCelular=" + minutosLlamadaCelular +
                '}';
    }

    public void crearLinea(int minutosLlamadaLocal, int minutosLlamadaLargaDIs,int minutosLlamadaCelular,int costoLlamadas){

        this.minutosLlamadaLocal=minutosLlamadaLocal;
        this.minutosLlamadaCelular=minutosLlamadaCelular;
        this.minutosLlamadaLargaDIs=minutosLlamadaLargaDIs;
        this.costoLlamadas=costoLlamadas;



    }
    //met. llamada local
    public int llamadaLocal(int minLlamadaLocal, int tiempoLlamada){
        costoLlamadas= minLlamadaLocal*tiempoLlamada;
        minutosLlamadaLocal+=tiempoLlamada;
        return costoLlamadas;
    }
    public int llamadaLargaDistancia(int minLlamadaLarDis, int tiempoLlamada){
        costoLlamadas=minutosLlamadaLargaDIs*tiempoLlamada;
        minutosLlamadaLargaDIs+=tiempoLlamada;
        return costoLlamadas;
    }
    public int llamadaCelular(int minLlamadaCelular, int tiempoLlamada){
        costoLlamadas=minutosLlamadaCelular*tiempoLlamada;
        minutosLlamadaCelular+=tiempoLlamada;
        return costoLlamadas;
    }






}
