// Subclasse Moto que estende Veiculo e implementa métodos específicos para motos
public class Moto extends Veiculo implements OperacaoVeiculo {
  // Construtor para inicializar os atributos da moto
  public Moto(String marca, String modelo, int ano, double quilometragem) {
      super(marca, modelo, ano, quilometragem);
  }

  @Override
  public void acelerar() {
      System.out.println("Moto acelerando rapidamente...");
  }

  @Override
  public void frear() {
      System.out.println("Moto freando com o uso dos freios dianteiro e traseiro.");
  }

  @Override
  public void realizarManutencao() {
      System.out.println("Realizando manutenção de rotina na moto (ajuste da corrente, revisão do motor).");
  }

  @Override
  public void realizarViagem(String origem, String destino, double distancia) {
      System.out.printf("Moto viajando de %s para %s. Distância: %.2f km.%n", origem, destino, distancia);
  }

  @Override
  public void carregarCarga(double peso) {
      System.out.printf("Carregando %,.2f kg na moto (nota: capacidade limitada).%n", peso);
  }

  @Override
  public void descarregarCarga() {
      System.out.println("Descarregando carga da moto.");
  }
}
