import java.util.UUID;
public class PruebaMain {

    public static void main(String[] args){
        UUID idd = UUID.randomUUID();
        CuentaConstructor c1 = new CuentaConstructor(idd,"carlos","carlos.arrobagmail.com",true);
        CuentaConstructor c2 = new CuentaConstructor(idd,"carlos","carlos.arrobagmail.com");
        CuentaConstructor c3 = new CuentaConstructor("carlos","carlos.arrobagmail.com");

        c1.mostrar();
        System.out.println("-----------------------------------");
        c2.mostrar();
        System.out.println("-----------------------------------");
        c3.mostrar();
    }
}
