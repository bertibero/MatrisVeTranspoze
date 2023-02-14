import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin boyutlarını giriniz! \n Satır Sayısı : ");
        int n = input.nextInt();
        System.out.print("Sütun Sayısı : ");
        int m = input.nextInt();

        int eleman = 0;
        int[][] dizi = new int[n][m];
        int[][] Tdizi = new int[n][m];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i + ". Satır " + j + ". Sutünun elamanını giriniz.");
                eleman = input.nextInt();
                dizi[i - 1][j - 1] = eleman;
                Tdizi[j - 1][i - 1] = eleman;
            }
        }
        System.out.println("Matris : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(dizi[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Transpoze : ");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.print(Tdizi[j][i]+" ");
            }
            System.out.println("");
        }
    }
}