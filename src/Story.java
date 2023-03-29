public class Story {
    public static void main(String[] args) throws CardriveException {
        System.out.println();
        Place highway = new Place("шоссе");
        Place forestRoad = new Place("лесная дорога");
        Place unknownPlace = new Place("неизвестно");
        StoryHero scooperfield = new StoryHero("Господин Скуперфильд", unknownPlace);
        StoryHero krabs = new StoryHero("Господин Крабс", highway);
        Bear medv = new Bear("медвежонок");
        Car car = new Car("машина");
        Place city = new Place("город");
        Place countries = new Place("деревни с садами и огородами");
        Thing nature = new Thing("природа");
        Thing sheep = new Thing("стадо овец");
        Thing goat = new Thing("коза");
        Place defaultRoad = new Place("дорога");
        Place greenMeadow = new Place("зелёный луг");
        Thing hudePond = new Thing("огромный пруд");
        Thing whiteGoose = new Thing("белые гуси");
        Thing snowyBirds = new Thing("белоснежные птицы");
        Place forestWilderness = new Place("лесная целина");
        Car.Starter starter = new Car.Starter("стартер");
        Car.Hood hood = car.new Hood("капот");
        Car.Engine engine = car.new Engine("мотор");
        Car.StarterPedal starterPedal = car.new StarterPedal("педаль стартера");
        Car.StartSystem startSystem = car.new StartSystem("система зажигания");
        Thing anonWater = new Thing("вода") {
            @Override
            public void waterBrr() {
                System.out.println("Слышны звуки воды");
            }
        };



        car.cardriveFrom(city);
        car.cardriveTo(highway);
        Roads high = new Roads();
        Flower sunflower = new Flower("подсолнечник", Planets.Moon);
        Flower buckwheat = new Flower("гречиха с приятным, сладковатым медовым запахом", Planets.Moon);
        Flower wheat = new Flower("волнующаяся, словно море, колосящаяся пшеница", Planets.Moon);
        Decoration highw = new Decoration();
        highw.addFlower(high, sunflower);
        highw.addFlower(high, buckwheat);
        highw.addFlower(high, wheat);
        highw.showFlowersOnTheOtherRoad(high);
        car.cardriveThrough(countries);
        scooperfield.headSpin();
        scooperfield.admire(nature);

        if (scooperfield.see(goat)) {
            scooperfield.push(krabs);
            scooperfield.worry();
            scooperfield.shout("почему люди держут у себя животных?");
            krabs.drivenlaugh();
        } else if (scooperfield.see(sheep)) {
            scooperfield.push(krabs);
            scooperfield.worry();
            scooperfield.shout("почему люди держут у себя животных?");
            krabs.drivenlaugh();
        } else {
            System.out.println("Ничего не происходит");
        }
        System.out.println();
        System.out.println("Неожиданно");
        System.out.println();
        System.out.println("Место: " + defaultRoad.getPlace() + ": описало большую дугу");
        System.out.println("За поворотом открылось место: " + greenMeadow.getPlace());
        System.out.println("На месте " + greenMeadow.getPlace() + " находится: " + hudePond.getType());
        System.out.println("Посреди " + hudePond.getType() + " плавают: " + whiteGoose.getType());
        Roads water = new Roads();
        Flower lily = new Flower("лилии", Planets.Moon);
        Flower waterLily = new Flower("кувшинки", Planets.Moon);
        Decoration waterdecor = new Decoration();
        waterdecor.addFlower(water, lily);
        waterdecor.addFlower(water, waterLily);
        scooperfield.see(hudePond);
        scooperfield.stay();
        waterdecor.showFlowersOnTheWater(water);
        System.out.println("Также, на месте " + hudePond.getType() + " находятся: " + snowyBirds.getType());
        anonWater.waterBrr();
        scooperfield.cling(krabs);
        scooperfield.handShake(krabs);
        scooperfield.shoutInEar(krabs, "Здесь так красиво!");



        System.out.println();

        scooperfield.fidgeting();
        scooperfield.missBear(medv);
        scooperfield.wantsToSee(medv);
        scooperfield.wantsToCuddle(medv);

        System.out.println();

        System.out.println("Между тем");

        System.out.println();

        krabs.turnFrom(highway);
        krabs.driveTo(forestRoad);

        System.out.println();

        Roads road = new Roads();
        Flower cedar = new Flower("кедры", Planets.Moon);
        Flower oak = new Flower("дубы", Planets.Moon);
        Flower chestnut = new Flower("каштаны", Planets.Moon);
        Flower bambooLeaves = new Flower("заросли бамбука", Planets.Moon);
        Decoration decoration = new Decoration();
        decoration.addFlower(road, cedar);
        decoration.addFlower(road, oak);
        decoration.addFlower(road, chestnut);
        decoration.addFlower(road, bambooLeaves);

        if (krabs.investigate()) {
            krabs.drive(forestRoad);
            decoration.showFlowersOnTheRoad(road);
            krabs.nostalgy(Planets.Moon);
        }
        System.out.println();

        Place forest = new Place("лес");
        krabs.choosePlace(forest);
        krabs.driveAway();
        krabs.drive(forest);

        car.carShake(forest);
        scooperfield.lookAround();
        scooperfield.findOut(krabs, forestWilderness);
        scooperfield.ask("Здесь кто-нибудь был до нас?");
        car.cardriveDeep(forest);
        car.carStop(krabs);
        krabs.getFromCar();
        hood.openHood(krabs);
        engine.lookIntoEngine(krabs);
        startSystem.turnOffSS(krabs);
        krabs.getInCar();
        starterPedal.pushStarterPedal(krabs);
        starter.grate();
        engine.startEngine();

        System.out.println();
        System.out.println("Конец истории.");
        System.out.println();
        System.out.println("Содержимое истории:");
        System.out.println("Герои: " + krabs.getName() + ", " + scooperfield.getName());
        System.out.println("Места: " + highway.getPlace() + ", " + forestRoad.getPlace() + ", " + forest.getPlace() + ", ");
        System.out.println(city.getPlace() + ", " + countries.getPlace() + ", " + defaultRoad.getPlace() + ", ");
        System.out.println(greenMeadow.getPlace() + ", " + forestWilderness.getPlace());
        System.out.println("Цветы: ");
        decoration.getFlowersList(road);
        highw.getFlowersList(high);
        waterdecor.getFlowersList(water);
    }
    static private class Flower extends AbstractFlower {
        Flower(String name, Planets p) {
            super(name, p);
        }
    }
}