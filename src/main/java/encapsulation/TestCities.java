package encapsulation;

public class TestCities {

    public static void main(String[] args) {
        Country country1 = new Country("USA", "North America",333);
        Country country2 = new Country("Germany", "Europe",83);
        Country country3 = new Country("China", "Asia",1412);

        City city1 = new City("New York", 8, country1);
        City city2 = new City("Los Angeles", 3, country1);
        City city3 = new City("Berlin", 3, country2);
        City city4 = new City("Shanghai", 26, country3);
        City city5 = new City("Beijing", 21, country3);


        City[] cities = {city1,city2,city3,city4,city5};

        System.out.println(getPopulation(cities, "usa"));

    }
    // write a method that takes array of cities and country name as parameters
    // and methods return total population of cities of country
    // ex: .getPopulation(cities, "USA") -> return11;

    public static int getPopulation(City[] cities, String country){
        int totalPopulation = 0;
        for (City city : cities) {
            if (city.getCountry().getName().equalsIgnoreCase(country)) {
                totalPopulation += city.getPopulation();
            }
        }
        return totalPopulation;
    }


}
