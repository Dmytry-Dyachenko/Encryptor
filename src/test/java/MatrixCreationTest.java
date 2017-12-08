import javaclasses.encryptor.Encryptor;
import javaclasses.encryptor.impl.EncryptorImpl;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixCreationTest {
    EncryptorImpl encryptor = new EncryptorImpl();
    @Test
    public void testColumnAndRowSize() {
       // List<Integer> sizes = encryptor.getColumnAndRowLength(10);
        encryptor.encrypt("if man was meant to stay on the ground god would have given us roots");
        /*assertEquals(3, sizes.get(0),0.001);
        assertEquals(4, sizes.get(1),0.001);*/
    }
}
