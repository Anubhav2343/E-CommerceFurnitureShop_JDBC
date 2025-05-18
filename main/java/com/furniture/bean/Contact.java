package com.furniture.bean;

public class Contact {
	private String name;
	private String email;
	public Contact(String name, String email, String message, String subject) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
		this.subject = subject;
	}
	public Contact() {
		
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", message=" + message + ", subject=" + subject + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private String message;
	private String subject;
}
