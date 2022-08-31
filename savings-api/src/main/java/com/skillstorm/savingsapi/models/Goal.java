package com.skillstorm.savingsapi.models;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "goals")
public class Goal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	@Column(name = "name")
	private String name;
	
	@NotNull
	@Column(name = "description")
	private String description;
	
	@Column(name = "image")
	private String image;
	
	@Future
	@Column(name = "date")
	private LocalDate date;
	
	@DecimalMin(value = "0.00", inclusive = true)
	@Column(name = "current_amount")
	private double currentAmount;
	
	@NotNull
	@Column(name = "total_amount")
	private double totalAmount;
	
	@ManyToOne()
	@JoinColumn(name = "user_id")
	@JsonBackReference
	private User user;

	// no-argument constructor
	public Goal() {
		super();
	}

	// constructor without the auto-incremented id
	public Goal(String name, String description, String image, LocalDate date, double currentAmount, double totalAmount,
			User user) {
		super();
		this.name = name;
		this.description = description;
		this.image = image;
		this.date = date;
		this.currentAmount = currentAmount;
		this.totalAmount = totalAmount;
		this.user = user;
	}

	// full-argument constructor
	public Goal(int id, String name, String description, String image, LocalDate date, double currentAmount,
			double totalAmount, User user) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.date = date;
		this.currentAmount = currentAmount;
		this.totalAmount = totalAmount;
		this.user = user;
	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getCurrentAmount() {
		return currentAmount;
	}

	public void setCurrentAmount(double currentAmount) {
		this.currentAmount = currentAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// to-string function
	@Override
	public String toString() {
		return "Goal [id=" + id + ", name=" + name + ", description=" + description + ", image=" + image + ", date="
				+ date + ", currentAmount=" + currentAmount + ", totalAmount=" + totalAmount + ", user=" + user
				+ "]";
	}	
}
