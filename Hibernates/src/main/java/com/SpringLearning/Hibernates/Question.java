package com.SpringLearning.Hibernates;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/*What is the reson for usingg mapped?
 * Answer)Here we are having redudent columns for maping the both tabels ,so to avoid it and manintain data integrity and control 
 * of our code ,we will select a serving side and create the forigen key column in it and use it for mapping the both the tabels.
 * By this we can avoid creating two forigen key columns in two tabels.
 * */

@Entity()
public class Question {
	@Id
	
	private int q_id;
	private String q_name;
	@OneToMany(mappedBy="question")
	private List<Answer> answer;

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	public String getQ_name() {
		return q_name;
	}

	public void setQ_name(String q_name) {
		this.q_name = q_name;
	}
}
