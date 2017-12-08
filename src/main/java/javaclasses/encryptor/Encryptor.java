package javaclasses.encryptor;

/**
 * Program for encryption the text to secret code.
 * Example: have a nice day -> hae and via ecy
 *
 * @author DiachenkoD
 */
public interface Encryptor {
    /**
     * @param text that you want to encrypt. Text must be unnul.
     * @return the encrypted text like in the example above.
     */
    String encrypt(String text);
}
