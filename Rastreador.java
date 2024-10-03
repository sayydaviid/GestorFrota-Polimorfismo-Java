import java.util.HashMap;
import java.util.Map;

// Classe Rastreador para rastrear o desempenho dos veículos em tempo real
public class Rastreador<T extends Veiculo> {
    private Map<T, EventoDesempenho<? extends T>> veiculosMonitorados; // Map de veículos e seus eventos de desempenho

    // Construtor para inicializar o rastreador
    public Rastreador() {
        this.veiculosMonitorados = new HashMap<>();
    }

    // Método para adicionar um veículo ao rastreador
    public void adicionarVeiculo(T veiculo) {
        veiculosMonitorados.put(veiculo, null);
    }

    // Método para registrar um evento de desempenho para um veículo
    public void registrarEvento(T veiculo, EventoDesempenho<? extends T> evento) {
        veiculosMonitorados.put(veiculo, evento);
        System.out.println("Evento registrado para " + veiculo);
    }

    // Método para acessar os veículos monitorados
    public Map<T, EventoDesempenho<? extends T>> getVeiculosMonitorados() {
        return veiculosMonitorados;
    }
}
