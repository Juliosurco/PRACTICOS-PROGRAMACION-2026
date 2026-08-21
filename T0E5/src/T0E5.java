import java.util.Scanner;
public class T0E5 {
	//PROCESOS
    public static void rango_40_80(int n) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i <= n) {
            System.out.print("Digite numero: ");
            int num = sc.nextInt();
            if(num >= 40 && num <= 80) {
                System.out.println(num + " esta en el rango");
            }
            i = i + 1;
        }
    }
  //PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de numeros a leer?: ");
        int n = sc.nextInt();
        rango_40_80(n);
	}

}
