package com.fnol.dto;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class HotelDTO {
	List<DriverDetailsDTO> driverDetails;

	public List<DriverDetailsDTO> getDriverDetails() {
		return driverDetails;
	}

	public void setDriverDetails(List<DriverDetailsDTO> driverDetails) {
		this.driverDetails = driverDetails;
	}

	@Override
	public String toString() {
		return "HotelDTO [driverDetails=" + driverDetails
				+ ", getDriverDetails()=" + getDriverDetails()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}	
	
	/*public String address;
	public String category;
	public String city;
	public String country;
	public String latitude;
	public String longitude;
	public String name;
	public String postalCode;
	public String province;
	public String rating;
	public String reviewText;
	public String title;
	public String userName;
	
	
	
	
	@Override
	public String toString() {
		return "HotelDTO [address=" + address + ", category=" + category
				+ ", city=" + city + ", country=" + country + ", latitude="
				+ latitude + ", longitude=" + longitude + ", name=" + name
				+ ", postalCode=" + postalCode + ", province=" + province
				+ ", rating=" + rating + ", reviewText=" + reviewText
				+ ", title=" + title + ", userName=" + userName + "]";
	}
	public String getReviewText() {
		return reviewText;
	}
	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
*/

	

