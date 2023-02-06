public class Main {
    public static void main(String[] args) {
        Country country1 = new Country();
        country1.setCountry("Kyrgyzstan");
        country1.setNation("Kyrgyz");

        Country country2 = new Country();
        country2.setCountry("Germany");
        country2.setNation("German");

        Country country3 = new Country();
        country3.setCountry("Turkey");
        country3.setNation("Turk");
        System.out.println("Country : Nation ");


        Country[] countries = {country1, country2, country3};
        for (Country c : countries) {
            System.out.println(c.getCountry() + ": " + c.getNation());
        }

        System.out.println("-------------------------------");

        City city1 = new City();
        city1.setName("Bishkek");

        City city2 = new City();
        city2.setName("Berlin");

        City city3 = new City();
        city3.setName("Antalya");


        City[] cities = {city1, city2, city3};
        for (City s : cities) {
            System.out.println("City: " + s.getName());
        }

        System.out.println("------------------------------");

        Address address1 = new Address();
        address1.setName("Alamidin-1");

        Address address2 = new Address();
        address2.setName("Unter den Linden");

        Address address3 = new Address();
        address3.setName("Kemer");

        Address[] address = {address1, address2, address3};
        for (Address e : address) {
            System.out.println("Address: " + e.getName());
        }

        System.out.println("---------------------------------");


        Person person1 = new Person();
        person1.setFirstName("Davran");
        person1.setLastName("Joldoshbaev");
        person1.setAge(17);

        Person person2 = new Person();
        person2.setFirstName("Erjan");
        person2.setLastName("Taalaibekov");
        person2.setAge(18);

        Person person3 = new Person();
        person3.setFirstName("Adilet");
        person3.setLastName("Kurmanov");
        person3.setAge(18);

        Person[] people = {person1, person2, person3};
        for (Person p : people) {
            System.out.println("First name: " + p.getFirstName() + "\n" + "Last name: " + p.getLastName() + "\n" + "Age: " + p.getAge());
        }
    }
}