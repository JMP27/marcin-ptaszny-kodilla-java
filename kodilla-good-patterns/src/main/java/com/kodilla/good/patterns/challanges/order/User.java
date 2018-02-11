package com.kodilla.good.patterns.challanges.order;

import java.util.Objects;

public class User {
    private final int id;
    private final String name;
    private final String surname;
    private final String adress;
    private final String email;

    public User(int id, String name, String surname, String adress, String email) {
        validate (id,name,surname,adress,email);
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.email = email;
    }

    private void validate(int id, String name, String surname, String adress, String email){
        if (id <= 0) {
            throw new IllegalArgumentException("Id less or equals zero");
        }

        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name is null");
        }

        if (surname == null || surname.isEmpty()){
            throw new IllegalArgumentException("Surname is null");
        }

        if (adress == null || adress.isEmpty()){
            throw new IllegalArgumentException("Adress is null");
        }

        if (email == null || email.isEmpty()){
            throw new IllegalArgumentException("Email is null");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getSurname(), user.getSurname()) &&
                Objects.equals(getAdress(), user.getAdress()) &&
                Objects.equals(getEmail(), user.getEmail());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId(), getName(), getSurname(), getAdress(), getEmail());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
