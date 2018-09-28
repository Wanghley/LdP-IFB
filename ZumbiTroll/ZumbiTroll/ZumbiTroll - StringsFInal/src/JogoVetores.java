import java.util.Scanner;

public class JogoVetores {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String[] vetor = new String[100];// Se tiver mais que 100, aumenta esse numero
		vetor[0] = "Seja bem-vindo ao jogo que as suas decisões podem matar ou salvar alguém...\n"
				+ "Só depende de você! Boa sorte! Você está pronto? ### 1 ### SIM ### 2 ### NÃO.";
		
		vetor[1]="Você tomou essa decisão... A partir de agora tudo está por sua\n"  
				+"conta em risco...\nSalve-se... A aventura começa agora...\n\n"  
				+".............................................................................\n"  
				+"................................................................\n"
				+ "\n2025, nos Estados Unidos, Texas...\n\n"  
				+ "Ocorreu um acidente químico, no qual as pessoas\n\n" 
				+ "começam a ficar inconscientes e com fome de carne humana.\n\n" 
	            + "Você está no seu apartamento e precisa sobreviver a esse apocalipse...\n\n" 
	            + "Primeiramente você olha a foto de sua amada esposa, Mary.\nSempre quando você ver a foto dela,\n" 
	            + " você se inspira, a esperança volta em você...\n\n"
	            + "\nVocê escuta explosões... "
				+ "O que você faz: ### 3 ### Ir ao terraço verificar o que está acontecendo. ### 4 ### Ficar no apartamento e esperar.###";
		
		vetor[2]="PERDEU-Muito bem, você é fraco, esse jogo não foi feito para você.\n" + 
				"Volte quando estiver preparado para encarar o mundo real.\n";
		vetor[3]="PERDEU-Você morre, com estilhaços de vidro derivados da explosão,\n"
		+ "e você vê, na sua mente, sua esposa decepcionada";
		vetor[4]="\nVocê fica no seu apartamento no 14° andar (último andar),\n "
             + "mas escuta barulhos no 7° andar e vai verificar...\n"
             + "Você desce até a metade do prédio, no caminho você "
             + "encontra uma arma(sem balas)\ne uma faca. Qual você leva? ### 5 ### Arma ### 6 ### Faca ### 7 ### As duas";
		vetor[5]="PERDEU-Você não tem capacidade de sobreviver aqui nesse mundo...";
		vetor[6]="PERDEU-Você não sabe o que fazer... Não está preparado(a) para o mundo real..."
		+ "Cresça e quando estiver preparado(a) volte a jogar. ";
		vetor[7]="Você não é burro nem nada...\nVocê é muito esperto e optou por levar a arma e a faca juntas..."
            	 + "Você encontra zumbis à sua frente...O que você faz? ### 8 ### Atirar ### 9 ### Esfaqueiar ### 10 ### Sair";
		vetor[8]="PERDEU-Você encontra vários zumbis e não sabe usar sua arma...";
		vetor[9]="PERDEU-Você encontra vários zumbis e não consegue matar tantos andarilhos"
		+ " com uma única faca...";
		vetor[10]="Os zumbis estranhamente não percebem a sua presença e você consegue"
		+ " fugir...No fim do corredor há um telefone . Sua decisão é:"
             	+ "### 11 ### Você liga para o exército."
		+ "### 12 ### Você desce no térreo e tenta sobreviver por si só.";
		vetor[12]="PERDEU-Você encontra vários zumbis mas não possui habilidades para dar conta de "
		+ "uma horda inteira desses vermes rastejantes...\n";
		vetor[11]="............................................................................."
             	+ "................................................................\n"
             	+"\nAgora você deve sobreviver até a chegada do resgate. \n"
             	+ "No caminho da volta você encontra um garoto sendo atacado por zumbis.\nO que você faz:"
             	+ " ### 13 ### Salva ele. ### 14 ### Continua sem ele.";
		vetor[13]= "PERDEU-Você consegue deter esses andarilhos e salva o garoto...\n"
            	 + "O garoto pede para que ele te acompanhar até a chegada do resgate"
           	 + " e você aceita,\n sem pensar duas vezes, pois tens um fraco por crianças...\nMary amava crianças......\n"
            	 + "Porém, tempos depois ele começa a se transformar e você não percebe...\n"
		 + "ELE TE MORDE E VOCÊ TAMBÉM É INFECTADO!\nVocê não é bom o suficiente para esse jogo!\n";
		vetor[14]="Você fica com pena do garoto, mas a sua vida é mais importante nos dias de hoje...\n"
             	+ "Você continua vivo por enquanto...\n Você decide ir ao terraço...\n"
             	+ "Chegando lá você espera muito até um ponto em que você fica com fome.\nO que fazer:"
             	+ " ### 15 ###Você vai atrás de comida ### 16 ### Você espera por mais um tempo o resgate";
		vetor[15]="Você vai até o andar de baixo procurar comida.\n"
             	+ " Você vai entrando de porta em porta até que você acha uma casa com ingredientes\n"
             	+ " suficientes para fazer uma boa refeição. E esses ingredientes são:\n"
             	+ "    -Macarrão espaguete, arroz, feijão, carne, molho branco, ovo, sal;\n"
             	+ "Dessas podem se fazer: arroz e feijão com carne, macarrão com ovo mexido\n"
             	+ "e macarrão à molho branco.\n"
             	+ "Qual delas você escolhe?\n"
             	+ "(lembrando que você tem que ser rápido então escolha uma que seja fácil e rápida):"
             	+ "### 17 ### Arroz e feijão com carne ### 19 ### Macarrão com ovo mexido ### 18 ### Macarrão à molho branco";
		vetor[16]="PERDEU-Você encontra comida, todavia não percebe os andarilhos se aproximarem-se de você.\n"
		+"VOCÊ NÃO ESTÁ PRONTO PARA ESSE JOGO, EVOLUA E VOLTE NOVAMENTE... BOA SORTE GAFANHOTO.";
		vetor[17]="PERDEU-Você espera muito para terminar a refeição. O resgate aparece e eles vão sem você.\n";
		vetor[18]="PERDEU-Essa é a única que você não sabe fazer, mas sabe que é possível.\n";
		vetor[19]="............................................................................."
            	 + "................................................................\n"
             	+"Uma boa escolha. Você faz rapidamente e se satisfaz. \n"
		+ "Você começa a escutar barulhos... Você percebe que é o resgate, um helicóptero.\n"
             	+ "Eles jogam uma escada de corda.\n"
             	+ "Você começa a subir a escada, a foto da sua esposa ameaça a cair então você deve escolher:"
             	+ "### 20 ### Pegar a foto. ### 21 ### Coninuar e deixar a foto cair.\n";
		vetor[20]="PERDEU-Você perde o equilíbrio e cai da escada e não adianta nada ter a foto.\n";
		vetor[21]=".............................................................................................................................................\n"
             	+"Você continua subindo mais rápido e para sua sorte você lembra que tinha\n uma cópia da foto em sua carteira...\n"
             	+ "Ao olhar para o alto observa que os tripulantes do helicóptero\n começaram a devorar um ao outro e você resolve:\n"
             	+ "### 22 ### Continuar subindo e tomar o controle. ### 23 ### Descer a escada muito rápido.\n";
		vetor[22]="PERDEU-Você é mordido por um dos tripulantes ao apoiar a mão no assoalho do helicóptero!\n";
		vetor[23]="..........................................................................."
             	+ ".................................................................."
            	+"\nVocê consegue escapar dessa vez...\n"
             	+ "Está começando à anoitecer e você precisa arrumar um lugar seguro para dormir.\n"
             	+ "O que você faz:"
             	+ "### 24 ### Voltar para o apartamento em que você estava. ### 25 ### Procurar com cautela outro apartamento "
		+ "### 26 ###Ficar no terraço, pois é o lugar mais seguro.\n";
		vetor[24]="PERDEU-Você até que conseguiu dormir, mas por você já ter estado lá os zumbis gravaram seu cheiro e te cercaram.\n";
		vetor[25]="PERDEU-Por incrível que pareça só existia um lugar seguro...\n e era o que você estava.\n";
		vetor[26]="..........................................................................."
             	+ "..................................................................\n"
             	+"Parabéns! Você achou o lugar perfeito, por ser um lugar aberto você sempre vai precisar ter\n"
             	+ " cuidado a noite ficando sempre alerta...\n"
             	+ "A qualquer hora pode aparecer um zumbi para lhe saborear...\n"
             	+ "Novamente você precisa pedir reforços...\nO que fazer:\n"
             	+ "### 27 ### Tentar sobreviver o máximo que puder até o seu fim. "
		+"### 28 ### Voltar para a metade do prédio para usar o telefone de emergência.";
		vetor[27]="PERDEU-Você não aguenta por muito tempo, com isso você falhou e esse não era o seu objetivo.\n";
		vetor[28]="..........................................................................."
             	+ "..................................................................\n"
             	+"\nVocê continua no seu trajeto. Boa sorte.\n"
             	+ "Descendo as escadas você percebe que tem um monte de zumbis,\ne só falta um andar\n"
             	+ " até você chegar no telefone. O que fazer:"
             	+ "### 29 ### Jogar algum objeto para chamar atenção deles. "
		+"### 30 ###Jogar algum objeto com o seu cheiro na direção oposta a sua.\n";
		vetor[29]="PERDEU-Você não especificou o lugar em que você iria jogar\n"
		+ " e acabou chamando a atenção deles para você.\n";
		vetor[30]="..........................................................................."
             	+ "..................................................................\n"
             	+"\nVocê consegue o que quer...\n\n\n"
             	+ "Espera!!!\nUm zumbi te seguiu, o que você vai fazer: "
             	+ "###  31 ### Emboscar e matar ele. ### 32 ### Descer mais andares para tentar despistar eles.";
		vetor[31]=".............................................................................................................................................\n"
             	+"Você conseguiu matar ele com uma faca. Mas você não pode perder tempo.\n"
     		+ "Você liga para o reforço, e novamente precisa voltar para o terraço. O que fazer:\n"
             	+ "### 33 ### Voltar pelas escadas. ### 34 ### Arrumar outro jeito de retornar porque você quer se aventurar.\n";
		vetor[32]="PERDEU-Não adiantou fazer isso só tinha mais zumbis à sua espera nos andares inferiores.";
		vetor[33]="PERDEU-Você encontra os zumbis de novo, mas dessa vez eles te notaram.\n";
		vetor[34]=".............................................................................................................................................\n" 
             	+"Você volta pelo elevador, não era uma boa opção mas para a sua\n"
             	+ " sorte não tinha nada lá e você conseguiu chegar no terraço são e salvo....\n"
             	+ "Após chegar ao terraço há mais zumbis lá, cerca de 3 zumbis. O que fazer?\n"
             	+ "### 35 ### Enfrentar os zumbis. ### 36 ### Ficar na espreita.";
		vetor[35]=".............................................................................................................................................\n"
             	+"Os zumbis estavam muito sem membros e você consegue mata-los com facilidade\n"
             	+ "Você tem que esperar o resgate.\n"
             	+ "Enquanto você espera aparece uma pessoa gritando por ajuda...\n"
             	+ "Você vai até ela e tenta acalma-la. É uma mulher, e ela esta\n"
             	+ "morrendo de fome, você explica tudo pra ela. Então vocês vão atrás de comida\n"
             	+ "vocês avistam um grupo de zumbi ao redor de comida. O que fazer?\n"
             	+ "### 38 ### Matar os zumbis. ### 36 ### Esperar o resgate.";
		vetor[36]="PERDEU-Um zumbi aparece atrás de você e te mata.\n";
		vetor[38]=".............................................................................................................................................\n" 
             	+"Vocês vão até os zumbis e mata-os.\n"
             	+ "Vocês comem o lanche...\n Você percebe que a moça está com o braço mordido.\n"
             	+ "O que fazer?\n"
             	+ "### 39 ### Matá-la. ### 40 ### Arrancar o braço.";
		vetor[39]="PERDEU-Você está perdendo sua humanidade...\n"
             	+ " Na hora de matá-la você fica muito nervoso e não tem muita coragem\n"
		+ "e quando você consegue coragem ela já se transformou e te mata.\n";
		vetor[40]=".............................................................................................................................................\n"
             	+"Você consegue arrancar o braço dela mas começa a sangrar muito,\n"
             	+ "então você cobre o ferimento.\n"
             	+ "Você começa a escutar um barulho de helicóptero.\n"
             	+ "É O RESGATE!!!\n"
             	+ " Vocês vão correndo atrás da escada do resgate\n"
             	+ "você tem que ajuda-la. O que fazer? "
             	+ "### 41 ### Você sobe primeiro e ajuda ela a subir "
             	+ "### 42 ### Deixar ela subir primeiro e a ajuda a subir. ### 43 ### Você a carrega no colo.";
		vetor[41]="PERDEU-Como diabos você vai ajudar ela assim???\n"
		+ "Você tenta ajudar, mas perde o equilíbrio e os dois caem.";
		vetor[42]="PERDEU-Assim não né!! Acredito que seja mais seu desejo em vê-la subir...\n"
		+ "Ela perde o equilíbrio e cai em cima de você..\n Os dois morrem...\n";
		vetor[43]=".............................................................................................................................................\n"
             	+"Você tem forca suficiente para carrega-la.\n"
             	+ "Chegando ao helicóptero, a moça está passando mal. O que fazer?\n"
             	+ "### 44 ### Dar a ela misericórdia(mercy).### 45 ### Dar a ela um remédio que estava em sua mochila.";
		vetor[44]="PERDEU-Os tripulantes acham que você é louco e te jogam do helicóptero.\n";
		vetor[45]=".............................................................................................................................................\n" 
             	+"Era somente uma dor de cabeça por causa da altura...\n\n"
             	+"Vocês estão indo em direção ao acampamento militar...\n"
             	+ "Mas algo estranho acontece...\n\n [Tripulante]: S.O.S. Controle... S.O.S.\n\n"
		+".............................................................................................................................................\n"
		+"Digite ### 46 ### para continuar....\n";
		vetor[46]="VENCEU-Você conseguiu sobreviver à primeira parte do jogo épico ZumbiTroll...\n\n\n"
             	+ "Muito bem!\n"
             	+ " Você parece estar preparado para sobreviver por conta própria\n"
             	+ " nesse mundo pós apocalíptico... Você nos surpreendeu...\n"
             	+ "Pensamos que nunca chegaria aqui! Se você chegou aqui na 1ª tentativa,\n"
		+ "nossos parabéns e esperamos que esteja preparado para nosso novo mundo....\n"
		+ ".....................................................................................................................................\n"
             	+ "Criado por:\n"
             	+ "         Wanghley Soares Martins (https://www.linkedin.com/in/wanghley)\n"
             	+ "         Joel Crescêncio\n"
             	+ "         Felipe Toledo Neves\n"
             	+ "\n"
             	+ "Programação e design: Wanghley S. Martins\n"
             	+ "Revisão ortográfica: Joel Crescêncio e Felipe Toledo\n"
             	+ "História por: Felipe Toledo e Joel Crescêcio\n"
             	+ "Jogo disponível em: https://github.com/Wanghley/LdP-IFB/tree/master/ZumbiTroll\n"
		+ ".......................................................................................................................................\n";
		int tentativas, tt;
		boolean naoacertou = true;

		System.out.println("Digite a quantidade de tentativas:");
		tentativas = teclado.nextInt();
		tt = tentativas;
		System.out.flush();
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nBem-vindo ao nosso jogo!");

		do{
			System.out.println("\n###################################\nNúmero de tentativas: "+tentativas+"\n###################################");
			int posicao = 0;
			boolean continua = true;
			
			do {
				
				String completa = vetor[posicao];
				if(completa.startsWith("PERDEU")) {
					System.out.println(completa.substring(7));
					System.out.println("---------------------------------------\n----          Você PERDEU!         ----\n---------------------------------------");
					continua = false;
				}else if(completa.startsWith("VENCEU")) {
					System.out.println(completa.substring(6));
					System.out.println("---------------------------------------\n----          Você GANHOU!         ----\n---------------------------------------");
					continua = false;
					naoacertou = false;
				}else {
					String[] tokens = completa.split("###");
					int opcoes[] = new int[(tokens.length/2) + 1];
					int n = 1;
					String historia = tokens[0];
					System.out.println(historia);
					System.out.println("Escolha uma opção:");
					for (int i = 1; i < tokens.length; i=i+2) {
						String p = tokens[i];
						String opt = tokens[i+1];
						System.out.println(n+ " - "+ opt);
						opcoes[n] = Integer.parseInt(p.trim());
						n++;					
					}
					int escolha = teclado.nextInt();
					if(escolha>0 && escolha < opcoes.length) {
						posicao = opcoes[escolha];
					}else {
						System.out.println("\n\n --> Você escolheu uma opção errada...\n\n");
					}
					

				}
			}while(continua);
			tentativas--;
		}while(naoacertou && tentativas > 0);
		if(naoacertou) {
			System.out.println("Suas tentativas acabaram!");
			System.out.println("###################################\nVocê perdeu!\n###################################");
		}else {
			System.out.println("###################################\n\nVocê ganhou em "+ (tt - tentativas)+" tentativas! Parabéns!\n\n###################################");

		}
		//teclado.nextInt();
		teclado.close();

	}

}
