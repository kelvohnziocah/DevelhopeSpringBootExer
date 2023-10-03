package DevelhopeSpringBootExercises.ControllerServiceDao;

import DevelhopeSpringBootExercises.ControllerPathVariable.Meals;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MealDao {
    List<Meals> meal = new ArrayList<>();
    public void addMeal(Meals meal){
        this.meal.add(meal);
    }public List<Meals> getAllMeals(){
        return this.meal;
    }
    public void getMealByName(String mealName){

    }
    public void updateMealByName( String name, Meals updatedMeal){

    }
    public void deleteMealByName(String mealName){
        this.meal.removeIf(meals -> meals.getName().equals(mealName));
    }
}
