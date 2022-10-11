package comunicacion;

public class Tesis extends Escrito {

    private String idea;
    private static String[] argumento;
    private String conclusion;
    private String referencias;
    private String interpretacion;
    private int factor = 5;

    public Tesis(String origen,String titulo, String autor, int paginas, String idea, String[] argumento, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea=idea;
        Tesis.argumento=argumento;
        this.conclusion=conclusion;
        this.referencias=referencias;
        this.interpretacion=interpretacion;


    }

    public void setInterpretacion(String inter) {
        this.interpretacion = inter;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }

    public void setIDea(String idea){
        this.idea = idea;
    }

    public String getIdea(){
        return this.idea;
    }
    
    public void setArgumento(String[] argu){
        Tesis.argumento= argu;
    }

    public String[] getArgumentos(){
        return argumento;
    }

    public void setConclusion(String concl){
        this.conclusion= concl;
    }

    public String getConclusion(){
        return this.conclusion;
    }

    public void setReferencias(String ref){
        this.referencias=ref;
    }

    public String getReferencias(){
        return this.referencias;
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
        this.getIdea() +"\n"+
        this.getArgumentos().length +"\n"+
        this.getConclusion() +"\n"+
        this.getReferencias();
        

    }
    
}
