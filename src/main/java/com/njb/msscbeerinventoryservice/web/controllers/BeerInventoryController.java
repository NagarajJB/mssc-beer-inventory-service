package com.njb.msscbeerinventoryservice.web.controllers;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.njb.msscbeerinventoryservice.repositories.BeerInventoryRepository;
import com.njb.msscbeerinventoryservice.web.mappers.BeerInventoryMapper;
import com.njb.msscbeerinventoryservice.web.model.BeerInventoryDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RestController
public class BeerInventoryController {

	private final BeerInventoryRepository beerInventoryRepository;
	private final BeerInventoryMapper beerInventoryMapper;

	@GetMapping("api/v1/beer/{beerId}/inventory")
	List<BeerInventoryDto> listBeersById(@PathVariable UUID beerId) {
		log.debug("Finding Inventory for beerId:" + beerId);

		return beerInventoryRepository.findAllByBeerId(beerId).stream()
				.map(beerInventoryMapper::beerInventoryToBeerInventoryDto).collect(Collectors.toList());
	}
}
