package academy.learnprogramming;

public class Tel3 {
    // fieldをprivateにしてカプセル化
    private String tel, name;
    Tel3(String tel, String name) {
        this.tel = tel;
        this.name = name;
    }

    String getName() {
        return name;
    }

    String getTel() {
        return tel;
    }

}
