package ru.stqa.pwn.sandbox;

import org.testng.annotations.Test;

public class SquareTests {

    @Test
    public void testArea(){
        Square s = new Square();
        assert s.area() == 25;
    }
}
