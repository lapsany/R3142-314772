public class Build extends Place {

    public Build(String name, int age, Level level) {
        super (name, age, level);
        System.out.print(name);
    }

    @Override
    public void Adj() { System.out.print("каменные "); }

    @Override
    public void Cond() { System.out.print(".\nВместо "); }

    @Override
    public void Verb() { System.out.print(" были самых разнообразных размеров и форм -"); }

    public String destroyed() {String txt; return txt = ",\nразрушались ";}

    public String find(){String txt;return txt = ", находившиеся под самой "; }

    public String use() {String txt; return txt = " тут применялись ";}

    public String lie() {String txt; return txt = ", лежащие под углом. ";}

    public String every() {String txt; return txt = ".\nКаждый новый ";}

    public String better() {String txt; return txt = " превосходил предыдущий размерами, в ";}

    public String empty() {String txt; return txt = " были пустые";}

    public String decoration() {String txt; return txt = ", единственным украшением являлась настенная ";}

    public String equals() {String txt; return txt = " каждого равнялась 30 x 30 " + Size.Measure.FOOT.getMer() + ". ";};

    public String oneUp(String word){
        if(word == null || word.isEmpty()) return word;
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }




}


