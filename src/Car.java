public class Car implements InterfaceCar, InterfaceStFunct {
    private String Name;
    AbstractPlace place;
    private StoryHero hero;
    Car(String n) {
        Name = n;
    }
    public void cardriveTo(AbstractPlace p) {
        place = p;
        System.out.println("Машина едет по: " + place.getPlace());
    }
    public void cardriveFrom(AbstractPlace p) {
        place = p;
        System.out.println("Машина выехала из: " + place.getPlace());
    }
    public void cardriveThrough(AbstractPlace p) {
        place = p;
        System.out.println("Машина едет мимо: " + place.getPlace());
    }

    @Override
    public String getCondition() {
        return this.getCondition();
    }
    public void carShake(AbstractPlace p) {
        place = p;
        System.out.println("Машина трясётся из-за неровной дороги в месте: " + place.getPlace());
    }
    public void cardriveDeep(AbstractPlace p) {
        place = p;
        System.out.println("Машина углубилась в: " + place.getPlace());
    }
    public void carStop(StoryHero h) {
        hero = h;
        System.out.println(hero.getName() + " остановил машину");
    }
    static class Condition {

    }
    public static class Starter extends AbstractThing {
        Starter(String s) {
            super(s);
        }
        public void grate() {
            System.out.println(getType() + " издаёт скрежет");
        }
    }
    class Hood {
        private String Type;
        Hood(String t) {
            Type = t;
        }
        public void openHood(StoryHero h) {
            hero = h;
            System.out.println(hero.getName() + " открыл " + Type);
        }
    }
    class Engine {
        private String Type;

        Engine(String t) {
            Type = t;
        }

        public boolean IsEngineWorks;

        public void lookIntoEngine(StoryHero h) {
            hero = h;
            System.out.println(hero.getName() + " ковыряется в " + Type);
        }

        String getType() {
            return Type;
        }

        public void start() {
            System.out.println("Мотор работает");
            this.IsEngineWorks = true;
        }

        public void startEngine() throws CardriveException {
            System.out.println("Попытка завести машину");
            if (IsEngineWorks) {
                throw new CardriveException("Машина заведена, отвлетвление от истории");
            } else {
                System.out.println("Мотор не работает");
            }
        }
    }
    class StarterPedal {
        private String Type;
        StarterPedal(String t) {
            Type = t;
        }
        public void pushStarterPedal(StoryHero h) {
            hero = h;
            System.out.println(hero.getName() + " нажимает на " + Type);
        }
        void start() {

        }
    }
    class StartSystem {
        private String Type;
        StartSystem(String t) {
            Type = t;
        }
        public void turnOffSS(StoryHero h) {
            hero = h;
            System.out.println(hero.getName() + " выключил " + Type);
        }
        void start() {

        }
    }
}

