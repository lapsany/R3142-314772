public abstract class Place implements Tools, Condition{
    private String name;
    private int age;
    private Build.Level level;

    public Place (String name, int age, Level level) {
        this.name = name;
        this.age = age;
        this.level = level;
    }

    public String getPlace() {return name;}

    @Override
    public String toString() {
        return "Place{"
                + "name='" + name + '\''
                + ", age=" + age
                + ", level=" + level
                + '}';
    }

    public enum Level {
        HIGH("вверх"),
        LOW("Нижние"),
        UNKNOWN("Неизвестно"),
        OVERALL(". Оно было огромное и величественное."),
        INWALL(" отлично сохранились."),
        OUTWALL("");

        private String place;
        Level(String place) { this.place = place;}
        public String getLevel() {
            return place;
        }
    }

    public void Adj(String name) {System.out.println("Прилагательное"); }

    public void Cond(String name) {System.out.println("Состояние, вводное слово"); }

    public void Verb(String name) {System.out.println("Глагол"); }

}
