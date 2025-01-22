package com.jcsoftware.bookstore.dtos;

import java.util.Set;
import java.util.UUID;

public class NewBookDTO {
	
	private String title;
	private String description;
	private UUID publisherId;
	private Set<UUID> authorIds;
	
	public NewBookDTO(String title, String description, UUID publisherId, Set<UUID> authorIds) {
		super();
		this.title = title;
		this.description = description;
		this.publisherId = publisherId;
		this.authorIds = authorIds;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public UUID getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(UUID publisherId) {
		this.publisherId = publisherId;
	}

	public Set<UUID> getAuthorIds() {
		return authorIds;
	}

	public void setAuthorIds(Set<UUID> authorIds) {
		this.authorIds = authorIds;
	}
	
	

	
}
