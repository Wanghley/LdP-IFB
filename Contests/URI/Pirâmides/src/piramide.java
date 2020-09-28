import java.util.Scanner;
public class piramide {

	/**
	 * A ideia desta função é receber um vetor V e
	 * somar os N próximos elementos a partir da
	 * posição INDEX.
	 * @param v -> vetor que será usado
	 * @param index -> índice para começar a soma
	 * @param n -> número de elementos somados
	 * @return soma dos elementos
	 */
	static int somaNFrente(int[] v, int index, int n) {
		int soma = 0;
		for (int i = index; i < v.length; i++) {
			System.out.println("somando "+ v[i]);
			soma += v[i];
			// Se o N zerar, já somou todo mundo
			if (--n==0) {
				return soma;
			}
		}
		//Se o vetor acabou e o N não zerou, 
		//temos que voltar para somar
		//os números atrás da posição INDEX.
		return soma + somaNTras(v, index-1, n);
	}
	
	/**
	 * Semelhante a função anterior, só que ao invés
	 * de somar os N próximos elementos a partir do
	 * INDEX, ela soma os N elementos anteriores.
	 * @param v -> vetor que será usado
	 * @param index -> índice para começar a soma
	 * @param n -> número de elementos somados
	 * @return soma dos elementos
	 */
	static int somaNTras(int[] v, int index, int n) {
		int soma = 0;
		for (int i = index; i >= 0; i--) {
			System.out.println("somando "+ v[i]);
			soma += v[i];
			n--;
			//Se o N zerar, já somou todo mundo
			if (n==0) {
				return soma;
			}
		}
		//Se o vetor acabou e o N não zerou, 
		//temos que voltar para somar
		//os números depois da posição INDEX.
		return soma + somaNFrente(v, index+1, n); 
		
	}
	
	/**
	 * Recebe a Matriz V e um índice INDEX, para cada
	 * linha I da Matriz, são somados I números a 
	 * partir do índice INDEX. A posição INDEX vira o 
	 * eixo da pirâmide que está presente em todas as
	 * linhas. Usa a função SOMANFRENTE para somar
	 * o valor das linhas. No final retorna
	 * o valor da soma de todas as linhas
	 * @param v Matriz
	 * @param index -> índice base para a soma
	 * @return soma de todas as linhas
	 */
	static int somaFrente(int[][] v, int index) {
		int soma = 0;
		
		for (int i = 0; i < v.length; i++) {
			soma += somaNFrente(v[i], index, i+1);
		}		
		return soma;
	}
	
	/**
	 * Similar a função SOMAFRENTE. A única diferença
	 * é que usa a função SOMANTRAS para somar os 
	 * valores em cada linha.
	 * @param v
	 * @param index
	 * @return soma das linhas
	 */
	static int somaTras(int[][] v, int index) {
		int soma = 0;
		
		for (int i = 0; i < v.length; i++) {
			soma += somaNTras(v[i], index, i+1);
		}		
		return soma;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Inicializo a variável MENORSOMA com o maior
		//valor dos números inteiros do java.
		int MENORSOMA = Integer.MAX_VALUE;
		int n = teclado.nextInt();
		//criando matriz
		int v[][] = new int[n][n];
		
		//lendo os valores
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				v[i][j] = teclado.nextInt();
			}
		}
		//Testando todas as combinações de somas
		//o valor de I vai ser o eixo da pirâmide
		//A gente vai tentando
		for (int i = 0; i < v.length; i++) {
			//primeiro tenta somando pra frente
			int umaSoma = somaFrente(v, i);
			// Se a soma encontrada foi menor que a menor soma
			//anterior, então ela é a nova menor soma
			if (umaSoma < MENORSOMA) {
				MENORSOMA = umaSoma;
			}
			System.out.println("deu "+umaSoma);
			
			//agora tenta somando para trás
			umaSoma = somaTras(v, i);
			if (umaSoma < MENORSOMA) {
				MENORSOMA = umaSoma;
			}			
			System.out.println("deu "+umaSoma);
		}
		//Imprime a menor soma encontrada.
		System.out.println(MENORSOMA);
		
	}

}