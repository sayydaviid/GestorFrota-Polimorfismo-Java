// Subclasse Carro que estende Veiculo e implementa métodos específicos para carros
public class Carro extends Veiculo implements OperacaoVeiculo {
  // Construtor para inicializar os atributos do carro
  public Carro(String marca, String modelo, int ano, double quilometragem) {
      super(marca, modelo, ano, quilometragem);
  }

  @Override
  public void acelerar() {
      System.out.println("Carro acelerando suavemente...");
  }

  @Override
  public void frear() {
      System.out.println("Carro freando rapidamente.");
  }

  @Override
  public void realizarManutencao() {
      System.out.println("Realizando manutenção de rotina no carro (troca de óleo, revisão geral).");
  }

  @Override
  public void realizarViagem(String origem, String destino, double distancia) {
      System.out.printf("Carro viajando de %s para %s. Distância: %.2f km.%n", origem, destino, distancia);
  }

  @Override
  public void carregarCarga(double peso) {
      System.out.printf("Carregando %,.2f kg no carro.%n", peso);
  }

  @Override
  public void descarregarCarga() {
      System.out.println("Descarregando carga do carro.");
  }
}
