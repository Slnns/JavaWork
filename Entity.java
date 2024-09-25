class Point {
    int x;
    int y;
    public String toString() {
        return "{"+x+", "+y+"}";
    }
}

class People{
    String str;
    int height;
    public String toString() {
        return "Человек с именем " + str + " и ростом "+ height +".";
    }
}

class Name {
    String name;
    String firstname;
    String fname;

    public String toString() {
        if (fname == null && firstname == null) return name;
        else if (fname == null) return firstname + " " + name;
        else if (firstname == null) return name + " " + fname;
        else return firstname + " " + name + " " + fname;
    }
}
    class Time{
        int sec;
        public String toString() {
            int second = sec;
            while (second>86400){
                second = second % 86400;
            }
            int hour = second/3600;
            int min = (second%3600)/60;
            return hour + ":" + min + ":" + second%60;
        }
    }

    class House{
        int floor;
        public String toString() {
            if(floor%10 == 1) return "Дом с " + floor + " этажом";
            return "Дом с " + floor + " этажами";
        }
    }


