// Classe genérica Viagem que permite gerenciar viagens de qualquer tipo de veículo
public class Viagem<T extends OperacaoVeiculo> {
  private T veiculo;             // Veículo que realizará a viagem
  private String origem;         // Origem da viagem
  private String destino;        // Destino da viagem
  private double distancia;      // Distância da viagem

  // Construtor para inicializar os atributos da viagem
  public Viagem(T veiculo, String origem, String destino, double distancia) {
      this.veiculo = veiculo;
      this.origem = origem;
      this.destino = destino;
      this.distancia = distancia;
  }

  // Método para iniciar a viagem com o veículo
  public void iniciarViagem() {
      veiculo.realizarViagem(origem, destino, distancia);
  }
}
