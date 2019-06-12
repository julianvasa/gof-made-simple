package Creational.Builder;

import java.util.function.Consumer;

public class LambdaPerson {
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

    private LambdaPerson(LambdaPerson.PersonBuilder builder) {
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

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private String phone;
        private String address;

        public PersonBuilder with(
                Consumer<PersonBuilder> builderFunction) {
            builderFunction.accept(this);
            return this;
        }

        public LambdaPerson createUser() {
            return new LambdaPerson(this);
        }
    }

    public static void main(String[] args) {
        LambdaPerson user = new LambdaPerson.PersonBuilder()
                .with(personBuilder -> {
                    personBuilder.firstName = "Julian";
                    personBuilder.lastName = "Vasa";
                    personBuilder.age = 20;
                    personBuilder.address = "Address";
                })
                .createUser();
        System.out.println(user);
    }
}
