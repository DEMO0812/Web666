package com.poly.been;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "FavoriteProducts")
public class FavoriteProduct implements Serializable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "account_username")
	@JsonIgnore
	private Account account;

	@ManyToOne
	@JoinColumn(name = "product_id")
	@JsonIgnore
	private Product product;
}
