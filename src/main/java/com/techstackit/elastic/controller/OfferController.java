package com.techstackit.elastic.controller;

import com.techstackit.elastic.dao.OfferDao;
import com.techstackit.elastic.model.Offer;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/offers")
public class OfferController {

	// TODO autowire this by type
	private OfferDao offerDao;

	public OfferController(OfferDao offerDao) {
		this.offerDao = offerDao;
	}

	@PostMapping
	public Offer insertBook(@RequestBody Offer offer) throws Exception {
		return offerDao.insertOffer(offer);
	}

	@GetMapping("/{id}")
	public Map<String, Object> getOfferById(@PathVariable String id) {
		return offerDao.getOfferById(id);
	}

	@PutMapping("/{id}")
	public Map<String, Object> updateOfferById(@RequestBody Offer offer, @PathVariable String id) {
		return offerDao.updateOfferById(id, offer);
	}

	@DeleteMapping("/{id}")
	public void deleteOfferById(@PathVariable String id) {
		offerDao.deleteOfferById(id);
	}

	// TODO add listing of all offers
}
