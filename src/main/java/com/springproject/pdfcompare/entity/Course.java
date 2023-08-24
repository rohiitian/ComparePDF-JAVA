package com.springproject.pdfcompare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class Course {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "name")
    private String name;
	@Column(name = "price")
    private int price;
	@Column(name = "duration")
    private int duration;

    public Course(long id,String name, int price, int duration) {
    	this.id=id;
        this.name = name;
        this.price = price;
        this.duration = duration;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

//    @Override
//    public String toString() {
//        return "Course{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", duration=" + duration +
//                '}';
//    }
}
