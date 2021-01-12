public class Human {
    private int age;
    private String name;
    private Male male;

    public Human(String name, int age, Male male) {
        this.name = name;
        this.male = male;
        this.age = age;
        System.out.print(name);
    }

    public enum Male {
        MALE,
        FEMALE,
        SOME
    }

    public String getName() { return name;}
    public String lost() {String txt; return txt = "чуть не заблудились";}
    public String go() {String txt; return txt = "  проникли в ";}
    public String research() {String txt; return txt = " и решили обследовать ветхие ";}
    public String climb() {String txt; return txt = "Облазив весь ";}
    public String saw() {String txt; return txt = " и осмотрев ";}
    public String rise() {String txt; return txt = ". \nВзобрались на сто ";}
    public String goDawn() {String txt; return txt = " спустились в нижние ";}

}
