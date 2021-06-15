package com.greencity.data;

import lombok.Getter;

@Getter
public class RegisterModel {

    private String userName;
    private String email ;
    private String password ;
    private String negativeEmail;
    private String shortPassword;
    private String negativePassword;


    RegisterModel(){

    }
    public static RegisterModel.Builder getBuilder(){
        return new RegisterModel().new Builder();
    }
    public class Builder{
        public RegisterModel.Builder firstName(String value) {
            userName = value;
            return this;
        }

        public RegisterModel.Builder nagativeEmail(String value) {
            negativeEmail = value;
            return this;
        }

        public RegisterModel.Builder email(String value) {
            email = value;
            return this;
        }

        public RegisterModel.Builder password(String value) {
            password = value;
            return this;
        }
        public RegisterModel.Builder shortPassword(String value) {
            shortPassword = value;
            return this;
        }
        public RegisterModel.Builder negativePassword(String value) {
            negativePassword = value;
            return this;
        }
        public RegisterModel build(){
            return RegisterModel.this;
        }

    }
}
