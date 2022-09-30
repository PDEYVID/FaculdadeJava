package tipos_aritmetricos;

public class OperadoresAritmetricos {
	public static void main(String[] args) {
		
		/*
		 * (+) -> soma
		 * (-) -> diminuir
		 * (*) -> multiplicação
		 * (/) -> divisão
		 * */

		System.out.println("Operadore Aritmetricos");
		
		int x = 30;
		int y = 13;
		int i = 20;
		int total = x*y;
		
		System.out.println(x + y + i); // soma
		System.out.println(x - y - i); //diminuir
		System.out.println(x * y * i); // multiplicação
		System.out.println(x / (y + i)); //divisão
		System.out.println(total); // total
		
	}

}
