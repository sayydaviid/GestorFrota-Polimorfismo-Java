// Classe base abstrata para representar um veículo genérico
public abstract class Veiculo {
  protected String marca;      // Marca do veículo
  protected String modelo;     // Modelo do veículo
  protected int ano;           // Ano de fabricação do veículo
  protected double quilometragem; // Quilometragem do veículo

  // Construtor para inicializar os atributos básicos do veículo
  public Veiculo(String marca, String modelo, int ano, double quilometragem) {
      this.marca = marca;
      this.modelo = modelo;
      this.ano = ano;
      this.quilometragem = quilometragem;
  }

  // Método abstrato para acelerar - deve ser implementado pelas subclasses
  public abstract void acelerar();

  // Método abstrato para frear - deve ser implementado pelas subclasses
  public abstract void frear();

  // Método abstrato para realizar manutenção - deve ser implementado pelas subclasses
  public abstract void realizarManutencao();

  @Override
  public String toString() {
      return String.format("%s %s (%d) - %,.2f km", marca, modelo, ano, quilometragem);
  }
}
