package academy.learnprogramming;

public class Practice3 {
    // Tel4.javaを変更し、名前を変更するsetName()メソッド、電話番号を変更するsetTel()メソッドを追加せよ
    private String tel, name;

    public Practice3(String tel, String name) {
        this.tel = tel;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public static void main(String[] args) {
        Practice3 t1;
        t1 = new Practice3("0x-1234-xx1", "田中一郎");
        System.out.println(t1.getName() + " " + t1.getTel());

        t1.setName("中村義雄");
        t1.setTel("0x-4444-xx3");

        System.out.println(t1.getName() + " " + t1.getTel());

    }

}
