package Day1.PersonalizedMealPlanGenerator;

class VeganMeal implements MealPlan {
    final private String mealName;
    public VeganMeal(String mealName) {
    this.mealName = mealName;
    }
    public String getMealName() {
    return mealName;
    }
   }
   
