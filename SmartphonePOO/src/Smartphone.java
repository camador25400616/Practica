public class Smartphone {
    private String numeroSerie;
    private String marca;
    private String modelo;
    private Procesador procesador;
    private Bateria bateria;
    private SistemaOperativo sistemaOperativo;
    
    public Smartphone(String numeroSerie, String marca, String modelo, Procesador procesador, Bateria bateria, SistemaOperativo sistemaOperativo){
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.bateria = bateria;
        this.sistemaOperativo = sistemaOperativo;
    }
    
    public String getNumeroSerie(){
        return this.numeroSerie;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public Procesador getProcesador(){
        return this.procesador;
    }
    
    public Bateria getBateria(){
        return this.bateria;
    }
    
    public SistemaOperativo getSistemaOperativo(){
        return this.sistemaOperativo;
    }
    
    public void setNumeroSerie(String numeroSerie){
        this.numeroSerie = numeroSerie;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setProcesador(Procesador procesador){
        this.procesador = procesador;
    }
    
    public void setBateria(Bateria bateria){
        this.bateria = bateria;
    }
    
    public void setSistemaOperativo(SistemaOperativo sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("===Smartphone===").append("\n");
        sb.append("Numero de serie = ").append(this.numeroSerie).append("\n");
        sb.append("Marca = ").append(this.marca).append("\n");
        sb.append("Modelo = ").append(this.modelo).append("\n\n");
        sb.append("Procesador = \n").append(getProcesador()).append("\n");
        sb.append("Bateria = \n").append(getBateria()).append("\n");
        sb.append("Sistema Operativo = \n").append(getSistemaOperativo()).append("\n");
        return sb.toString();
    }
}
