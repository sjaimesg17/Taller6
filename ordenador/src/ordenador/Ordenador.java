
package ordenador;

public class Ordenador {

    private int codigo;
    private double precio;
    
    public Ordenador(){}
    
    public Ordenador(int codigo, double precio) {
        this.codigo = codigo;
        this.precio = precio;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }
  
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public String retornarDatos(){
        return "codigo: "+this.codigo+", precio: "+this.precio;
    }
}
