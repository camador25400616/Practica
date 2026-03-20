public class Main {
    public static void main(String[] args){
        Procesador p1 = new Procesador("Ryzen",8,95.5);
        //System.out.println(p1);
        Procesador p2 = new Procesador("AMD",12,120);
        //System.out.println(p2);
        Bateria b1 = new Bateria(5000, "3q96");
        //System.out.println(b1);
        Bateria b2 = new Bateria(4500, "7b23");
        //System.out.println(b2);
        SistemaOperativo s1 = new SistemaOperativo("Android","2.8");
        //System.out.println(s1);
        SistemaOperativo s2 = new SistemaOperativo("IOS","2.5");
        //System.out.println(s2);
        Smartphone c1 = new Smartphone("25400616","Samsung","Galaxy",p2,b1,s1);
        System.out.println(c1);
        Smartphone c2 = new Smartphone("25400617","Lenovo","Legion",p1,b1,s1);
        System.out.println(c2);
        Smartphone c3 = new Smartphone("25400618","Iphone","Iphone 18 Pro Max Ultra",p2,b2,s2);
        System.out.println(c3);
    }
}
