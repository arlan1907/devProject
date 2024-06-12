package encapsulation;

public class Country {

    private String name;
    private String region;
    private int population;
    private int count;

    public Country(String name, String region, int population) {
        this.name = name;
        this.region = region;
        this.population = population;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
