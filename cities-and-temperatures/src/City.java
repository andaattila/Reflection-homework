public class City {
    private String name;
    private double temperature;

    public void city(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }
    public String getName(){
        return name;
    }
    public double getTemperature (){
        return temperature;
    }
}
