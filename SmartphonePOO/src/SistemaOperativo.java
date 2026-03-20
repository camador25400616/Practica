public class SistemaOperativo {
    private String nombre;
    private String version;
    
    public SistemaOperativo(String nombre, String version){
        this.nombre = nombre;
        this.version = version;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getVersion(){
        return this.version;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setVersion(String version){
        this.version = version;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("===Sistema Operativo===").append("\n");
        sb.append("Nombre del SO = ").append(this.nombre).append("\n");
        sb.append("Version = ").append(this.version).append("\n");
        return sb.toString();
    }
}
