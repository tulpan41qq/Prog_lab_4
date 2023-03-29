abstract class AbstractPlants {
    private String Type = "растения";
    AbstractPlants(String name) {
        Type = name;
    }
    String getType() {
        return Type;
    }
}