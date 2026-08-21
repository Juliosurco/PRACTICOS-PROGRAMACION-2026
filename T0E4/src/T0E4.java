import java.util.Scanner;
public class T0E4 {
	//PROCESOS
    public static void impares(int n) {
        Scanner sc = new Scanner(System.in);
        int c = 0;
        int i = 1;
        while(i <= n) {
            System.out.print("Digite numero: ");
            int num = sc.nextInt();
            if(num % 2 != 0) {
                System.out.println(num + " es impar");
                c = c + 1;
            }
            i = i + 1;
        }
        System.out.println("Total impares: " + c);
    }
  //PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros va a introducir?: ");
        int n = sc.nextInt();
        impares(n);
	}

}
