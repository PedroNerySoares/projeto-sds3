package com.devsuperior.dsvenda.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sellers")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {}

	public Seller(Long idLong, String name) {
		this.id = idLong;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	public void setIdLong(Long idLong) {
		this.id = idLong;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public List<Sale> getSales() {
		return sales;
	}

	
	

}
