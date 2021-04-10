
package ordenador;

public class principal {
    
    public static void main(String[] args) {
        Ordenador o = new Ordenador(455112,1500000);
        System.out.println(o.retornarDatos());
        
        portatil p = new portatil(5.8,85521,4200000.000);
        System.out.println(p.retornarDatos());
        
        sobremesa s = new sobremesa("VERSA N-21 (ATX)",633254,2000000.000);
        System.out.println(s.retornarDatos());
    }
}
