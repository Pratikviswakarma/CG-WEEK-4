package Day1.PersonalizedMealPlanGenerator;

class KetoMeal implements MealPlan {
    final private String mealName;
    public KetoMeal(String mealName) {
    this.mealName = mealName;
    }
    public String getMealName() {
    return mealName;
    }
   }
   
