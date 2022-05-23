package com.bridgelabz;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest extends HotelReservation {

    @Test
    void whenHotelAddedToSystemShouldGetAdded() {
        Hotel hotel1 = new Hotel("Lakewood", 110, 90,
                80, 80, 3);
        Hotel hotel2 = new Hotel("Bridgewood", 160, 60,
                110, 50, 4);
        Hotel hotel3 = new Hotel("Ridgewood", 220, 150,
                100, 40, 5);
        Hotel[] hotelList = {hotel1, hotel2, hotel3};
        List<Hotel> hotels = Arrays.asList(hotelList);
        HotelReservation hotelReservation = new HotelReservationTest();
        hotelReservation.addHotels(hotel1);
        hotelReservation.addHotels(hotel2);
        hotelReservation.addHotels(hotel3);
        List<Hotel> result = hotelReservation.returnList();
        assertEquals(hotels, result);
    }
}