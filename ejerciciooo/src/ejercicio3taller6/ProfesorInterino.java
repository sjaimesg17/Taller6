package ejercicio3taller6;

public class ProfesorInterino extends Profesor{
    
    private String Date;
    
    public ProfesorInterino(String Date, int ID) {
        super(ID);
        this.Date = Date;
    }

    public ProfesorInterino(String Date, int ID, String Nombre, String Apellido, String Apellido2) {
        super(ID, Nombre, Apellido, Apellido2);
        this.Date = Date;
    }

    @Override
    public String retornarDatos() {
        return "--ProfesorInterino se incorporo{" + "Date=" + Date + '}';
    }
    
}
