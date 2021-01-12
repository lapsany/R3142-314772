public class Way extends Place{
    private Act act;
    public Way(String name, int age, Level level, Act act) {
        super (name, age, level);
        this.act = act;
        System.out.print("Тут есть " + name);
    }

    public String start() {String txt; return txt = "где начинался настоящий ";}
    public String inf_move() {String txt; return txt = " тянулись бесконечно далеко, выходя за пределы ";}

    @Override
    public void Adj() {
        System.out.print("верхний");
    }

    @Override
    public void Cond() {
        System.out.print(", он запутанный.");
    }

    @Override
    public void Verb() { System.out.println(""); }

    public enum Act {
        LAB("усложняют лабиринт."),
        CROSS("Переходы"),
        LVL("уровни"),
        WAY("Путь"),
        MOVES("Ходы"),
        FLOOR("этаж");

        private String actions;
        Act(String actions) {this.actions = actions;}

        public String getAct() {return actions;}

    }

}
