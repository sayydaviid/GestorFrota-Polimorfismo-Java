Este repositório contém um projeto em Java que implementa um sistema de gestão de frota utilizando conceitos de polimorfismo e programação orientada a objetos. O projeto está dividido em três etapas, cada uma focando no aprofundamento do uso de polimorfismo para resolver problemas reais no gerenciamento de veículos.

### Funcionalidades:

1. **Gestão de Frota de Veículos**: 
   - Classes que representam diferentes tipos de veículos (`Caminhao`, `Carro`, `Moto`) herdando de uma classe base `Veiculo`.
   - Cada tipo de veículo possui métodos personalizados para acelerar, frear e realizar manutenção, demonstrando polimorfismo em ação.

2. **Gerenciamento de Operações de Veículos**:
   - Uma interface `OperacaoVeiculo` que define operações como realizar viagens e carregar/descarregar carga.
   - A classe `Viagem` que possibilita a realização de viagens com veículos, independente de seu tipo, utilizando tipos genéricos.

3. **Integração com Sistema de Rastreamento**:
   - A classe `Rastreador` permite monitorar o desempenho dos veículos em tempo real, registrando eventos de desempenho específicos para cada tipo de veículo.
   - Geração de relatórios de desempenho dos veículos da frota, utilizando classes genéricas para aumentar a flexibilidade e extensibilidade do sistema.
