package com.panda.onlineshopping.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
@PrimaryKeyJoinColumn(name = "user_userid")
public class Vendor extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(updatable = false)
	int vendorid;
	@Column
	private String vendorName;
	@Column
	private String vendorCode;
	@Column
	private String phone;
	@Column
	private String image_link;
	@Column
	private int capacity_size;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "vendor")
	private Set<Inventory> inventories = new HashSet<>();

	public Vendor() {

	}

	public Set<Inventory> getInventories() {
		return this.inventories;
	}

	public void setInventories(Set<Inventory> inventories) {
		this.inventories = inventories;
	}

	public int getCapacity_size() {
		return capacity_size;
	}

	public void setCapacity_size(int capacity_size) {
		this.capacity_size = capacity_size;
	}

	public String getImage_link() {
		return image_link;
	}

	public void setImage_link(String image_link) {
		this.image_link = image_link;
	}

	public int getVendorid() {
		return vendorid;
	}

	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Vendor [vendorid=" + vendorid + ", vendorName=" + vendorName + ", vendorCode=" + vendorCode + ", phone="
				+ phone + ", image_link=" + image_link + ", capacity_size=" + capacity_size + ", inventories="
				+ inventories + "]";
	}
}
