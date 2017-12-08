package javaclasses.encryptor.impl;

public class TextReader {

    final private String textForEncrypting;

    public TextReader(String text) {
        this.textForEncrypting = text.replace(" ", "");
    }


    public String getTextForEncrypting() {
        return textForEncrypting;
    }

    public int getTextForEncryptionLength() {
        return this.textForEncrypting.length();
    }
}
