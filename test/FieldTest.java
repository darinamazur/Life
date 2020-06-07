import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {

    @Test
    public void clear() {
        Field fld = new Field(5,5);
        fld.clear();
        assertEquals(fld.width,fld.height);
    }
    
    @Test
    public void getCell() {
    }

    @Test
    public void updateField() {
    }

    @Test
    public void simulate() {
    }
}