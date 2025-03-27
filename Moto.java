public class Moto extends Veiculo{
    int cilindradas;
    public Moto(int ano, String placa, String marca, int cilindradas){
        super(ano,placa,marca);
        this.cilindradas = cilindradas;
    }
}