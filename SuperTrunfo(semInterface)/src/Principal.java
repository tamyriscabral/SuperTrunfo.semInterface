import java.util.Scanner;

public class Principal {

    public static void main( String[] args ) {
    	JogadorRandômico maquina = new JogadorRandômico("any");
    
    	Scanner leitor = new Scanner(System.in);
    	
    	System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        Jogo jogo = new Jogo ();
        Baralho baralho = new Baralho("tema");
    	baralho.carregar();
    	JogadorReal jogador = new JogadorReal(nome);

    	baralho.embaralhar();
    	
    	baralho.distribuir(new JogadorAbstrato[]{jogador, maquina});
    	while (jogador.getMonte()!= null || maquina.getMonte()!= null) {
        System.out.println("Este é o seu monte:" );
    	jogador.getMonte().listarCartas();
    	
    	System.out.println("Escolha um atributo: " );
    	baralho.listarAtributos();
    	
    	Carta carta1 = jogador.getMonte().pegarDoTopo();
    	Carta carta2 = maquina.getMonte().pegarDoTopo();
 
    	jogo.jogarRodada(baralho, carta1, carta2, jogador, maquina);
    	System.out.println("Dados da sua carta: " + carta1 + "vs Dados da carta do seu adversário: " + carta2);
    	
    	jogo.ranking(jogador, maquina);
    }
    	

    	
       
    leitor.close();
    
    } // Fim public static void main( String[] args )
} // Fim public class Principal

