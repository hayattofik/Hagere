package com.hagere.hager;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;
@Data
@Entity
public class post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
   private String Name;
   private String Description;
   @Lob 
   @Column(columnDefinition ="MEDIUMBLOB")
   private String image;
   public Long getId() {
	return id;
} 
public void setId(Long id) {
	this.id = id;
}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ",name=" + Name + ", description=" 
	            + Description + ", image="
				+ image + "]";
	}


}
   



