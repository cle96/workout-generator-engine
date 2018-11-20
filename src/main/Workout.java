package main;

import main.WeeklyWorkout.Level;

import java.time.DayOfWeek;

//import javafx.beans.value.WritableObjectValue;

public class Workout {

	private DayOfWeek day;
	private Exercise strength;
	private WorkoutRoutine[] routines;
	private int position;

	public Workout(DayOfWeek day, Exercise strength, Level level, int position) {
		this.day = day;
		this.strength = strength;
		this.position = position;
		
		switch (level) {
		case BEGINNER:
			this.routines = generateBeginnerRoutines(level);
			break;
		case INTERMEDIATE:
			this.routines = generateIntermediateRoutines(level);
			break;
		case ADVANCED:
			this.routines = generateAdvancedRoutines(level);
			break;
		default:
			break;
		}
	}

	private WorkoutRoutine[] generateBeginnerRoutines(Level level) {
		WorkoutRoutine[] routines = new WorkoutRoutine[2];
		WorkoutRoutine tabata = new WorkoutRoutine(WorkoutRoutine.Type.TABATA, level);
		tabata.generateTabata();

		WorkoutRoutine pyramid = new WorkoutRoutine(WorkoutRoutine.Type.PYRAMID, level);
		pyramid.generatePyramid();

		routines[0] = pyramid;
		routines[1] = tabata;
		return routines;
	}

	private WorkoutRoutine[] generateIntermediateRoutines(Level level) {
		WorkoutRoutine[] routines = new WorkoutRoutine[3];
		WorkoutRoutine tabata = new WorkoutRoutine(WorkoutRoutine.Type.TABATA, level);
		tabata.generateTabata();

		WorkoutRoutine pyramid = new WorkoutRoutine(WorkoutRoutine.Type.PYRAMID, level);
		pyramid.generatePyramid();

		WorkoutRoutine killer = new WorkoutRoutine(WorkoutRoutine.Type.KILLER, level);
		killer.generateKiller(this.position);

		routines[0] = killer;
		routines[1] = pyramid;
		routines[2] = tabata;
		return routines;
	}

	private WorkoutRoutine[] generateAdvancedRoutines(Level level) {
		WorkoutRoutine[] routines = new WorkoutRoutine[3];
		WorkoutRoutine tabata = new WorkoutRoutine(WorkoutRoutine.Type.TABATA, level);
		tabata.generateTabata();

		WorkoutRoutine pyramid = new WorkoutRoutine(WorkoutRoutine.Type.PYRAMID, level);
		pyramid.generatePyramid();

		WorkoutRoutine killer = new WorkoutRoutine(WorkoutRoutine.Type.KILLER, level);
		killer.generateKiller(this.position);

		routines[0] = killer;
		routines[1] = pyramid;
		routines[2] = tabata;
		return routines;
	}

	public String printEntireWorkout() {
		String workout = "";
		workout = "Start with: " + this.strength.getName() + " 4 repetition, max weight FOR 5 SETS\n ";
		workout += "~!REST FOR 2 MIN!~\n\n";
		for (WorkoutRoutine wr : routines) {
			workout += wr.returnEntireRoutine();
			workout += "~!REST FOR 3 MIN!~\n\n";
		}

		return workout;
	}

	public String toString() {
		return "Day: " + this.day + " start with: " + this.strength.getName() + " and then tabata, pyramid,killer\n";
	}

	public DayOfWeek getDay() {
		return this.day;
	}
}
