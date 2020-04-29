package com.abhishekmodak.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
*/
@Entity
@Table(name="tbl_category")
/*
 * @Setter
 * 
 * @Getter
 * 
 * @ToString
 */
public class BookCategory {
	
	@Id //means this is the Primary Key.
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade =  CascadeType.ALL, mappedBy="category")
	private Set<Book> book;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Set<Book> getBook() {
		return book;
	}

	public void setBook(Set<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", categoryName=" + categoryName + ", book=" + book + ", getId()=" + getId()
				+ ", getCategoryName()=" + getCategoryName() + ", getBook()=" + getBook() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
