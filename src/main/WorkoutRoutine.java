package main;

import main.WeeklyWorkout.Level;

public class WorkoutRoutine {
	public enum Type {
		PYRAMID, TABATA, KILLER
	};

	private Type type;
	private Exercise[] exercises;
	private int repetitions;
	private int seconds;
	private Level level;

	public WorkoutRoutine(Type type, Level level) {
		this.type = type;
		int amountOfExercises = 0;

		if (type == Type.PYRAMID)
			amountOfExercises = 9;
		if (type == Type.KILLER)
			amountOfExercises = 3;
		if (type == Type.TABATA)
			amountOfExercises = 10;

		switch (level) {
		case BEGINNER:
			this.repetitions = 7;
			this.seconds = 30;
			break;

		case INTERMEDIATE:
			this.repetitions = 7;
			this.seconds = 30;
			break;
		case ADVANCED:
			this.repetitions = 10;
			this.seconds = 45;
			break;
		default:
			break;
		}
		this.level = level;
		this.exercises = new Exercise[amountOfExercises];
	}

	public void generateTabata() {
		this.exercises = ExerciseStore.getRandomTabataExercises();
	}

	public void generatePyramid() {
		this.exercises = ExerciseStore.getRandomPyramidExercises(this.level);
	}

	public void generateKiller(int position) {
		this.exercises = ExerciseStore.getKillerExercises(position);
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String returnEntireRoutine() {
		if (type == Type.TABATA)
			return returnTabata();
		if (type == Type.KILLER)
			return returnKiller();
		if (type == Type.PYRAMID)
			return returnPyramid();
		return "";
	}

	private String returnTabata() {
		String result = "";
		for (Exercise e : exercises) {
			result += e.getName() + " for " + this.seconds + " seconds\n";
		}
		return result;
	}

	private String returnKiller() {
		String result = "";
		for (int i = 0; i < 3; i++) {
			for (Exercise e : exercises) {
				result += e.getName() +" "+ this.repetitions + " repetition, at " + (80 - (i * 10)) + "%\n";
			}
		}
		return result;
	}

	private String returnPyramid() {
		String result = "";
		for (Exercise e : exercises) {
			result += e.getName() + " for " + this.repetitions + " repetitions\n";
		}
		return result;
	}

	public int getRepetitions() {
		return repetitions;
	}

	public void setRepetitions(int repetitions) {
		this.repetitions = repetitions;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

}
