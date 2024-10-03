public class Main {
  public static void main(String[] args) {
      // Criando uma instância da classe Frota para gerenciar os veículos
      Frota frota = new Frota();

      // Criando instâncias de diferentes tipos de veículos e adicionando à frota
      Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 100000);
      Carro carro = new Carro("Toyota", "Corolla", 2022, 15000);
      Moto moto = new Moto("Honda", "CB500", 2021, 8000);

      frota.adicionarVeiculo(caminhao);
      frota.adicionarVeiculo(carro);
      frota.adicionarVeiculo(moto);

      // Realizando manutenção em todos os veículos da frota
      System.out.println("\n--- Realizando Manutenção ---");
      frota.realizarManutencaoEmTodos();

      // Adicionando viagens aos veículos
      System.out.println("\n--- Adicionando Viagens ---");
      frota.adicionarViagem(caminhao, "São Paulo", "Rio de Janeiro", 400);
      frota.adicionarViagem(carro, "Curitiba", "Florianópolis", 300);
      frota.adicionarViagem(moto, "Belém", "Marituba", 30);

      // Criando um rastreador para monitorar os veículos da frota
      Rastreador<Veiculo> rastreador = new Rastreador<>();
      rastreador.adicionarVeiculo(caminhao);
      rastreador.adicionarVeiculo(carro);
      rastreador.adicionarVeiculo(moto);

      // Registrando eventos de desempenho dos veículos
      System.out.println("\n--- Registrando Eventos de Desempenho ---");
      EventoDesempenho<Caminhao> eventoCaminhao = new EventoDesempenho<>(caminhao, 40.0, 0.75);
      rastreador.registrarEvento(caminhao, eventoCaminhao);

      EventoDesempenho<Carro> eventoCarro = new EventoDesempenho<>(carro, 8.0, 0.9);
      rastreador.registrarEvento(carro, eventoCarro);

      EventoDesempenho<Moto> eventoMoto = new EventoDesempenho<>(moto, 5.0, 0.95);
      rastreador.registrarEvento(moto, eventoMoto);

      // Gerando relatórios de desempenho
      System.out.println("\n--- Gerando Relatórios de Desempenho ---");
      frota.gerarRelatorioDesempenho(rastreador);
  }
}
