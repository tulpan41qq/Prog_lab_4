class Human implements InterfaceHuman, InterfaceStFunct {
    private String Name;
    AbstractPlace place;

    Human(String n, AbstractPlace p) {
        Name = n;
        place = p;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        boolean comp = obj.hashCode() == this.hashCode() ? true : false;
        return comp;
    }

    @Override
    public String toString() {
        try {
            if (place == null) throw new ExistException();
        } catch (ExistException e) {
            e.printStackTrace();
            place = new Place("неизвестно");
        } finally {
            return Name + "находится на месте: " + place.getPlace();
        }
    }

    void nostalgy(Planets p) {
        if (p == Planets.Moon)
            System.out.println("\nЭх, цветы на Земле мне нравятся больше - сказал " + Name);
    }

    boolean investigate() {
        if (place.getPlace() == "лесная дорога") {
            System.out.println("Тут так темно и красиво - сказал " + Name);
            return true;
        } else {
            System.out.println("Обычная дорога - сказал " + Name);
            return false;
        }
    }

    public void drive(AbstractPlace h) {
        place = h;
        System.out.println(Name + " поехал по: " + place.getPlace());
    }

    public void turnFrom(AbstractPlace h) {
        place = h;
        System.out.println(Name + " свернул с: " + place.getPlace());
    }

    public String getName() {
        return Name;
    }

    private AbstractBear medvezhonok;
    private AbstractThing nature;
    private AbstractThing thing;
    private StoryHero hero;
    public void missBear(AbstractBear b) {
        medvezhonok = b;
        System.out.println(Name + " скучает по: " + medvezhonok.getType());
        System.out.println("Скучаю по своему медвежонку - сказал " + Name);
    }

    void fidgeting() {
        System.out.println(Name + " ёрзает от нетерпения");
    }

    void choosePlace(AbstractPlace p) {
        place = p;
        System.out.println(Name + " выбрал место: " + place.getPlace());
    }

    void driveAway() {
        System.out.println(Name + " повернул руль");
    }

    void wantsToSee(AbstractBear b) {
        medvezhonok = b;
        System.out.println(Name + " хочет увидеть: " + medvezhonok.getType());
    }

    void wantsToCuddle(AbstractBear b) {
        medvezhonok = b;
        System.out.println(Name + " хочет приласкать: " + medvezhonok.getType());
    }

    public void driveTo(AbstractPlace h) {
        place = h;
        System.out.println(Name + " поехал в сторону: " + place.getPlace());
    }
    public void headSpin() {
        System.out.println(Name + " вертит головой во все стороны");
    }
    public void admire(AbstractThing t) {
        nature = t;
        System.out.println(Name + " восхищается: " + nature.getType());
    }
    public void push(StoryHero n) {
        hero = n;
        System.out.println(Name + " толкнул " + hero.getName());
    }
    public boolean see(AbstractThing t) {
        nature = t;
        System.out.println(Name + " видит: " + nature.getType());
        return true;
    }
    public void worry() {
        System.out.println(Name + " волнуется");
    }
    public void shout(String s) {
        System.out.println(Name + " кричит: " + s);
    }
    public void shoutInEar(StoryHero h, String s) {
        hero = h;
        System.out.println(Name + " кричит в ухо " + hero.getName() + ": " + s);
    }
    boolean pushnshout() {
        if (place.getPlace() == "лесная дорога") {
            System.out.println("Тут так темно и красиво - сказал " + Name);
            return true;
        } else {
            System.out.println("Обычная дорога - сказал " + Name);
            return false;
        }
    }
    public void stay() {
        System.out.println(Name + " застыл от восторга, не может говорить");
    }
    public void drivenlaugh() {
        System.out.println(Name + " тихо смеётся, сидя за рулём");
    }
    public void cling(StoryHero n) {
        hero = n;
        System.out.println(Name + " вцепился в: " + hero.getName());
    }
    public void handShake(StoryHero n) {
        hero = n;
        System.out.println(Name + " трясёт руку " + hero.getName());
    }
    public void lookAround() {
        System.out.println(Name + " оглядывается по сторонам");
    }
    public void findOut(StoryHero h, AbstractPlace p) {
        place = p;
        hero = h;
        System.out.println(Name + " обнаружил, что он с: " + hero.getName() + " едут по: " + place.getPlace());
    }
    public void ask(String s) {
        System.out.println(Name + " спросил: " + s);
    }
    public void getFromCar() {
        System.out.println(Name + " вылез из машины");
    }
    public void getInCar() {
        System.out.println(Name + " залез в машину");
    }
    public void turnOffCarItem(AbstractThing t) {
        thing = t;
        System.out.println(Name + " выключил " + thing.getType() + " машины");
    }
}

