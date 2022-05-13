package com.bilgeadam.boost.java.lesson020.EnumExamples;

public enum SizeEnumClass {

	SMALL, MEDIUM, LARGE, XLARGE;

	public String getSize() {

		switch (this) {
		case SMALL:
			return "small";

		case MEDIUM:
			return "medium";

		case LARGE:
			return "large";

		case XLARGE:
			return "xlarge";

		default:
			return "Size not found.";
		}
	}

	public static void main(String[] args) {
		System.out.println("The size of the pizza is " + SizeEnumClass.SMALL.getSize());
	}
}