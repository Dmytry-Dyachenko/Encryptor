package javaclasses.encryptor.impl;

import javaclasses.encryptor.Encryptor;

import java.util.List;

public class EncryptorImpl implements Encryptor {

    @Override
    public String encrypt(String text) {
        OutputContext context = new OutputContext();
        TextReader reader = new TextReader(text);


        return context.getEncryptedString().toString();
    }


}
