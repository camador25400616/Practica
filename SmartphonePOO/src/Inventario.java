public class Inventario {
    Smartphone [] smartphones;
    
    public Inventario(Smartphone [] smartphones){
        this.smartphones = smartphones;
    }
    
    public void mostrarInventario(){
        for(int i=0; i<smartphones.length; i++){
            System.out.println(smartphones[i]);
        }
    }
    
    public void buscarPorMarca(String marca){
        for(int i=0; i<smartphones.length; i++){
            if(smartphones[i].getMarca().equalsIgnoreCase(marca)){
                System.out.println(smartphones[i]);
            }
        }
    }
}
