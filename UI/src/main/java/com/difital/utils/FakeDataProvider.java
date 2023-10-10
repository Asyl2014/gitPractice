package com.difital.utils;

import com.difital.models.Student;
import com.github.javafaker.Faker;

public class FakeDataProvider {
    Faker faker = new Faker();

    public String generateFakeFirstName(){
        return faker.name().firstName();

    }
    public String generateFakeFullName() {
        return faker.name().fullName();
    }

    public  String generateFakeLastName(){
        return faker.name().lastName();
    }

    public String generateFakePhoneNumber(){
        return faker.number().digits(10);
    }

    public String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public String generateFakeCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generateFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }

    public Student createFakeStudent(){
        Student student = new Student();
        student.setFirstName(generateFakeFirstName());
        student.setLastName(generateFakeLastName());
        student.setEMail(generateFakeEmail());
        student.setPhoneNumber(generateFakePhoneNumber());
        student.setCurrentAddress(generateFakeCurrentAddress());
        return student;

    }
}
