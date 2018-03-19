package com.javaex.basicapi.objectclass.deepclone_solution;

import java.util.Arrays;

public class Scoreboard implements Cloneable {
	//	필드
	private int[] scores;
	
	//	생성자
	public Scoreboard(int[] scores) {
		this.scores = scores;
	}

	//	getter 
	public int[] getScores() {
		return scores;
	}
	
	//	getClone : 클론을 만든다
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
			clone = (Scoreboard)clone();
		} catch (CloneNotSupportedException e) {
			
		}
		
		return clone;
	}
	
	//	toString 오버라이드
	@Override
	public String toString() {
		String output = "Scoreboard(";
		for (int i = 0; i < scores.length; i++) {
			output += scores[i];
			if (i < scores.length - 1) {
				output += ",";
			}
		}
		output += ")";
		
		return output;
	}
	
	//	clone 메서드의 오버라이드
	@Override
	public Object clone() throws CloneNotSupportedException {
		Scoreboard clone = (Scoreboard)super.clone();
		//	참조 객체의 복제를 시도
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}
	
	
}
