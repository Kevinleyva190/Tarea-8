import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Caja<String> micaja= new Caja<>(new String[10]);
        micaja.add(0,"hola");
        micaja.add(1,"adios");
        micaja.add(2,"hi");
        System.out.println(micaja);
        String tem= micaja.get(0);
        System.out.println("---------");
        CajaSinGenericos Cajasin=new CajaSinGenericos(new Object[10]);
        Cajasin.add(0,"hola");
        Cajasin.add(1,"adios");
        Cajasin.add(2,"hi");
        System.out.println(Cajasin);
        String temp2=(String)Cajasin.get(0);
        System.out.println("-----comida------");
        Caja<Comida> cajacomida=new Caja<>(new Comida[10]);
        cajacomida.add(0,new Comida("Yogurth",true));
        System.out.println(cajacomida.get(0));
        System.out.println("-------------");
        ArrayList<Comida> comidas= new ArrayList<>();
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Zanahoria",false));
        comidas.add(new Comida("Manzana",false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(13));
        ArrayList<Comida>comidas2= new ArrayList<>();
        comidas2.add(new Comida("Zanahoria",false));
        comidas2.add(new Comida("Yogurth",true));
        comidas2.add(new Comida("Danonino",true));
        comidas2.add(new Comida("Manzana",false));
        comidas2.add(new Comida("Bisteck",false));
        System.out.println(comidas2.get(3));
        comidas2.set(3,new Comida("Fresa",false));
        comidas2.add(3, new Comida("Naranja",false));
        System.out.println("---Final---");
        for (Comida comida:comidas2 ) {
            System.out.println(comida);

        }


    }
}