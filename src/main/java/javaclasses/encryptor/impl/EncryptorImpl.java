package javaclasses.encryptor.impl;

import javaclasses.encryptor.Encryptor;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.sort;
import static java.util.Collections.unmodifiableList;

public class EncryptorImpl implements Encryptor {

    @Override
    public String encrypt(String text) {
        TextReader reader = new TextReader(text);
        return getEncryptedString(reader);
    }

    private String getEncryptedString(TextReader reader) {
        final StringBuilder encryptedString = new StringBuilder();
        final List<Integer> columnAndRowSize = getColumnAndRowLength(reader.getTextForEncryptionLength());
        final int columnSize = columnAndRowSize.get(0);
        final int rowSize = columnAndRowSize.get(1);
        final char[][] matrixWithSymbolsForEncryption = getEncryptionMatrixForTextWithLength(reader, columnAndRowSize);

        for (int i = 0, n = 0; i < rowSize; i++, n++) {
            for (int j = 0; j < columnSize; j++, n++) {
                encryptedString.append(matrixWithSymbolsForEncryption[j][i]);
            }
            encryptedString.append(" ");
        }
        return encryptedString.toString();
    }

    /**
     * Create the matrix with symbol for encryption.
     *
     * @param reader           the prepared text for encrypting
     * @param columnAndRowSize size the matrix for encrypting.
     * @return encryption matrix.
     */
    private char[][] getEncryptionMatrixForTextWithLength(TextReader reader, List<Integer> columnAndRowSize) {

        final int columnSize = columnAndRowSize.get(0);
        final int rowSize = columnAndRowSize.get(1);
        char[][] matrixSymbolsForEncryption = new char[columnSize][rowSize];
        final char[] symbolsForEncryption = reader.getTextForEncrypting().toCharArray();

        for (int i = 0, n = 0; i < columnSize; i++) {
            for (int j = 0; j < rowSize && n < symbolsForEncryption.length; j++, n++) {
                matrixSymbolsForEncryption[i][j] = symbolsForEncryption[n];
            }
        }
        return matrixSymbolsForEncryption;
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
        sort(columnAndRowSize);
        return unmodifiableList(columnAndRowSize);
    }


}
