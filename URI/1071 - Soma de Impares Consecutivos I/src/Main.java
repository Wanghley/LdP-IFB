import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt(),y=in.nextInt(),soma=0;
		if(x<=y) {
			for(int c = x+1;c<y;c++) {
				if(c%2!=0) {
					soma+=c;
				}
			}
		}else {
			for (int i=y+1;i<x;i++) {
				if(i%2!=0) {
					soma+=i;
				}
			}
		}
		System.out.println(soma);

	}

}
