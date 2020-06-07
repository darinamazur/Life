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
        Field fld = new Field(5,5);
        fld.generate(3);
        Cell x = fld.getCell(2,2);
        Cell y = new Cell();
        assertEquals(x,y);//false
    }

    //@Test
    //public void updateField() {
    //}

    /*@Test
    public void simulate() {
    }*/
}