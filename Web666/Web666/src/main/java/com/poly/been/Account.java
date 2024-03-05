package com.poly.been;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@SuppressWarnings("serial")
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Accounts")
public class Account implements Serializable{
	@Id
    @Column(name = "Username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "email")
    private String email;
    
    @Column(name = "account_adress")
    private String account_adress;

    @Column(name = "phone")
    private String phone;

    @Column(name = "photo")
    private String photo;

    @OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Authority> authorities;
    @JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Order> orders;
	public Account(String username, String password, String fullname, String email, String account_adress, String phone,
			String photo, List<Authority> authorities, List<Order> orders) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.account_adress = account_adress;
		this.phone = phone;
		this.photo = photo;
		this.authorities = authorities;
		this.orders = orders;
	}
	public Account() {
		super();
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAccount_adress() {
		return account_adress;
	}
	public void setAccount_adress(String account_adress) {
		this.account_adress = account_adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Authority> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<Authority> authorities) {
		this.authorities = authorities;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
   
}
