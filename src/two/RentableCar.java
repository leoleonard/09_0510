package two;

public class RentableCar extends Car implements Rentable {
    private Person person;

    public RentableCar(String name, int year, int capacity) {
        super(name, year, capacity);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public void rent(String fristName, String lastName, String id) {
        person = new Person("Jan", "Kowalski", "12345");
    }

    @Override
    public void handOver() {
        person = null;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }

    @Override
    public String toString() {
        return "RentableCar{" +
                "person=" + person +
                '}';
    }
}
