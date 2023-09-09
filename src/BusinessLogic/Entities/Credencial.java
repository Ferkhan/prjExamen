package BusinessLogic.Entities;

public class Credencial {
    private int id;
    private int idUsuario;
    private int estado;
    private String clave;
    private String fechaIng;
    private String fechaMod;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
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
