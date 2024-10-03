// Subclasse Caminhao que estende Veiculo e implementa métodos específicos para caminhões
public class Caminhao extends Veiculo implements OperacaoVeiculo {
  // Construtor para inicializar os atributos do caminhão
  public Caminhao(String marca, String modelo, int ano, double quilometragem) {
      super(marca, modelo, ano, quilometragem);
  }

  @Override
  public void acelerar() {
      System.out.println("Caminhão acelerando lentamente...");
  }

  @Override
  public void frear() {
      System.out.println("Caminhão freando com cuidado devido ao peso...");
  }

  @Override
  public void realizarManutencao() {
      System.out.println("Realizando manutenção de rotina no caminhão (troca de óleo, inspeção de freios).");
  }

  @Override
  public void realizarViagem(String origem, String destino, double distancia) {
      System.out.printf("Caminhão viajando de %s para %s. Distância: %.2f km.%n", origem, destino, distancia);
  }

  @Override
  public void carregarCarga(double peso) {
      System.out.printf("Carregando %,.2f kg no caminhão.%n", peso);
  }

  @Override
  public void descarregarCarga() {
      System.out.println("Descarregando carga do caminhão.");
  }
}
