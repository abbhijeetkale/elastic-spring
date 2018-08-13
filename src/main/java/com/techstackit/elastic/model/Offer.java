package com.techstackit.elastic.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Offer {

	String id; // TODO this should be UUID
	String description;
	boolean isValid;
	Integer discount;
}
