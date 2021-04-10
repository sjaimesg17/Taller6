
package ordenador;


public class portatil extends Ordenador{
    
    private double peso;
    
    public portatil(double peso) {
        this.peso = peso;
    }
    
    public portatil(double peso, int codigo, double precio) {
        super(codigo, precio);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
   
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public String retornarDatos(){
        
        return "PORTATIL ---> Codigo :->"+getCodigo()+", Precio :-> "+getPrecio()+", Peso :->"+this.peso+"\n\"Ideal para sus viajes\"";
    }
    
}
