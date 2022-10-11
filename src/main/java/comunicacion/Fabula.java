package comunicacion;

public class Fabula extends Escrito {
    private String ensenanza;
    private String interpretacion;
    private int factor=1;

    public Fabula(String origen,String titulo, String autor, int paginas, String ense, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza=ense;
        this.interpretacion=interpretacion;
    }

    public void setInterpretacion(String inter) {
        this.interpretacion = inter;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setEnsenanza(String ense){
        this.ensenanza=ense;
    }

    public String getEnsenanza(){
        return this.ensenanza;
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
        this.getEnsenanza();
    }
    
}
