
public class JogadorReal extends JogadorAbstrato {
    
    private String nome;
    private String usuário;
    private Baralho monte;
    private double valor;
    private int pontos;
    
    /**
     * Construtor sem parâmetros
     */
    
    public JogadorReal(String nome) {
        super( nome);
    } // Fim public JogadorAbstrato( String nome, String usuário )
    
        public String getNome() {
        return nome;
    } // public String getNome()
    
    /**
     * @param nome para ser configurado.
     */
    public void setNome( String nome ) {
        this.nome = nome;
    } // Fim public void setNome( String nome )
    
    /**
     * @return o usuário.
     */
    public String getUsuário() {
        return usuário;
    } // Fim public String getUsuário()
    
    /**
     * @param usuário configura o usuário.
     */
    public void setUsuário( String usuário ) {
        this.usuário = usuário;
    } // Fim public void setUsuário( String usuário )
    
    /**
     * @return o monte.
     */
    public Baralho getMonte() {
        return monte;
    } // Fim public Baralho getMonte()
    
    /**
     * @param monte o monte que será configurado.
     */
    public void setMonte( Baralho monte ) {
        this.monte = monte;
    } // Fim public void setMonte( Baralho monte )

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
	
	
    
    
} // Fim public class JogadorReal extends JogadorAbstrato