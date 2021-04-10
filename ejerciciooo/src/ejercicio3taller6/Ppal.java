package ejercicio3taller6;

public class Ppal {

    public static void main(String[] args) {
        Persona a = new Persona("Alan " , "Ramirez " , "Leyton ");
        System.out.println(a.retornarDatos());
        Profesor p = new Profesor(12345);
        System.out.println(p.retornarDatos());
        ProfesorInterino ap = new ProfesorInterino ("24/2/2020", 1234);
        System.out.println(ap.retornarDatos());
    }
    
}
