import java.util.Scanner;
public class T0E3 {
	//PROCESOS
    public static void mayor_menor(int a, int b) {
        if (a > b) {
            System.out.println("Mayor: " + a + " Menor: " + b);
        } else {
            System.out.println("Mayor: " + b + " Menor: " + a);
        }
    }
  //PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite dos numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        mayor_menor(a, b);
	}

}
