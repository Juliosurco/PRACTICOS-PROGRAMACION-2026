import java.util.Scanner;
public class T0E8 {
	//PROCESOS
    public static void contar_multiplos(int n) {
        Scanner sc = new Scanner(System.in);
        int c4 = 0, c7 = 0, c15 = 0, i = 1, num;
        while(i <= n) {
            System.out.print("Ingrese numero: ");
            num = sc.nextInt();
            if(num % 4 == 0) c4++;
            if(num % 7 == 0) c7++;
            if(num % 3 == 0 && num % 5 == 0) c15++;
            i++;
        }
        System.out.println("Multiplos de 4: " + c4);
        System.out.println("Multiplos de 7: " + c7);
        System.out.println("Multiplos de 3 y 5: " + c15);
    }
  //PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de numeros a evaluar?: ");
        int n = sc.nextInt();
        contar_multiplos(n);
	}

}
