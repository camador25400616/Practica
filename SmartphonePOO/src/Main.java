public class Main {
    public static void main(String[] args){
        Procesador p1 = new Procesador("Ryzen",8,95.5);
        //System.out.println(p1);
        Procesador p2 = new Procesador("AMD",12,120);
        //System.out.println(p2);
        Procesador p3 = new Procesador();
        //System.out.println(p3);
        Bateria b1 = new Bateria(5000, "3q96");
        //System.out.println(b1);
        Bateria b2 = new Bateria(4500, "7b23");
        //System.out.println(b2);
        SistemaOperativo s1 = new SistemaOperativo("Android","2.8");
        //System.out.println(s1);
        SistemaOperativo s2 = new SistemaOperativo("IOS","2.5");
        //System.out.println(s2);
        Smartphone c1 = new Smartphone("25400616","Samsung","Galaxy",p2,b1,s1);
        //System.out.println(c1);
        Smartphone c2 = new Smartphone("25400617","Lenovo","Legion",p1,b1,s1);
        //System.out.println(c2);
        Smartphone c3 = new Smartphone("25400618","Iphone","Iphone 18 Pro Max Ultra",p2,b2,s2);
        //System.out.println(c3);
        
        //PROBLEMA 1
        
        //Antes de cambiar el procesador
        //System.out.println(c1);
        //c1.setProcesador(p1);
        //Despues de cambiar el procesador
        //System.out.println(c1);
        
        //PROBLEMA 2
        //Cambia la capacidad de la batería
        //Usando getter a setter
        
        //c1.getBateria().setCapacidadMAh(7000);
        //System.out.println(c1);
        
        //PROBLEMA 3
        //Instala otro SO
        
        //c2.setSistemaOperativo(s2);
        //System.out.println(c2);
        
        //PROBLEMA 4
        //Usa un constructor sobrecargado
        //Asigna procesador vacio
        
        //c3.setProcesador(p3);
        //System.out.println(c3);
        
        //PROBLEMA 5
        //Guarda los smartphones en un arreglo
        //Recorre y muestra todo
        
        //Smartphone[] lista = {c1, c2, c3};
        //Inventario inv = new Inventario(lista);
        //inv.mostrarInventario();
    }
}
