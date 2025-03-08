package Day1.PersonalizedMealPlanGenerator;

class VegetarianMeal implements MealPlan {
    final private String mealName;
    public VegetarianMeal(String mealName) {
    this.mealName = mealName;
    }
    public String getMealName() {
    return mealName;
    }
   }
   
