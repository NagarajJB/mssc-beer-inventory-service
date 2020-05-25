package com.njb.msscbeerinventoryservice.web.mappers;

import org.mapstruct.Mapper;

import com.njb.model.BeerInventoryDto;
import com.njb.msscbeerinventoryservice.domain.BeerInventory;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
