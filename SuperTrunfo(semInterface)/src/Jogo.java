
import java.io.File;

public class Jogo{

    private String tema;
    private String atributo;

    
    public Jogo(  ) {
        super( );

    } 
    public Jogo(String tema  ) {
        super( );
        this.tema=tema;

    } // Fim construtor
   
    public File selecionarArquivo( String localDados ){
        return null;
    }
    
    public void jogarRodada (Baralho baralho, Carta carta1, Carta carta2, JogadorReal jogador, JogadorRandômico maquina){
    	
    	if(baralho.jogo.getAtributo() == baralho.atributos[2]) {
    		
    		if (carta1.getAtributo1().getValor()>carta2.getAtributo1().getValor()) {
    			System.out.println("Parabéns! Você ganhou essa rodada!");
    			jogador.setPontos(jogador.getPontos()+1);
    		 
    		}
    		
    		 if (carta1.getAtributo1().getValor()< carta2.getAtributo1().getValor()) {
    			 System.out.println("Poxa, você perdeu dessa vez.");
    			 maquina.setPontos(maquina.getPontos()+1);
    		
    		}
    		 
    		else {
    			jogador.setPontos(jogador.getPontos());
    			maquina.setPontos(maquina.getPontos());
    			System.out.println("Empate");
    		}
    	}if (baralho.jogo.getAtributo() ==baralho.atributos[3]) {
    		
    		if (carta1.getAtributo2().getValor()> carta2.getAtributo2().getValor()) {
    		 jogador.setPontos(jogador.getPontos()+1);
    		 System.out.println("Parabéns! Você ganhou essa rodada!");
    		}
    		
    		 if (carta1.getAtributo2().getValor()<carta2.getAtributo2().getValor()) {
    			 maquina.setPontos(maquina.getPontos()+1);
    		
    			 System.out.println("Poxa, você perdeu dessa vez.");
    		}
    		else {
    			jogador.setPontos(jogador.getPontos());
    			maquina.setPontos(maquina.getPontos());
    			System.out.println("Empate");
    		}
    	}if(baralho.jogo.getAtributo() == baralho.atributos[4]) {

    	
    		if (carta1.getAtributo3().getValor()> carta2.getAtributo3().getValor()) {
    		 jogador.setPontos(jogador.getPontos()+1);
    		 System.out.println("Parabéns! Você ganhou essa rodada!");
    		}
    		 if (carta1.getAtributo3().getValor()<carta2.getAtributo3().getValor()) {
    		maquina.setPontos(maquina.getPontos()+1);
    		System.out.println("Poxa, você perdeu dessa vez.");
    		}
    		else {
    		jogador.setPontos(jogador.getPontos());
    		maquina.setPontos(maquina.getPontos());
    		System.out.println("Empate");
    		}
    	}
    	if(baralho.jogo.getAtributo() == baralho.atributos[5]) {
    		
    		if (carta1.getAtributo4().getValor()> carta2.getAtributo4().getValor()) {
    		 jogador.setPontos(jogador.getPontos()+1);
    		 System.out.println("Parabéns! Você ganhou essa rodada!");
    		}
    		 if (carta1.getAtributo4().getValor()<carta2.getAtributo4().getValor()) {
    		maquina.setPontos(maquina.getPontos()+1);
    		System.out.println("Poxa, você perdeu dessa vez.");
    		}
    		else {
    		jogador.setPontos(jogador.getPontos());
    		maquina.setPontos(maquina.getPontos());
    		System.out.println("Empate");
    		}
    	}
 
    }
    
    public String getTema( ) {
        return tema;
    }
    
    /**
     * @param tema Passa como parâmetro o tema
     */
    public void setTema( String tema ) {
        this.tema = tema;
    }
    
    /**
     * @return
     */
    public JogadorAbstrato mostarVencedor( ) {
        return null;
    }
    
    /**
     * @return
     */
    public void ranking(JogadorReal jogador, JogadorRandômico maquina ) {
    	System.out.println("Ranking atual: ");
    	System.out.println("Você: " + jogador.getPontos());
    	System.out.println("Seu adversário:  " + maquina.getPontos());
    }


	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}
    
    
} // Fim public class Jogo