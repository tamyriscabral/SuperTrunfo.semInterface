
public class JogadorRandômico extends JogadorAbstrato {
    
    private String nome;
    private String usuário;
    private Baralho monte;
    private double valor;
    private int pontos;
    /**
     *
     */
   
    public JogadorRandômico(String usuário) {
    	super(usuário);
    }
    
    public void JogarTurno( ){
    
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome( String nome ) {
        this.nome = nome;
    }
    
    public String getUsuário() {
        return usuário;
    }
    
    public void setUsuário( String usuário ) {
        this.usuário = usuário;
    } 
    
    public Baralho getMonte() {
        return monte;
    } 
    
    public void setMonte( Baralho monte ) {
        this.monte = monte;
    } 
    
    public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
		
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	
} // Fim public class JogadorRandômico extends JogadorAbstrato