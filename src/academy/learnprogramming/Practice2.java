package academy.learnprogramming;

public class Practice2 {
    // TelTest3.javaをTel3.java内でprivate修飾子をつけて宣言された変数に値を代入するように変更すると
    // コンパイル時にどのようなエラーが表示されるか
    public static void main(String[] args) {
        Tel3 t1, t2;
        t1 = new Tel3("0x-1234-xx1", "田中一郎");
        t2 = new Tel3("0x-3243-xx1", "芹川花子");
        System.out.println(t1.getName() + " " + t1.getTel());
        System.out.println(t2.getName() + " " + t2.getTel());

    }

}
