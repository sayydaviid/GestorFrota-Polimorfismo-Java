import java.util.ArrayList;
import java.util.List;

public class Frota {
  private List<Veiculo> veiculos;

  public Frota() {
      this.veiculos = new ArrayList<>();
  }

  public void adicionarVeiculo(Veiculo veiculo) {
      veiculos.add(veiculo);
  }

  public void realizarManutencaoEmTodos() {
      for (Veiculo veiculo : veiculos) {
          System.out.println("Manutenção para " + veiculo);
          veiculo.realizarManutencao();
      }
  }

  public void adicionarViagem(Veiculo veiculo, String origem, String destino, double distancia) {
      if (veiculo instanceof OperacaoVeiculo) {
          Viagem<OperacaoVeiculo> viagem = new Viagem<>((OperacaoVeiculo) veiculo, origem, destino, distancia);
          viagem.iniciarViagem();
      } else {
          System.out.println("Este veículo não suporta operações de viagem.");
      }
  }

  public void gerarRelatorioDesempenho(Rastreador<? extends Veiculo> rastreador) {
      rastreador.getVeiculosMonitorados().forEach((veiculo, evento) -> {
          if (evento != null) {
              evento.relatarDesempenho();
          } else {
              System.out.println("Nenhum evento registrado para " + veiculo);
          }
      });
  }
}