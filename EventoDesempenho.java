// Classe EventoDesempenho que encapsula dados sobre o desempenho de um veículo
public class EventoDesempenho<T extends Veiculo> {
  private T veiculo;             // Veículo associado ao evento
  private double consumoCombustivel; // Consumo de combustível (litros por 100 km)
  private double eficiencia;     // Eficiência do veículo

  // Construtor para inicializar o evento de desempenho
  public EventoDesempenho(T veiculo, double consumoCombustivel, double eficiencia) {
      this.veiculo = veiculo;
      this.consumoCombustivel = consumoCombustivel;
      this.eficiencia = eficiencia;
  }

  // Método para relatar o desempenho do veículo
  public void relatarDesempenho() {
      System.out.printf("Desempenho do veículo %s: Consumo de combustível = %.2f L/100km, Eficiência = %.2f.%n",
              veiculo, consumoCombustivel, eficiencia);
  }
}
