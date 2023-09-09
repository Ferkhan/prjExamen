package BusinessLogic.Entities;

public class Usuario {
    private int id;
    private int estado;
    private String nombre;
    private String fechaIng;
    private String fechaMod;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaIng() {
        return fechaIng;
    }
    
    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getFechaMod() {
        return fechaMod;
    }

    public void setFechaMod(String fechaMod) {
        this.fechaMod = fechaMod;
    }
}
