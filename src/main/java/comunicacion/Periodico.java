package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String primicia;
    private String interpretacion;
    private int factor=10;

    public Periodico(String origen,String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion ){
        super(origen, titulo, autor, paginas);
        this.fecha= fecha;
        this.primicia= primicia;
        this.interpretacion= interpretacion;
    }

    public void setInterpretacion(String inter) {
        this.interpretacion = inter;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setFecha(String fc){
        this.fecha=fc;
    }

    public String getFecha(){
        return this.fecha;
    }

    public void setPrimicia(String pri){
        this.primicia=pri;
    }

    public String getPrimicia(){
        return this.primicia;
    }


    @Override
    public
    int palabrasTotales(int palabrasPagina) {
        return super.getPaginas() * factor * palabrasPagina;
    }

    @Override
    public
    String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        return super.getOrigen() + "\n"+
        super.getTitulo() + "\n"+
        super.getAutor() + "\n"+
        super.getPaginas() + "\n"+
        this.getFecha()+"\n"+
        this.getPrimicia();
    }
    
}
