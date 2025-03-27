public class Veiculo{
    String placa, marca;
    int ano;
    public Veiculo(int ano, String placa, String marca){
        this.ano = ano;
        this.placa = placa;
        this.marca = marca;
    }
    public int aplicar_imposto(int ano){
        return 20*(100 - (2025-ano));
    }
}