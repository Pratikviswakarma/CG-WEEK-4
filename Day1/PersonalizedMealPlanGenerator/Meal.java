package Day1.PersonalizedMealPlanGenerator;

import java.util.*;

class Meal<T extends MealPlan> {
    final private List<T> meals = new ArrayList<>();
    public void addMeal(T meal) {
    meals.add(meal);
    }
    public List<T> getMeals() {
    return meals;
    }
   }
   