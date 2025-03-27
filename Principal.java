public class Principal {
    public static void main (String []args){
        Carro c1 = new Carro(2025,"ABCD", "BMW", 4);
        Moto m1 = new Moto(2024, "ASOL","Corola", 150);
        System.out.println("O valor da moto foi" + m1.aplicar_imposto(m1.ano));
        System.out.println("O valor do imposto do carro foi " + c1.aplicar_imposto(c1.ano));

    }
}