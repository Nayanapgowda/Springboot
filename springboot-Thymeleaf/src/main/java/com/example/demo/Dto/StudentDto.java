package com.example.demo.Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDto {
	@Id
private int id;
private String name;
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
@Override
public String toString() {
	return "StudentDto [id=" + id + ", name=" + name + "]";
}

}
