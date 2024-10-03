// Interface OperacaoVeiculo que define métodos para operações comuns entre veículos
public interface OperacaoVeiculo {
  void realizarViagem(String origem, String destino, double distancia);
  void carregarCarga(double peso);
  void descarregarCarga();
}
