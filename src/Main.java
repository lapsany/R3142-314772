import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Human we = new Human("Мы", 0000, Human.Male.SOME);
        System.out.print(we.go());
        Build build = new Build("здание", 1000, Build.Level.OVERALL);
        System.out.println(Build.Level.OVERALL.getLevel());
        Build wall_in = new Build("Внутренние стены", 1000, Build.Level.INWALL);
        System.out.println(Build.Level.INWALL.getLevel());
        Way way = new Way("лабиринт", 1000, Place.Level.UNKNOWN, Way.Act.LAB);
        way.Cond();
        System.out.println(" " + Way.Act.CROSS.getAct() + " и " + Way.Act.LVL.getAct() + " " + Way.Act.LAB.getAct());
        System.out.print(we.getName() + " " + we.lost());
        System.out.print(we.research());
        Build premises = new Build("помещения", 1000, Build.Level.HIGH);
        System.out.print(we.rise());
        Nature sky = new Nature("небом");
        Nature snow = new Nature("снегу");
        Nature wind = new Nature("ветру");
        System.out.print(Size.Measure.FOOT.getMer() + " " + Build.Level.HIGH.getLevel() + sky.where() + sky.getEnv());
        System.out.print(sky.open() + snow.getEnv() + " и " + wind.getEnv());
        System.out.print(build.destroyed());
        Build rooms = new Build("комнаты", 1000, Build.Level.HIGH);
        System.out.print(build.find());
        Build roof = new Build("крышей", 1000, Build.Level.HIGH);
        build.Cond();
        Build stairs = new Build("лестниц", 1000, Build.Level.UNKNOWN);
        System.out.print(build.use());
        build.Adj();
        Build slabs = new Build("плиты", 1000, Build.Level.UNKNOWN);
        System.out.println(build.lie());
        System.out.print(premises.oneUp(premises.getPlace()));
        build.Verb();
        Form star = new Form("звездчатых");
        Form triangle = new Form("треугольных");
        Form square = new Form("квадратных");
        System.out.print(star.like() + star.getEnv() + " до " + triangle.getEnv() +
                         " и " + square.getEnv() + square.instr());
        Build area = new Build("Площадь", 1000, Build.Level.OVERALL);
        System.out.println(build.equals());
        Size size_promises = new Size(30,20,30);
        System.out.print("\n" + we.climb());
        way.Adj();
        Nature ice = new Nature("ледяной покров");
        System.out.println(" " + Way.Act.FLOOR.getAct() + we.saw() + ice.getEnv() + ", " +
                          we.getName().toLowerCase(Locale.ROOT) + we.goDawn() + premises.getPlace() + ",");
        System.out.print(way.start() + way.getPlace() + ". " + Way.Act.MOVES.getAct() + way.inf_move());
        Build home = new Build("дома", 1000, Build.Level.OVERALL);
        System.out.print(build.every());
        Build hall = new Build("зал", 1000, Build.Level.UNKNOWN);
        Furniture outlines = new Furniture("очертаниях");
        Furniture trim = new Furniture("убранстве");
        Furniture placing = new Furniture("кладки");
        System.out.print(hall.better() + outlines.getEnv() + ", " + trim.getEnv() +trim.elusive() +
                         placing.getEnv() + trim.alien());
        Human people = new Human("человеку", 0000, Human.Male.SOME);
        System.out.print(".\n" + rooms.oneUp(rooms.getPlace()) + rooms.empty());
        Furniture furniture = new Furniture("Мебель");
        System.out.print(build.decoration());
        Furniture sculpture = new Furniture("скульптура");
        System.out.println(sculpture.getEnv() + sculpture.stone());
    }
}

//Здание, куда мы проникли, было огромным и величественным -- внушительный образец архитектуры неведомой геологической эпохи.
//Внутренние стены не отличались такой же массивностью, как внешние, но отлично сохранились на нижних этажах.
//Изощренная запутанность лабиринта усложнялась здесь постоянной сменой уровней, переходом с одного этажа на другой,
//и не прибегни мы к испытанному способу с клочками бумаги, которые разбрасывали по всему пути, то, несомненно, заблудились
//бы сразу. Сначала мы решили обследовать более ветхие помещения и потому взобрались футов на сто вверх, туда, где под
//полярным небом, открытые снегу и ветру, понемногу разрушались комнаты, находившиеся когда-то под самой крышей. Вместо лестниц
//тут применялись лежащие под небольшим углом каменные плиты с ребристой поверхностью. Помещения были самых разнообразных
//размеров и форм -- от излюбленных звездчатых до треугольных и квадратных. Можно с уверенностью сказать, что площадь каждого
//из них в среднем равнялась 30 x 30 футов, а высота -- футов двадцать, хотя попадались комнаты и побольше. Облазив весь верхний
//этаж и осмотрев ледяной покров, мы спустились в нижние помещения, где, собственно, и начинался настоящий лабиринт -- комнаты и
//коридоры переходили одни в другие, сливаясь и расходясь снова,-- все эти запутанные ходы тянулись бесконечно далеко,
//выходя за пределы дома. Каждый новый зал превосходил предыдущий размерами, скоро эта необъятность окружающего стала
//исподволь подавлять нас, тем более что в очертаниях, пропорциях, убранстве и неуловимых особенностях древней каменной
//кладки таилось нечто глубоко чуждое человеческой натуре. Довольно скоро мы поняли из резных настенных изображений, что
//этот противоестественный город выстроен много миллионов лет тому назад. Нам оставался неясен инженерный принцип, в
//соответствии с которым все эти огромные глыбы удерживались в равновесии, плотно прилегая друг к другу; одно было
//понятно -- в нем явно много значила арка. В комнатах отсутствовала какая-либо мебель, они были абсолютно пусты,
//что говорило в пользу того, что город покинули по заранее составленному плану. Единственным украшением являлась
//настенная скульптура, высеченная в камне горизонтальными полосами шириной три фута; барельефы чередовались с полосами
//орнамента той же ширины из геометрических фигур. Было несколько исключений, но, как говорится, они лишь подтверждали
//правило. Часто, впрочем, среди орнамента мелькали картуши из причудливо расположенных точек.