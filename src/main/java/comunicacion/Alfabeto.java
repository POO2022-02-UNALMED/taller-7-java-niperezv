package comunicacion;

public class Alfabeto extends Pictograma {
    
    private static String letras[];
    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion=interpretacion;
    }
    

    public void setLetras(String letra){
        Alfabeto.letras=new String [] {letra};
    }
    public String[] getLetras(){
        return Alfabeto.letras;
    }

    public void setInterpretacion(String inter){
        this.interpretacion=inter;
    }

    public String getInterpretacion(){
        return this.interpretacion;
    }
    
    public int cantidadLetras(){
        return Alfabeto.letras.length;
    }

    @Override
    public
    String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String k=", ";
        String t="";
        t=String.join(k,this.getLetras());
        return t;

    }

   
}
