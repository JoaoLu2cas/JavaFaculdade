package pacote4;
import pacote1.Televisor;

public class TelevisorComDVD extends Televisor{
   public TelevisorComDVD(){
        canal = 31;
        tamanho = "20 polegadas";
        modelo = "PHILCO";
        }
        public String eject ( ) {
        return "Eject ativado";
        }
        public String play ( ) {
        return "Função Play ativada";
        }
        public String stop ( ) {
        return "Função Stop ativada";
        }
        public String pause ( ) {
        return "Função Pause ativada";
        }
        public  TelevisorComDVD(int c,String t,String m) {
            canal = c;
            tamanho = t;
            modelo = m;
         }   
       
}
