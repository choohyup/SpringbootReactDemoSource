package com.example.demo_spring;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmailValidatorTest {

    private final EmailValidator underTest = new EmailValidator();

    @Test
    public void isShouldValidateCorrectEmail(){
        assertThat(underTest.test("hello@gmail.com")).isTrue();
    }

    @Test
    public void isShouldValidateAnInCorrectEmailWithoutDoAtTheEnd(){
        assertThat(underTest.test("hello@gmai.com")).isFalse();
    }

}