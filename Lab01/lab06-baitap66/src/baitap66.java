import java.util.Scanner;
public class baitap66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("so hang: ");
        int hang = sc.nextInt();
        System.out.print("so cot: ");
        int cot = sc.nextInt();
        int[][] matran1 = new int[hang][cot];
        int[][] kq = new int[hang][cot];
        System.out.println("matran 1:");
        for (int i = 0; i < hang; i++) {
        	System.out.print("nhap so cua hang " + (i+1) + ": ");
            for (int j = 0; j < cot; j++) {
                matran1[i][j] = sc.nextInt();
            }
        }
        System.out.println("matran 2:");
        for (int i = 0; i < hang; i++) {
            System.out.print("nhap so cua hang " + (i+1) + ": ");
            for (int j = 0; j < cot; j++) {
                kq[i][j] = sc.nextInt() + matran1[i][j];
            }
        }
        System.out.println("kq la:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print(kq[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
