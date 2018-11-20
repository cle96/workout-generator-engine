package main;

import java.time.DayOfWeek;

public class Application {
	public static void main(String[] args) {
		ExerciseStore store = new ExerciseStore();
		store.initStore();
		WeeklyWorkout ww = new WeeklyWorkout(new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY}, WeeklyWorkout.Level.BEGINNER);
		for(Workout w: ww.getWorkouts()){
			System.out.println("===================="+w.getDay()+"===================");
			System.out.println(w.printEntireWorkout());
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		WeeklyWorkout ww2 = new WeeklyWorkout(new DayOfWeek[]{DayOfWeek.MONDAY}, WeeklyWorkout.Level.INTERMEDIATE);
		for(Workout w: ww2.getWorkouts()){
			System.out.println("===================="+w.getDay()+"===================");
			System.out.println(w.printEntireWorkout());
		}
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		WeeklyWorkout ww3 = new WeeklyWorkout(new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY, DayOfWeek.SATURDAY}, WeeklyWorkout.Level.ADVANCED);
		for(Workout w: ww3.getWorkouts()){
			System.out.println("===================="+w.getDay()+"===================");
			System.out.println(w.printEntireWorkout());
		}

	}
}
