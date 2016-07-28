import org.junit.Before;

import static org.junit.Assert.*;

/**
 * Created by majo on 7/26/16.
 */
public class HelloWorldTest {

    @Before
    public void setup() throws Exception {
        System.out.println("starting tests!");
    }

    @org.junit.Test
    public void testAdd() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(4, helloWorld.add(1,3));
    }

    @org.junit.Test
    public void testDiv() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(2, helloWorld.div(8,4));
    }

    @org.junit.Test
    public void testSub() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(4, helloWorld.sub(7,3));
    }

    @org.junit.Test
    public void testMult() throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        assertEquals(3, helloWorld.mult(1,3));
    }
}