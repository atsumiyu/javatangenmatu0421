package JavaTangenKadai0421;
import java.util.Scanner;
public class StoneGame {
    public static void main(String[] args) {

        int allNum = 25;
        int num = 3;
        var player = "A";

        var sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("石取りゲームを開始します");
        System.out.println("1度に取れる石の数：" + num + "個");
        System.out.println("----------------------------");

        while (allNum > 0) {

            System.out.println("残り：" + allNum + "個");

            for (int i = 0; i < allNum; i++) {
                System.out.print("●" + " ");
            }

            System.out.println();
            System.out.println("----------------------------");

            System.out.println("プレイヤー" + player + "の番");

            System.out.println("石の数を入力してください（1～3まで入力可能です。）");
            var s1 = sc.nextLine();
            var num1 = Integer.parseInt(s1);

            if(num1 == 1) {
                allNum = allNum - 1;
                switch (player) {
                    case "A" -> player = "B";
                    case "B" -> player = "A";
                }
            } else if(num1 == 2) {
                allNum = allNum - 2;
                switch (player) {
                    case "A" -> player = "B";
                    case "B" -> player = "A";
                }
            } else if(num1 == 3) {
                allNum = allNum - 3;
                switch (player) {
                    case "A" -> player = "B";
                    case "B" -> player = "A";
                }
            } else {
                System.out.println("1~3の間で入力してください");
            }

            if(allNum <= 0){
                System.out.println("勝者：プレイヤー" + player);
            }

        }
        sc.close();

    }
}
