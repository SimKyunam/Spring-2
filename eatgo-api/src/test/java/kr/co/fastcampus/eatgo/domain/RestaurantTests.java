package kr.co.fastcampus.eatgo.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant(1004L,"Bob zip", "Seoul");

        Assertions.assertEquals(restaurant.getId(), 1004L);
        Assertions.assertEquals(restaurant.getName(), "Bob zip");
        Assertions.assertEquals(restaurant.getAddress(), "Seoul");

    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant(1004L,"Bob zip", "Seoul");
        Assertions.assertEquals(restaurant.getInformation(), "Bob zip in Seoul");
    }
}