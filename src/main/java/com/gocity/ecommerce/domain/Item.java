package com.gocity.ecommerce.domain;

import java.time.OffsetDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Domain model for item
 * 
 * @author Tanveer Bulsari
 *
 */

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@Column(name = "created_at")
	private OffsetDateTime createdAt;

	@Column(name = "last_updated_at")
	private OffsetDateTime lastUpdatedAt;

	@Column(name = "is_deleted")
	private int isDeleted = 0;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Item(String id, String name, String description, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
	}

	public Item() {
		super();
	}

	public OffsetDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(OffsetDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public OffsetDateTime getLastUpdatedAt() {
		return lastUpdatedAt;
	}

	public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}

	@PrePersist
	protected void onCreate() {
		createdAt = OffsetDateTime.now();
		lastUpdatedAt = createdAt;
	}

	@PostUpdate
	protected void onUpdate() {
		lastUpdatedAt = OffsetDateTime.now();
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

}
