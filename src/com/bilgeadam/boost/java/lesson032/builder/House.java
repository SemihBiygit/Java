package com.bilgeadam.boost.java.lesson032.builder;

public class House {
	private int area; // must have
	private int numOfRooms; // must have
	private int numOfFloors; // must have
	private int numOfBalconies; // optional
	private int areaOfFrontGarden; // optional
	private int areaOfBackGarden; // optional
	private int numOfWindows; // must have
	private int numOfOutDoors; // optional
	private int areaOfPorch; // optional
	private Adress adress; // must have

	public House(HouseBuilder houseBuilder) {
		this.area = houseBuilder.area;
		this.numOfRooms = houseBuilder.numOfRooms;
		this.numOfFloors = houseBuilder.numOfFloors;
		this.numOfBalconies = houseBuilder.numOfBalconies;
		this.areaOfFrontGarden = houseBuilder.areaOfFrontGarden;
		this.areaOfBackGarden = houseBuilder.areaOfBackGarden;
		this.numOfWindows = houseBuilder.numOfWindows;
		this.numOfOutDoors = houseBuilder.numOfOutDoors;
		this.areaOfPorch = houseBuilder.areaOfPorch;
		this.adress = houseBuilder.adress;
	}

	@Override
	public String toString() {
		return "House [area=" + this.area + ", numOfRooms=" + this.numOfRooms + ", numOfFloors=" + this.numOfFloors
				+ ", numOfBalconies=" + this.numOfBalconies + ", areaOfFrontGarden=" + this.areaOfFrontGarden
				+ ", areaOfBackGarden=" + this.areaOfBackGarden + ", numOfWindows=" + this.numOfWindows
				+ ", numOfOutDoors=" + this.numOfOutDoors + ", areaOfPorch=" + this.areaOfPorch + ", adress="
				+ this.adress + "]";
	}

	public static class HouseBuilder {
		private int area; // must have
		private int numOfRooms; // must have
		private int numOfFloors; // must have
		private int numOfBalconies; // optional
		private int areaOfFrontGarden; // optional
		private int areaOfBackGarden; // optional
		private int numOfWindows; // must have
		private int numOfOutDoors; // optional
		private int areaOfPorch; // optional
		private Adress adress; // must have

		public HouseBuilder(int area, int numOfRooms, int numOfFloors, int numOfWindows, Adress adress) {
			super();
			this.area = area;
			this.numOfRooms = numOfRooms;
			this.numOfFloors = numOfFloors;
			this.numOfWindows = numOfWindows;
			this.adress = adress;
		}

		public HouseBuilder numOfBalconies(int numOfBalconies) {
			this.numOfBalconies = numOfBalconies;
			return this;
		}

		public HouseBuilder areaOfFrontGarden(int areaOfFrontGarden) {
			this.areaOfFrontGarden = areaOfFrontGarden;
			return this;
		}

		public HouseBuilder areaOfBackGarden(int areaOfBackGarden) {
			this.areaOfBackGarden = areaOfBackGarden;
			return this;
		}

		public HouseBuilder numOfOutDoors(int numOfOutDoors) {
			this.numOfOutDoors = numOfOutDoors;
			return this;
		}

		public HouseBuilder areaOfPorch(int areaOfPorch) {
			this.areaOfPorch = areaOfPorch;
			return this;
		}

		public House build() {
			House house = new House(this);
			return house;
		}

	}
}
