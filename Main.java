public class Main
{
    public static void main(String[] args){
        Point pnt1 = new Point();
        Point pnt2 = new Point();
        Point pnt3 = new Point();
        pnt1.x = 4;
        pnt1.y = 5;
        pnt2.x = -14;
        pnt2.y = 52;
        pnt3.x = 0;
        pnt3.y = 12;
        System.out.println(pnt1);
        System.out.println(pnt2);
        System.out.println(pnt3);

        People human1 = new People();
        People human2 = new People();
        People human3 = new People();
        human1.str = "Клеопатра";
        human1.height = 152;
        human2.str = "Пушкин";
        human2.height = 167;
        human3.str = "Владимир";
        human3.height = 189;
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);

        Name ex1 = new Name();
        Name ex2 = new Name();
        Name ex3 = new Name();
        ex1.name = "Клеопатра";
        ex2.name = "Александр";
        ex2.firstname = "Пушкин";
        ex2.fname = "Сергеевич";
        ex3.firstname = "Маяковский";
        ex3.name = "Владимир";
        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);

        Time pr1 = new Time();
        Time pr2 = new Time();
        Time pr3 = new Time();
        pr1.sec = 10;
        pr2.sec = 10000;
        pr3.sec = 100000;
        System.out.println(pr1);
        System.out.println(pr2);
        System.out.println(pr3);

        House fl1 = new House();
        House fl2 = new House();
        House fl3 = new House();
        fl1.floor = 1;
        fl2.floor = 5;
        fl3.floor = 23;
        System.out.println(fl1);
        System.out.println(fl2);
        System.out.println(fl3);

    }
}