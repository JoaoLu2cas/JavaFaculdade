package pacote1;

public class Televisor {
    protected int canal;
    protected String tamanho;
    protected String modelo;

public Televisor() { 
    canal = 4;
    tamanho = "20 polegadas";
    modelo = "LG";
 }
public  Televisor(int c,String t,String m) {
    canal = c;
    tamanho = t;
    modelo = m;
 }
    public String getModelo() {
    return modelo;
 }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getTamanho(){
        return tamanho;
    }

    public void setTamanho(String tamanho){
        this.tamanho = tamanho;
    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

}