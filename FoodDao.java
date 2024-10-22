package com.foodplazza.Dao;

import java.util.List;

import com.foodplazza.pojo.Food;

public interface FoodDao {
  boolean addFood(Food food);
  boolean updateFoodById(Food food);
  boolean deleteFoodById(int foodId);
  Food searchFoodById(int foodid);
  
  List<Food>getAllFood();
  
}
