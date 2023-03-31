package com.bean;

public class Subject {
private int id;
private String name;
private int teacherId;
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
public int getTeacherId() {
	return teacherId;
}
public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
}
@Override
public String toString() {
	return "Subject [id=" + id + ", name=" + name + ", teacherId=" + teacherId + "]";
}
public Subject(int id, String name, int teacherId) {
	super();
	this.id = id;
	this.name = name;
	this.teacherId = teacherId;
}

}
