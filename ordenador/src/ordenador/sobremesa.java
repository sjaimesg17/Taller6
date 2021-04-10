
package ordenador;


public class sobremesa extends Ordenador{
    
    private String tipoDeTorre;
    
    public sobremesa(String tipoDeTorre) {
        this.tipoDeTorre = tipoDeTorre;
    }
    
    public sobremesa(String tipoDeTorre, int codigo, double precio) {
        super(codigo, precio);
        this.tipoDeTorre = tipoDeTorre;
    }

    public String getTipoDeTorre() {
        return tipoDeTorre;
    }
    
    public void setTipoDeTorre(String tipoDeTorre) {
        this.tipoDeTorre = tipoDeTorre;
    }
    
    @Override
     public String retornarDatos(){
        
        return "SOBREMESA ----> "+super.retornarDatos()+
               ", Descripcion tipo de torre :-> "+this.tipoDeTorre+"\n\"Es el que más pesa, pero el que menos cuesta\"";
    }
}
