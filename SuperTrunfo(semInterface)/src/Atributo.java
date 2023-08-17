
public class Atributo{

    private String nome;
    private double valor;
    
    
	public Atributo(String nome, double valor) {
		super();
		this.nome=nome;
		this.valor=valor;
	}
	
	


	@Override
	public String toString() {
		return nome +": "+ valor ;
	}




	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

} // Fim public class Atributo