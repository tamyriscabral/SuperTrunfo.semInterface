
public class Carta{
    
    private String nome;
    private String código;
    private Atributo atributo1;
    private Atributo atributo2;
    private Atributo atributo3;
    private Atributo atributo4;
    private boolean supertrunfo;

    
    
	public Carta() {
		super();
	}

	
	
	public Carta(String nome, String código, Atributo atributo1, Atributo atributo2, Atributo atributo3,
			Atributo atributo4) {
		super();
		this.nome = nome;
		this.código = código;
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
		this.atributo4 = atributo4;
	}



	public void SuperTrunfo (boolean supertrunfo) {
		this.supertrunfo=supertrunfo;
	}

	/**
     * @return a carta formatada
     */
    @Override
    public String toString( ) {
        return 	"-----------------------------\n"
                  + "| Código: " + código + "\n"
                  + "| Nome: " + nome + "\n"
                  + "| " + atributo1 + "\n"
                  + "| " + atributo2 + "\n"
                  + "| " + atributo3 + "\n"
                  + "| " + atributo4 + "\n"
                  + "-----------------------------";
    } // Fim toString( )
    
    /**
     * @return o nome da carta
     */
    public String getNome( ) {
        return nome;
    } // Fim getNome( )
    
    /**
     * @param nome o nome da carta a ser configurado
     */
    public void setNome( String nome ) {
        this.nome = nome;
    } // Fim setNome( String nome )
    
    /**
     * @return o código da carta
     */
    public String getCódigo( ) {
        return código;
    } // Fim getCódigo( )
    
    /**
     * @param código o código da carta a ser configurado
     */
    public void setCódigo( String código ) {
        this.código = código;
    } // Fim setCódigo( String código )

	public Atributo getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(Atributo atributo1) {
		this.atributo1 = atributo1;
	}


	public Atributo getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(Atributo atributo2) {
		this.atributo2 = atributo2;
	}


	public Atributo getAtributo3() {
		return atributo3;
	}

	public void setAtributo3(Atributo atributo3) {
		this.atributo3 = atributo3;
	}

	public Atributo getAtributo4() {
		return atributo4;
	}

	public void setAtributo4(Atributo atributo4) {
		this.atributo4 = atributo4;
	}

	public boolean isSupertrunfo() {
		return supertrunfo;
	}

	public void setSupertrunfo(boolean supertrunfo) {
		this.supertrunfo = supertrunfo;
	}
	
	


    
    
} // Fim class Carta