package Day1.PersonalizedMealPlanGenerator;

public class FoodManagement {
    public static void main(String[] args) {
    // Create meals
    Meal<VegetarianMeal> vegMealPlan = new Meal<>();
    vegMealPlan.addMeal(new VegetarianMeal("Grilled Vegetables"));
    vegMealPlan.addMeal(new VegetarianMeal("Paneer Curry"));
    Meal<VeganMeal> veganMealPlan = new Meal<>();
    veganMealPlan.addMeal(new VeganMeal("Tofu Stir Fry"));
    // Generate personalized meal plan
    MealPlanUtils.generatePlan(new VegetarianMeal("Vegetable Salad"));
    MealPlanUtils.generatePlan(new KetoMeal("Grilled Chicken & Avocado"));
    }
   }
   