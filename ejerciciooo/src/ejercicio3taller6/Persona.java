package ejercicio3taller6;

public class Persona {
    String Nombre, Apellido, Apellido2;
    
public Persona(){}

public Persona(String Nombre, String Apellido, String Apellido2){
    this.Apellido = Apellido;
    this.Apellido2 = Apellido2;
    this.Nombre = Nombre;
}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }
   
    public String retornarDatos(){
        return "Profesor de Nombre: "+this.Nombre+ this.Apellido+this.Apellido2;
    }
}
