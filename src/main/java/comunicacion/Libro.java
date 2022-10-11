package comunicacion;

public class Libro extends Escrito {

    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;
    private int factor = 2;

    public Libro(String origen,String titulo, String autor, int paginas,String co_autor, String editorial, String edicion, String interpretacion ){
        super(origen,titulo,autor,paginas);   
        this.co_autor= co_autor;
        this.editorial=editorial;
        this.edicion=edicion;
        this.interpretacion=interpretacion;
    }

    public void setInterpretacion(String inter) {
        this.interpretacion = inter;
    }

    public String getInterpretacion() {
        return this.interpretacion;
    }
    
    public void setCo_autor(String coautor){
        this.co_autor=coautor;
    } 

    public String getCo_autor(){
        return this.co_autor;
    }

    public void setEditorial(String editor){
        this.editorial=editor;
    }

    public String getEditorial(){
        return this.editorial;
    }

    public void setEdicion(String edicion){
        this.edicion=edicion;
    }

    public String getEdicion(){
        return this.edicion;
    }

    @Override
    public
    int palabrasTotales(int palabrasPagina) {
        return super.getPaginas()*factor*palabrasPagina;
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
        this.getCo_autor() + "\n"+
        this.getEditorial() + "\n"+
        this.getEdicion();

    }
    
}
