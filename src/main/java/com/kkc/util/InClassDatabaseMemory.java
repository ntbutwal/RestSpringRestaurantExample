package com.kkc.util;

import java.util.HashMap;
import java.util.Map;

import com.kkc.restaurantDto.RestaurantDto;

public class InClassDatabaseMemory {

	public static Map<String, RestaurantDto> restaurant;

	static {
		restaurant = new HashMap<String, RestaurantDto>();
		RestaurantDto dto = new RestaurantDto();
		dto.setResNo("a1001a");
		dto.setName("Olive Garden");
		dto.setAddress("Tysons Corner");
		dto.setPhone("7032203541");
		dto.setType("Itilian");
		restaurant.put("a1001a", dto);

		RestaurantDto dto1 = new RestaurantDto();
		dto1.setResNo("b1001b");
		dto1.setName("Silver Dinner");
		dto1.setAddress("Falls Church");
		dto1.setPhone("5712203541");
		dto1.setType("American");
		restaurant.put("b1001b", dto1);

		RestaurantDto dto2 = new RestaurantDto();
		dto2.setResNo("c1001c");
		dto2.setName("Hooters");
		dto2.setAddress("Chantilly");
		dto2.setPhone("4002203541");
		dto2.setType("American");
		restaurant.put("c1001c", dto2);

	}

}
