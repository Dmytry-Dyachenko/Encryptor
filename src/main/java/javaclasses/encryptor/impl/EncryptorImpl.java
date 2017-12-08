package javaclasses.encryptor.impl;

import javaclasses.encryptor.Encryptor;

import java.util.*;

public class EncryptorImpl implements Encryptor {

    @Override
    public String encrypt(String text) {
        OutputContext context = new OutputContext();
        TextReader reader = new TextReader(text);

        createEncryptionMatrixForTextWithLength(reader.getTextForEncrypting(), reader.getTextForEncryptionLength());


        return context.getEncryptedString().toString();
    }

    private Map<Integer, String> createEncryptionMatrixForTextWithLength(String textForEncrypting, int textForEncryptionLength) {

        Map<Integer, String> encryptionMatrix = new HashMap<>();
        final List<Integer> columnAndRowSize = getColumnAndRowLength(textForEncryptionLength);

        return null;
    }

    public List<Integer> getColumnAndRowLength(int textForEncryptionLength) {
        final int columnSize = (int) Math.sqrt(textForEncryptionLength);
        int rowSize = columnSize;
        while (rowSize * columnSize < textForEncryptionLength) {
            rowSize++;
        }
        final List<Integer> columnAndRowSize = new ArrayList<>();
        columnAndRowSize.add(columnSize);
        columnAndRowSize.add(rowSize);
        Collections.sort(columnAndRowSize);
        return columnAndRowSize;
    }


}
