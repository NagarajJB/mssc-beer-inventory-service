package com.njb.msscbeerinventoryservice.services;

import com.njb.model.BeerOrderDto;

public interface AllocationService {
	Boolean allocateOrder(BeerOrderDto beerOrderDto);
	void deallocateOrder(BeerOrderDto beerOrderDto);
}
