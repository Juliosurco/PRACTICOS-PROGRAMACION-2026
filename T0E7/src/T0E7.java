import java.util.Scanner;
public class T0E7 {
	//PROCESOS
    public static void prom_par_impar(int n) {
        Scanner sc = new Scanner(System.in);
        int sp = 0, cp = 0, si_ = 0, ci = 0, i = 1, num;
        while(i <= n) {
            System.out.print("Ingrese numero: ");
            num = sc.nextInt();
            if(num % 2 == 0) {
                sp = sp + num;
                cp = cp + 1;
            } else {
                si_ = si_ + num;
                ci = ci + 1;
            }
            i = i + 1;
        }
        if(cp > 0) System.out.println("Promedio pares: " + (sp / cp));
        if(ci > 0) System.out.println("Promedio impares: " + (si_ / ci));
    }
  //PROGRAMA PRINCIPAL
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros va a ingresar?: ");
        int n = sc.nextInt();
        prom_par_impar(n);
	}

}
