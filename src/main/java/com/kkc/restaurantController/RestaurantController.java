package com.kkc.restaurantController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kkc.restaurantDto.RestaurantDto;
import com.kkc.restuarantService.RestaurantService;

@RestController
@RequestMapping("/food")
public class RestaurantController {

	private RestaurantService resserv;

	@GetMapping(value = "/{id}/rest")
	public RestaurantDto getDataByDto(@PathVariable(value = "id") String restaurantId) {
		return resserv.getDataByRestaurantDto(restaurantId);

	}

	@GetMapping(value = "/{resid}/restt")
	public RestaurantDto getresDatabyDto(@PathVariable(value = "resid") String restid, @RequestParam String name,
			@RequestParam String type) {
		return resserv.getDataByRestaurantDto(restid);
	}

	@PostMapping()
	public void sendData(@RequestBody RestaurantDto dto) {
		System.out.println(dto.toString());
	}

	public RestaurantService getResserv() {
		return resserv;
	}

	public void setResserv(RestaurantService resserv) {
		this.resserv = resserv;
	}

}
