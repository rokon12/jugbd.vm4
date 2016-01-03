package org.jugbd.vm4;

import java.util.Date;

/**
 * @author Bazlur Rahman Rokon
 * @since 1/3/16.
 */
public class Person {
    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private Gender gender;
    private Date birthDate;

    public Long getId() {
        return id;
    }

    public Person setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Person setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Person setEmail(String email) {
        this.email = email;
        return this;
    }

    public Gender getGender() {
        return gender;
    }

    public Person setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public Person setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public Person() {
    }

    private Person(Builder builder) {
        id = builder.id;
        firstName = builder.firstName;
        lastName = builder.lastName;
        address = builder.address;
        email = builder.email;
        gender = builder.gender;
        birthDate = builder.birthDate;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static Builder newBuilder(Person copy) {
        Builder builder = new Builder();
        builder.id = copy.id;
        builder.firstName = copy.firstName;
        builder.lastName = copy.lastName;
        builder.address = copy.address;
        builder.email = copy.email;
        builder.gender = copy.gender;
        builder.birthDate = copy.birthDate;
        return builder;
    }


    public static final class Builder {
        private Long id;
        private String firstName;
        private String lastName;
        private String address;
        private String email;
        private Gender gender;
        private Date birthDate;

        private Builder() {
        }

        public Builder withId(Long val) {
            id = val;
            return this;
        }

        public Builder withFirstName(String val) {
            firstName = val;
            return this;
        }

        public Builder withLastName(String val) {
            lastName = val;
            return this;
        }

        public Builder withAddress(String val) {
            address = val;
            return this;
        }

        public Builder withEmail(String val) {
            email = val;
            return this;
        }

        public Builder withGender(Gender val) {
            gender = val;
            return this;
        }

        public Builder withBirthDate(Date val) {
            birthDate = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", gender=").append(gender);
        sb.append(", birthDate=").append(birthDate);
        sb.append('}');
        return sb.toString();
    }
}
