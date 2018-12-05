package main;

import java.time.DayOfWeek;
import java.util.Arrays;

import main.Exercise.Classification;
import main.Exercise.Muscle;
import main.WeeklyWorkout.Level;

public class Application {
	public static void main(String[] args) {
		ExerciseStore store = new ExerciseStore();
		store.initStore();
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		WeeklyWorkout ww3 = new WeeklyWorkout(new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY}, Level.ADVANCED);
		for(Workout w: ww3.getWorkouts()){
			System.out.println("===================="+w.getDay()+"===================");
			System.out.println(w.printEntireWorkout());
		}

	}
}
