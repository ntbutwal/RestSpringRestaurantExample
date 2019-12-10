package com.kkc.restuarantService;



import com.kkc.restaurantDto.RestaurantDto;
import com.kkc.util.InClassDatabaseMemory;

public class RestaurantService {
	
	public RestaurantDto getDataByRestaurantDto(String restaurantId) {
		return InClassDatabaseMemory.restaurant.get(restaurantId);
		
	}
}
	
