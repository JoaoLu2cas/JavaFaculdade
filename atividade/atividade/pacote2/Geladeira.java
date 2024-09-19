package pacote2;
public class Geladeira {
    private String marca;
    private String altura;
    private String largura;
    private String portas;
    public Geladeira(){
        marca = "Philco";
        altura = "1,90m";
        largura = "1m";
        portas = "uma porta";
    }

    public Geladeira(String m, String a, String l, String p){
        marca = m;
        altura = a;
        largura = l;
        portas = p;
    }
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getAltura(){
        return altura;
    }

    public void setAltura(String altura){
        this.altura = altura;
    }

    public String getLargura(){
        return largura;
    }

    public void setLargura(String largura){
        this.largura = largura;
    }

    public String getPortas(){
        return portas;
    }

    public void setPortas(String portas){
        this.portas = portas;
    }
}
