package com.thinkxfactor.zomatoplus.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_item")

public class Items implements Serializable {
	
	public Items() {
		super();
	}

	public Items(Long id, Long restaurantId, String name, String price, String description) {
		super();
		this.id = id;
		this.restaurantId = restaurantId;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	@Id
	@GeneratedValue
	@Column(name="item_id")
	private Long id;
	
	@Column(name="restaurant_id")
	private Long restaurantId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	
	@Column(name="description")
	private String description;
	
	public long getId()
	{
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public Long getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Long restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
 
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	/*private String itemID;
	
	public String getItemID() {
		return itemID;
	}
	
	public Items(String itemID)
	{
		super();
		this.itemID=itemID;
	}
	
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	public Items() {
		super();
	}
	
}*/

