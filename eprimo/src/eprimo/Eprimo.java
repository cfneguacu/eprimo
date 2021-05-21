package eprimo;

public class Eprimo {

	public static void main(String[] args) {
		
		int num = 181;
		int i = 1;
		int primo = 0;
		while(i<=num) {
			if(num%i==0) {
				primo+=1;
			}
			i++;
		}
		
		if(primo==2){
			System.out.print("Primo");
		}else {
			System.out.print("Não Primo");
		}
		
		
	}
}
