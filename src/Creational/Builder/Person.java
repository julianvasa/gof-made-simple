package Creational.Builder;

public class Person { // Builder Pattern
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private Person(PersonBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    //All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Builder.Person: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }

    public static class PersonBuilder
    {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public PersonBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public PersonBuilder age(int age) {
            this.age = age;
            return this;
        }
        public PersonBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }
        public PersonBuilder address(String address) {
            this.address = address;
            return this;
        }
        public Person build() {
            Person person =  new Person(this);
            validatePersonObject(person);
            return person;
        }
        private void validatePersonObject(Person person) {
            //Do some basic validations to check
            //if person object does not break any assumption of system
        }
    }

    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("Julian", "Vasa")
                .age(30)
                .address("Fake address 1234")
                .build();

        System.out.println(person1);

        Person person2 = new Person.PersonBuilder("Other", "Person")
                .age(40)
                .phone("5655")
                //no address
                .build();

        System.out.println(person2);

    }
}
