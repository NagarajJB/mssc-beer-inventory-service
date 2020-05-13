package com.njb.msscbeerinventoryservice.web.mappers;

import org.mapstruct.Mapper;

import com.njb.msscbeerinventoryservice.domain.BeerInventory;
import com.njb.msscbeerinventoryservice.web.model.BeerInventoryDto;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
