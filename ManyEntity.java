class Line {
    Point pnt1, pnt2;

    public String toString() {
        return "Line free " + pnt1 + " to " + pnt2;
    }
}

class PeoplewithHeight{
    Name name, father;
    int height;

    public String toString() {
        if (father != null) {
            if (name.firstname == null && father.firstname != null) name.firstname = father.firstname;
            if (name.fname == null && father.name != null) name.fname = father.name + "ович";
        }
        return "Человек с именем " + name + " и ростом " + height + ".";
    }
}

class Otdel{
    String name;
    OfficeWorker director;
}

class OfficeWorker {
    String name;
    Otdel office;

    public String toString() {
        if (name == office.director.name) return name + " начальник " + office.name + " отдела";
        return name + " работает в отделе " + office.name + ", начальник которого " + office.director.name;
    }
}
