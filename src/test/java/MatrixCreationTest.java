import javaclasses.encryptor.impl.EncryptorImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixCreationTest {
    EncryptorImpl encryptor = new EncryptorImpl();

    @Test
    public void testColumnAndRowSize() {
        List<Integer> sizes = encryptor.getColumnAndRowLength(10);
        assertEquals(3, sizes.get(0), 0.001);
        assertEquals(4, sizes.get(1), 0.001);
    }

    @Test
    public void testTextForEncryption() {
        final String result = encryptor.encrypt("have a nice day");
        assertEquals(result, "hae and via ecy ");
    }
}
