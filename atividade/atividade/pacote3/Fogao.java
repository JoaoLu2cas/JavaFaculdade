package pacote3;
public class Fogao {
    
    private String marca;
    private int numeroDeBocas;
    private boolean ligado;
    private int temperatura;
    
        
    public Fogao() {
            marca= "Philco";
            numeroDeBocas = 4;
            this.ligado = false; 
            this.temperatura = 0; 
    }
    public Fogao(String m, int n, boolean l, int t){
        marca = m;
        numeroDeBocas = n;
        ligado = l;
        temperatura = t;
    }
    
    public void ligar() {
        this.ligado = true;
        System.out.println("O fogão está ligado.");
    }
    
    public void desligar() {
        this.ligado = false;
        this.temperatura = 0;
        System.out.println("O fogão está desligado.");
    }
    
    public void ajustarTemperatura(int novaTemperatura) {
        if (ligado) {
            this.temperatura = novaTemperatura;
            System.out.println("Temperatura ajustada para: " + novaTemperatura + " graus.");
        } else {
            System.out.println("O fogão está desligado. Não é possível ajustar a temperatura.");
        }
    }
    
        
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getNumeroDeBocas() {
        return numeroDeBocas;
    }
    
    public void setNumeroDeBocas(int numeroDeBocas) {
        this.numeroDeBocas = numeroDeBocas;
    }
    
    public boolean getLigado() {
        return ligado;
    }
    
    public int getTemperatura() {
        return temperatura;
    }
    
    
}
