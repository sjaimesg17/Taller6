package ejercicio3taller6;

public class Profesor extends Persona{
    
    private int ID;
    
    public Profesor(int ID){
        this.ID = ID;
    }   

    public Profesor(int ID, String Nombre, String Apellido, String Apellido2) {
        super(Nombre, Apellido, Apellido2);
        this.ID = ID;
    }

    @Override
    public String retornarDatos() {
        return "--ID de Profesor{" + "ID=" + ID + '}';
    }
    
}
