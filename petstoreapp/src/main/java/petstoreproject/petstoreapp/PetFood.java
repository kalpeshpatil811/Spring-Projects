package petstoreproject.petstoreapp;

public class PetFood {
	private String foodType;
	private int calories;
	private int quantity;

	public PetFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PetFood(String foodType, int calories, int quantity) {
		super();
		this.foodType = foodType;
		this.calories = calories;
		this.quantity = quantity;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
