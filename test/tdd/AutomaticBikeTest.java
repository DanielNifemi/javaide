package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {
    @Test
    public void automaticBikeOnTest() {
        //given that I have a bike
        AutoBike suzukiBike = new AutoBike();
        //when I turn it on
        suzukiBike.setWork(true);
        boolean suzukiBikeOnValue = suzukiBike.getOnValue();
        //check that it is on
        assertTrue(suzukiBikeOnValue);
    }
    @Test
    public void automaticBikeOffTest(){
        //given tht i have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        //when I turn it off
        suzukiBike.setWork(false);
        //check that it is off
        assertFalse(suzukiBike.getOnValue());
    }
    @Test
    public void automaticBikeGearTest(){
        //given that I have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        assertTrue(suzukiBike.getGearStatus());
    }
    @Test
    public void automaticBikeAccelerationTest(){
        //given that I have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        //when I accelerate
        suzukiBike.Accelerate(20);
        //check that it accelerate
        assertEquals(1, suzukiBike.getGearNumber());
        assertEquals(21, suzukiBike.getIncrement());
    }
    @Test
    public void automaticBike2ndAccelerationTest(){
        //given that I have a bike
        AutoBike suzukiBike= new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        //when I accelerate
        suzukiBike.Accelerate(30);
        //check that it accelerate
        assertEquals(2, suzukiBike.getGearNumber());
        assertEquals(32, suzukiBike.getIncrement());
    }
    @Test
    public void automaticBike3rdAccelerationTest(){
        //given that I have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        //when I accelerate
        suzukiBike.Accelerate(40);
        //check that it accelerate
        assertEquals(3, suzukiBike.getGearNumber());
        assertEquals(43, suzukiBike.getIncrement());
    }
    @Test
    public void automaticBike4thAccelerationTest(){
        //given that I have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        //when I accelerate
        suzukiBike.Accelerate(50);
        //check that it accelerate
        assertEquals(4, suzukiBike.getGearNumber());
        assertEquals(54, suzukiBike.getIncrement());
    }
    @Test
    public void automaticBikeDecelerationTest(){
        //given that I have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        //when i  decelerate
        suzukiBike.Accelerate(50);
        suzukiBike.Decelerate(46);
        //check that it decelerates
        assertEquals(4, suzukiBike.getGearNumber());
        assertEquals(42, suzukiBike.getDecrement());
    }
    @Test
    public void automaticBike2ndDecelerationTest(){
        //given that i have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        //when i  decelerate
        suzukiBike.Accelerate(40);
        suzukiBike.Decelerate(37);
        //check that it decelerates
        assertEquals(3, suzukiBike.getGearNumber());
        assertEquals(34, suzukiBike.getDecrement());
    }
    @Test
    public void automaticBike3rdDecelerationTest(){
        //given that i have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        //when i  decelerate
        suzukiBike.Accelerate(30);
        suzukiBike.Decelerate(28);
        //check that it decelerates
        assertEquals(2, suzukiBike.getGearNumber());
        assertEquals(26, suzukiBike.getDecrement());
    }
    @Test
    public void automaticBike4thDecelerationTest(){
        //given that i have a bike
        AutoBike suzukiBike = new AutoBike();
        suzukiBike.setWork(true);
        suzukiBike.engageGear(true);
        //when i  decelerate
        suzukiBike.Accelerate(20);
        suzukiBike.Decelerate(16);
        //check that it decelerates
        assertEquals(1, suzukiBike.getGearNumber());
        assertEquals(15, suzukiBike.getDecrement());
    }
}
