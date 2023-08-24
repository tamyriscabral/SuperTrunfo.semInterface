import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List; 
import java.util.ArrayList;

public class Baralho extends LinkedList<Carta> {
    
    private String tema;
	private File arquivo;
	int i=0;
	String[] atributos;
	String[] dadosDaCarta;
	Double[] dadosDaCartaD = new Double [6];
	Jogo jogo = new Jogo();
	JogadorAbstrato abs;
 	Atributo[] atributo = new Atributo [4];
    
    public Baralho(String tema) {
        this.tema=tema;
    }


	Scanner leitor = new Scanner( System.in );

    public void carregar() {
    	String nomeDoArquivo = "";


        System.out.println( "Escolha uma opção para o Jogo:\n" );
        System.out.println( "0 - Sair do Jogo" );
        System.out.println( "1 - Aviões" );
        System.out.println( "2 - Carros" );
        System.out.println( "3 - Heróis" );
        System.out.println( "4 - Dinossauros" );

        int selecionarOpção = leitor.nextInt(); // Faz a leitura das opções.
       
        

        // Faz a verificação se a opção digitada é inválida e lança uma exceção.
        if ( selecionarOpção < 0 || selecionarOpção > 4 ) {
        	throw new IllegalArgumentException( "Opção inválida. Selecione uma opção válida." );
        	}
        // lança um erro para opção invalida
        try {
             // A instrução switch é usada para carregar o tema do jogo selecionada ou sair do jogo.
             switch ( selecionarOpção ) {
                 case 0:
                     System.out.println("Opção de saida do jogo foi selecionada");
                     nomeDoArquivo = null;
                     break;
                     
                 case 1:
                     System.out.println("Tema selecionado para o jogo é Aviões");
                     nomeDoArquivo = "avioes.csv";
                     jogo.setTema("aviões");
                     break;
                 case 2:
                     System.out.println("Tema selecionado para o jogo é Carros");
                     nomeDoArquivo = "carros.csv";
                     jogo.setTema("carros");
                     break;
                 case 3:
                     System.out.println("Tema selecionado para o jogo é Heróis");
                     nomeDoArquivo = "herois.csv";
                     jogo.setTema("herois");
                     break;
                 case 4:
                     System.out.println("Tema selecionado para o jogo é Dinossauros");
                     nomeDoArquivo = "dinossauros.csv";
                     jogo.setTema("dinossauros");
                     break;
                 default:
                     System.out.println( "Opção inválida" );
             }
         } catch ( IllegalArgumentException iae ) {
             System.out.println( "Erro: " + iae.getMessage( ) );
         }
   
		InputStream fluxo = null;
		InputStreamReader leitorArquivo = null;
		BufferedReader leitorArquivoComBuffer = null;
		
	    try {  
		    fluxo = new FileInputStream(nomeDoArquivo);
	    	leitorArquivo = new InputStreamReader(fluxo);
	    	leitorArquivoComBuffer = new BufferedReader(leitorArquivo);  
	    	
			
	   	 	String linha = "";
	   	 	linha = leitorArquivoComBuffer.readLine();
	   	 	atributos = linha.split(",");
	   	 	linha = leitorArquivoComBuffer.readLine();
	   	 	
			 while ( linha != null ) { 
				 dadosDaCarta = linha.split(",");// lê a primeira linhha com os nomes dos atrtibutos
			
				 dadosDaCartaD = new Double[6]; // vetor dos dados dos atributos
			  
				try {
					for (i=2; i<6; i++)
						dadosDaCartaD[i]= Double.parseDouble(dadosDaCarta[i]);//transforma os dados lidos em double
					   
					
				} catch(NumberFormatException nfe) {
			            System.out.println("NumberFormat Exception: invalid input string");
				}
				
				for (int n=0; n<4; n++) {
					 atributo[n] = new Atributo(atributos[n+2],dadosDaCartaD[n+2]);
					//define cada atributo (os vetores pulam os dois primeiros porque esses são os códigos e o nome)
				}
				
				this.add(new Carta(dadosDaCarta[0], dadosDaCarta[1], atributo[0], atributo[1], atributo[2], atributo[3])); // define cada carta com
				 //o código, nome e 4 atributos
				
				if (dadosDaCarta[6]== "true") {
					boolean supertrunfo = true;
				} else {
					boolean supertrunfo = false;
				}
				linha = leitorArquivoComBuffer.readLine();
		    }  
				
		    
	    } catch (FileNotFoundException fnfe) {  
	    	fnfe.printStackTrace();  
	    } catch (IOException ioe) {  
	    	ioe.printStackTrace();  
	    } finally {
	    	try {
	    		leitorArquivoComBuffer.close();
	    		fluxo.close();
	    	} catch (IOException ioe) {
	    		ioe.printStackTrace();
	    	}
	    }
	}
    
        
    public void listarAtributos() {
   
    	System.out.println("1-" + atributos[2] + "\n"
    						+"2-" + atributos[3] + "\n"
    						+"3-" + atributos[4] + "\n"
    						+"4-" + atributos[5] + "\n");

        int opcao = leitor.nextInt(); // dá a opção do jogador escolher com qual atributo quer jogar
       
    	switch (opcao) {
	    	case 1:
	    		jogo.setAtributo(atributos[2]);
	    	case 2:
	    		jogo.setAtributo(atributos[3]);
	    	
	    	case 3:
	    		jogo.setAtributo(atributos[4]);
	    	case 4:
	    		jogo.setAtributo(atributos[5]);
	    		
    	} // manda o atributo para o objeto Jogo
	    leitor.close();
    }


    public void distribuir(JogadorAbstrato[] jogadores ) {
		int jogador = 0; 
		Iterator<Carta> iterador = this.iterator();
		
		while ( iterador.hasNext() ) {
			
			if (jogadores[jogador].getMonte() == null)
				jogadores[jogador].setMonte( new Baralho (this.tema) );
			
			jogadores[jogador].getMonte().add(iterador.next());
			iterador.remove();
			
			if (jogador == jogadores.length - 1)
				jogador = 0; // Volta pro início, agora que chegou no último
				else
					jogador++;
		}
	}
        
    public void embaralhar( ) {
        Collections.shuffle(this );
    }
    
    
    public void listarCartas( ) {
        System.out.println( this );
    }


    /**
     * @return cartas
     */
    public String toString( ) {
        String cartas = "";
        
        for ( Carta umaCarta: this ) {
            cartas += umaCarta.toString( ) + "\n";
        }
        
        return cartas;
    }
    
    public Carta pegarDoTopo() {
		if( this.peekLast() != null )
			return this.pollLast();
		
		System.out.println("O monte não tem mais cartas!");
		return null;
	}
    

	public File getArquivo() {
		return arquivo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public void setArquivo(File arquivo) {
		this.arquivo = arquivo;
	}

	
} // Fim public class Baralho
