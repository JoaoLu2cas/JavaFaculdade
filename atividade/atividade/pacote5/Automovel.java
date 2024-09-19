package pacote5;
public class Automovel {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;
    private int velocidade;

   
    public Automovel() {
        marca = "Toyota";
        modelo = "Corola Cross";
        ano = 2025;
        this.ligado = false; 
        this.velocidade = 0; 
    }
    public Automovel(String m, String mo, int a, boolean l, int v){
        marca = m;
        modelo = mo;
        ano = a;
        ligado = l;
        velocidade = v;
    }


   
    public void ligar() {
        this.ligado = true;
        System.out.println("O automóvel está ligado.");
    }

    public void desligar() {
        this.ligado = false;
        this.velocidade = 0;
        System.out.println("O automóvel está desligado.");
    }

    public void acelerar(int incremento) {
        if (ligado) {
            this.velocidade += incremento;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("O automóvel está desligado. Não é possível acelerar.");
        }
    }

    public void frear(int decremento) {
        if (ligado) {
            this.velocidade -= decremento;
            if (this.velocidade < 0) {
                this.velocidade = 0;
            }
            System.out.println("Freando. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("O automóvel está desligado. Não é possível frear.");
        }
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
