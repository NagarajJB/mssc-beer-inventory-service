package com.njb.msscbeerinventoryservice.services;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.njb.common.events.NewInventoryEvent;
import com.njb.msscbeerinventoryservice.config.JmsConfig;
import com.njb.msscbeerinventoryservice.domain.BeerInventory;
import com.njb.msscbeerinventoryservice.repositories.BeerInventoryRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class NewInventoryListener {

	private final BeerInventoryRepository beerInventoryRepository;

	@JmsListener(destination = JmsConfig.NEW_INVENTORY_QUEUE)
	public void listenToNewInventoryQueue(NewInventoryEvent event) {
		log.debug("Got Inventory: " + event.toString());

		beerInventoryRepository.save(BeerInventory.builder().beerId(event.getBeerDto().getId())
				.upc(event.getBeerDto().getUpc()).quantityOnHand(event.getBeerDto().getQuantityOnHand()).build());

	}

}
