public class Main {
    public static void main(String[] args) {
        boolean tenki = true;
        if (tenki == true) {
            System.out.println("洗濯しています。");
            System.out.println("散歩に行きます。");
        } else {
            System.out.println("DVDをみます。");
        }

//        boolean doorClose = true;
//        while (doorClose == true) {
//            System.out.println("ノックする。");
//            System.out.println("1分待つ。");
//        }

//        if (str == "夕日"){} : 間違い！！
//        if(str.equals("夕日")){} : 正しい！！

//        if(age >=18 && month = 5){}　なおかつ・・・両方満たされなければ false
//        if(name.equals("斉藤") || name.equals("斉藤")){}　どちらかが・・・満たされれば true

//        例：HPが１００未満、かつPOISONがfalseまたは、HPが１００以上、かつPOISONがtrueの時
//        if((hp < 100 && poison == false) || (hp >= 100 && poison == true)){}

//        否定演算子
//        if(!(age == 10)){}

        System.out.println("あなたの運勢を占います。");
        int fortune = new java.util.Random().nextInt(5) +1;
        switch (fortune){
            case 1:
            case 2:
                System.out.println("いいね！");
                break;
            case 3:
                System.out.println("普通です。");
                break;
            case 4:
            case 5:
                System.out.println("うーん・・・");
                break;
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("現在" + ( i + 1) + "周目→");
        }

//        ループ変数を１からスタートする。
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

//        ループ変数を２ずつ増やす
        for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }

//        ループ変数を１０から１ずつ１まで減らしていく。
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

//        ループ変数を初期化しない
//        for (; i < 10; i++) {
//        }

//        繰返し時の処理を行わない
//        for (int i = 0; i < 1;) {
//            System.out.println(i);
//        }

//        入れ子・ネスト
//        if(height > 170){
//            if(eyesight > 1.0){
//                System.out.println("合格");
//            }
//        }
//        do{
//            if(i % 3 == o ){
//                System.out.println(i);
//            }
//            i ++;
//        }while ( i < 100);

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print(i * j);
                System.out.print(" ");
            }
            System.out.println("");
        }

//        break文
        for (int i = 1; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

            for (int i = 1; i < 10; i++) {
                if (i == 3) {
                continue;
            }
            System.out.println(i);
        }
//            練習問題

//        weght == 60
//        (age1 + age2) * 2 > 60;
//        age % 2 == 1;
//        name.equals("奏");
//
//        cost = 300*1.05; : cost == 300 * 1.05;
//        3 : ?
//        age != 30 : o;
//        true; : ?
//        b + 5 < 20;
//        isNumeric = true; : ?

        int isHungry = 1;
        String food = "ごはん";
        System.out.println("こんにちは！");
        if(isHungry == 0){
            System.out.println("お腹がいっぱいです。");
        }else {
            System.out.println("腹ペコです。。。");
        }
        if (isHungry == 1) {
            System.out.println(food + "をいただきます。");
        }
            System.out.println("ご馳走様でした！");

        boolean tenki1 = false;
        if (tenki1 == true){
            System.out.println("洗濯をします。");
            System.out.println("散歩に行きます。");
        }else {
            System.out.println("DVDをみます。");
            System.out.println("寝ます");
        }

        System.out.print("[メニュー] １：検索　２：登録　３：削除　４：変更");
        int selected = new java.util.Scanner(System.in).nextInt();
//        if (selected == 1){
//            System.out.println("検索します。");
//        }else if (selected ==2){
//            System.out.println("登録します。");
//        }else if (selected == 3){
//            System.out.println("削除します。");
//        }else if (selected == 4){
//            System.out.println("変更します。");
//        }
        switch (selected){
            case 1:
                System.out.println("検索します");
                break;
            case 2:
                System.out.println("登録します");
                break;
            case 3:
                System.out.println("削除します");
                break;
            case 4:
                System.out.println("変更します");
                break;
        }

        System.out.println("数当てゲーム！");
        int ans = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0~9の数字を入力してください。");
            int num = new java.util.Scanner(System.in).nextInt();
            if (ans == num){
                System.out.println("アタリ！");
                break;
            }else {
                System.out.println("違います。");
            }
        }
        System.out.println("ゲームを終了します。");
    }
}
