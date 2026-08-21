import java.util.Scanner;
public class T0E9 {
	//PROCESOS
    public static void mostrar_desc(int n) {
        Scanner sc = new Scanner(System.in);
        if (n > 0) {
            System.out.print("Ingrese numero: ");
            int ant = sc.nextInt();
            int i = 2;
            while(i <= n) {
                System.out.print("Ingrese numero: ");
                int num = sc.nextInt();
                if(num < ant) {
                    System.out.println(num + " llego en forma descendente");
                }
                ant = num;
                i++;
            }
        }
    }

    //PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros ingresara?: ");
        int n = sc.nextInt();
        mostrar_desc(n);
	}

}
