import pacote4.TelevisorComDVD;
 
public class CR {
    public static void main ( String args[]) {
        TelevisorComDVD tv1 = new TelevisorComDVD();
        TelevisorComDVD tv2 = new TelevisorComDVD(50, "30 polegado", "electrolux");
        System.out.println("O objeto tv1 é " + tv1.getModelo());
        System.out.println("O objeto tv2 é " + tv2.getModelo());
        System.out.println(tv1.eject());
        System.out.println(tv1.play());
        System.out.println("O objeto tv1 esta no canal " + tv1.getCanal());
        System.out.println("O objeto tv2 esta no canal " + tv2.getCanal());
        }
}
