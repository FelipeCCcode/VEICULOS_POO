public class Carro extends Veiculo{
    int portas;
    public Carro(int ano, String placa, String marca, int portas){
        super(ano,placa,marca);
        this.portas = portas;
    }
}