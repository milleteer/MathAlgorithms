package MultipliesOfANumber;

import junit.framework.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by Greg Koles on 27/03/2015.
 */
public class MultipliesOfANumberTest {

        @Test
        public void CompareTwoNumbersTest() throws Exception{

            MultipliesOfANumber m = new MultipliesOfANumber();
            m.setBase(16);
            m.setNumToCompare(3);

            Assert.assertEquals(16, m.getBase());
            Assert.assertEquals(3, m.getNumToCompare());
            Assert.assertEquals(16, m.CompareTwoNumbers());

        }

        @Test
        public void CompareTwoNumbersTestNegative() throws Exception{

        MultipliesOfANumber m = new MultipliesOfANumber();
        m.setBase(7);
        m.setNumToCompare(3);

        Assert.assertEquals(0, m.getBase());
        Assert.assertEquals(3, m.getNumToCompare());

        }

        @Test
        public void setBaseNegative() throws Exception{

            MultipliesOfANumber m = new MultipliesOfANumber();

            Assert.assertEquals(false, m.setBase(-8));

        }

        @Test
        public void isBaseAtThePowerOfTwo() throws Exception {

            MultipliesOfANumber m = new MultipliesOfANumber();

            Assert.assertEquals(false,m.setBase(3));
            Assert.assertEquals(true, m.setBase(4));

        }

    }
