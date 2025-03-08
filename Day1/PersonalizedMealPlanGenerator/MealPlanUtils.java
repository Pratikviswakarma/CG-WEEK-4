package Day1.PersonalizedMealPlanGenerator;

class MealPlanUtils {
    public static <T extends MealPlan> void generatePlan(T meal) {
    System.out.println("Generated Meal Plan: " + meal.getMealName());
    }
   }
   
