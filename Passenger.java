/*
D391:バスの乗車人数
03分43秒経過
6時間経過で時間切れ
あなたはバスを運行しています。

乗客数 0 人の状態から 1 つ目のバス停で x 人の乗客が乗ってきました。
2 つ目のバス停では y 人の乗客が降りて、 z 人の乗客が乗ってきました。
x, y, z が改行区切りで与えられるので現在の乗客数を出力してください。
*/
import java.util.*;
public class Passenger {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int stop1 = sc.nextInt();
        int stop2 = sc.nextInt();
        int stop3 = sc.nextInt();
        System.out.println(stop1-stop2+stop3);
    }
}