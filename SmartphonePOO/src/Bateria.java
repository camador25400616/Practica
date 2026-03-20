public class Bateria {
    private int capacidadMAh;
    private String tipo;
    
    public Bateria(int capacidadMAh, String tipo){
        this.capacidadMAh = capacidadMAh;
        this.tipo = tipo;
    }
    
    public int getCapacidadMAh(){
        return this.capacidadMAh;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setCapacidadMAh(int capacidadMAh){
        this.capacidadMAh = capacidadMAh;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("===Bateria===").append("\n");
        sb.append("Capacidad mAh = ").append(this.capacidadMAh).append("\n");
        sb.append("Tipo de bateria = ").append(this.tipo).append("\n");
        return sb.toString();
    }
}
