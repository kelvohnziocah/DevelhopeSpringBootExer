package DevelhopeSpringBootExercises.ControllerServiceDao;

import DevelhopeSpringBootExercises.ControllerPathVariable.Meals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.sql.Struct;
import java.util.List;

@Service
public class MealService {
    private MealDao mealDao;
    @Autowired
    MealService(MealDao mealDao){
        this.mealDao =mealDao;
    }
    public List<Meals> getAllMeals(){
        return mealDao.getAllMeals();
    }
    public void getMealByName(String mealName){
        mealDao.getMealByName(mealName);
    }
    public void addMeal(Meals meal){
        mealDao.addMeal(meal);
    }
    public void updateMealByName(Meals meal){
        //mealDao.updateMealByName();
    }
    public void deleteMeal(String mealName){
        mealDao.deleteMealByName(mealName);
    }
}
