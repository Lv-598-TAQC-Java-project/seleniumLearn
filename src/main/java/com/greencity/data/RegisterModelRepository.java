package com.greencity.data;

import org.apache.commons.lang3.RandomStringUtils;

public class RegisterModelRepository {

    private RegisterModelRepository() {
    }

    public static RegisterModel getRegisterModel(){
        return RegisterModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(6))
                .email(RandomStringUtils.randomAlphabetic(5)+"@gmail.com")
                .password(RandomStringUtils.randomAlphabetic(8)+ "." +  RandomStringUtils.randomNumeric(3))
                .nagativeEmail((RandomStringUtils.randomAlphabetic(8)+"@com"))
                .shortPassword(RandomStringUtils.randomAlphabetic(5))
                .negativePassword(RandomStringUtils.randomAlphabetic(10))
                .build();
    }
}