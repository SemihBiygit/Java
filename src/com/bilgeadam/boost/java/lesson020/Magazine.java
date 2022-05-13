package com.bilgeadam.boost.java.lesson020;

public class Magazine extends Book {
	private int issueNumber;

	public Magazine(String author, int year, int issueNumber) {
		super(author, year);
		this.issueNumber = issueNumber;
	}

	public int getIssueNumber() {
		return this.issueNumber;
	}

	@Override
	public String toString() {
		return "Magazine [issueNumber=" + this.issueNumber + "]";
	}
	
	@Override
	public double endPrice(double discountRate) {

		return this.getPrice() * discountRate * 0.05;
	}
}
