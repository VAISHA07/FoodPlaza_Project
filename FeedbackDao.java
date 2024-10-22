package com.foodplazza.Dao;

import java.util.List;

import com.foodplazza.pojo.Feedback;

public interface FeedbackDao {
	boolean addFeedback(Feedback fd);
	List<Feedback>getAllFeedback();

}
