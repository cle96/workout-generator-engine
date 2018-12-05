package main;

import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import main.Exercise.Classification;
import main.Exercise.Muscle;
import main.WeeklyWorkout.Level;
import main.WorkoutRoutine.Type;

public class ExerciseStore {
	private static List<Exercise> exercises;

	public ExerciseStore() {
		this.exercises = new ArrayList<Exercise>();
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public void initStore() {
		MaxForType deadlifts = new MaxForType();
		deadlifts.addLimit(Type.STRENGTH, 160);
		deadlifts.addLimit(Type.KILLER, 120);
		deadlifts.addLimit(Type.PYRAMID, 100);
		deadlifts.addLimit(Type.TABATA, 80);
		
		MaxForType chestBarPush = new MaxForType();
		chestBarPush.addLimit(Type.STRENGTH, 100);
		chestBarPush.addLimit(Type.KILLER, 85);
		chestBarPush.addLimit(Type.PYRAMID, 80);
		chestBarPush.addLimit(Type.TABATA, 70);
		
		MaxForType pullUps = new MaxForType();
		pullUps.addLimit(Type.STRENGTH, 20);
		pullUps.addLimit(Type.KILLER, 0);
		pullUps.addLimit(Type.PYRAMID, 0);
		pullUps.addLimit(Type.TABATA, 0);
		
		MaxForType squats = new MaxForType();
		squats.addLimit(Type.STRENGTH, 120);
		squats.addLimit(Type.KILLER, 100);
		squats.addLimit(Type.PYRAMID, 80);
		squats.addLimit(Type.TABATA, 70);
		
		MaxForType sumoDeadlifts = new MaxForType();
		sumoDeadlifts.addLimit(Type.STRENGTH, 130);
		sumoDeadlifts.addLimit(Type.KILLER, 100);
		sumoDeadlifts.addLimit(Type.PYRAMID, 80);
		sumoDeadlifts.addLimit(Type.TABATA, 70);
		
		MaxForType clean = new MaxForType();
		clean.addLimit(Type.STRENGTH, 60);
		clean.addLimit(Type.KILLER, 50);
		clean.addLimit(Type.PYRAMID, 40);
		clean.addLimit(Type.TABATA, 30);
		
		MaxForType cleanAndJerk = new MaxForType();
		cleanAndJerk.addLimit(Type.STRENGTH, 65);
		cleanAndJerk.addLimit(Type.KILLER, 50);
		cleanAndJerk.addLimit(Type.PYRAMID, 40);
		cleanAndJerk.addLimit(Type.TABATA, 35);
		
		MaxForType powerClean = new MaxForType();
		powerClean.addLimit(Type.STRENGTH, 65);
		powerClean.addLimit(Type.KILLER, 55);
		powerClean.addLimit(Type.PYRAMID, 45);
		powerClean.addLimit(Type.TABATA, 40);
		
		MaxForType overheadSquat = new MaxForType();
		overheadSquat.addLimit(Type.STRENGTH, 50);
		overheadSquat.addLimit(Type.KILLER, 40);
		overheadSquat.addLimit(Type.PYRAMID, 35);
		overheadSquat.addLimit(Type.TABATA, 30);
		
		MaxForType pushPress = new MaxForType();
		pushPress.addLimit(Type.STRENGTH, 70);
		pushPress.addLimit(Type.KILLER, 60);
		pushPress.addLimit(Type.PYRAMID, 50);
		pushPress.addLimit(Type.TABATA, 40);
		
		MaxForType snatchDumbell = new MaxForType();
		snatchDumbell.addLimit(Type.STRENGTH, 32);
		snatchDumbell.addLimit(Type.KILLER, 27);
		snatchDumbell.addLimit(Type.PYRAMID, 25);
		snatchDumbell.addLimit(Type.TABATA, 22);
		
		MaxForType trapsLarge = new MaxForType();
		trapsLarge.addLimit(Type.STRENGTH, 60);
		trapsLarge.addLimit(Type.KILLER, 50);
		trapsLarge.addLimit(Type.PYRAMID, 40);
		trapsLarge.addLimit(Type.TABATA, 30);
		
		MaxForType wondering = new MaxForType();
		wondering.addLimit(Type.STRENGTH, 50);
		wondering.addLimit(Type.KILLER, 35);
		wondering.addLimit(Type.PYRAMID, 30);
		wondering.addLimit(Type.TABATA, 20);
		
		MaxForType lateralLifts = new MaxForType();
		lateralLifts.addLimit(Type.STRENGTH, 15);
		lateralLifts.addLimit(Type.KILLER, 12);
		lateralLifts.addLimit(Type.PYRAMID, 10);
		lateralLifts.addLimit(Type.TABATA, 7);
		
		MaxForType liftDisk = new MaxForType();
		liftDisk.addLimit(Type.STRENGTH, 25);
		liftDisk.addLimit(Type.KILLER, 20);
		liftDisk.addLimit(Type.PYRAMID, 20);
		liftDisk.addLimit(Type.TABATA, 20);
		
		MaxForType chinUps = new MaxForType();
		chinUps.addLimit(Type.STRENGTH, 20);
		chinUps.addLimit(Type.KILLER, 0);
		chinUps.addLimit(Type.PYRAMID,0);
		chinUps.addLimit(Type.TABATA, 0);
		
		MaxForType lateralRowing = new MaxForType();
		lateralRowing.addLimit(Type.STRENGTH, 35);
		lateralRowing.addLimit(Type.KILLER, 30);
		lateralRowing.addLimit(Type.PYRAMID, 27);
		lateralRowing.addLimit(Type.TABATA, 22);
		
		MaxForType inclineChestPush = new MaxForType();
		inclineChestPush.addLimit(Type.STRENGTH, 35);
		inclineChestPush.addLimit(Type.KILLER, 27);
		inclineChestPush.addLimit(Type.PYRAMID,25);
		inclineChestPush.addLimit(Type.TABATA, 20);
		
		MaxForType barPull = new MaxForType();
		barPull.addLimit(Type.STRENGTH, 60);
		barPull.addLimit(Type.KILLER, 50);
		barPull.addLimit(Type.PYRAMID,40);
		barPull.addLimit(Type.TABATA, 35);
		
		MaxForType dumbellBehindHead = new MaxForType();
		dumbellBehindHead.addLimit(Type.STRENGTH, 30);
		dumbellBehindHead.addLimit(Type.KILLER, 27);
		dumbellBehindHead.addLimit(Type.PYRAMID,25);
		dumbellBehindHead.addLimit(Type.TABATA, 20);
		
		MaxForType dips = new MaxForType();
		dips.addLimit(Type.STRENGTH, 0);
		dips.addLimit(Type.KILLER, 0);
		dips.addLimit(Type.PYRAMID,0);
		dips.addLimit(Type.TABATA, 0);
		
		MaxForType flies = new MaxForType();
		flies.addLimit(Type.STRENGTH, 17);
		flies.addLimit(Type.KILLER, 15);
		flies.addLimit(Type.PYRAMID,15);
		flies.addLimit(Type.TABATA, 10);
		
		MaxForType dumbellRaises = new MaxForType();
		dumbellRaises.addLimit(Type.STRENGTH, 15);
		dumbellRaises.addLimit(Type.KILLER, 12);
		dumbellRaises.addLimit(Type.PYRAMID,10);
		dumbellRaises.addLimit(Type.TABATA, 7);
		
		this.exercises.addAll(Arrays.asList(
				new Exercise(true, "Deadlifts", Classification.STRENGTH, Muscle.BACK, Muscle.LEGS, null).setMax(deadlifts),
				new Exercise(false, "Chest bar push", Classification.STRENGTH, Muscle.CHEST, Muscle.TRICEPS,
						new Muscle[] { Muscle.UPPER_SHOULDER, Muscle.LOWER_CHEST }).setMax(chestBarPush),
				new Exercise(false, "Pull-ups", Classification.STRENGTH, Muscle.BACK, Muscle.BICEPS,
						new Muscle[] { Muscle.UPPER_SHOULDER }).setMax(pullUps),
				new Exercise(true, "Squats", Classification.STRENGTH, Muscle.LEGS, Muscle.CORE, null).setMax(squats),
				new Exercise(true, "Sumo deadlifts", Classification.STRENGTH, Muscle.BACK, Muscle.LEGS, null).setMax(sumoDeadlifts),
				new Exercise(true, "Clean", Classification.STRENGTH, Muscle.SHOULDER, Muscle.TRAPS, null).setMax(clean),
				new Exercise(true, "Clean and Jerk", Classification.STRENGTH, Muscle.SHOULDER, Muscle.LEGS, null).setMax(cleanAndJerk),
				new Exercise(true, "Power Clean", Classification.STRENGTH, Muscle.LEGS, Muscle.SHOULDER, null).setMax(powerClean),
				new Exercise(true, "Overhead Squat", Classification.STRENGTH, Muscle.LEGS, Muscle.SHOULDER, null).setMax(overheadSquat),
				new Exercise(true, "Push Press", Classification.STRENGTH, Muscle.SHOULDER, Muscle.CORE, null).setMax(pushPress),
				new Exercise(true, "Snatch dumbell", Classification.STRENGTH, Muscle.SHOULDER, Muscle.LEGS, null).setMax(snatchDumbell),
				new Exercise(false, "Traps large grip", Classification.INTERVAL, Muscle.TRAPS, Muscle.CORE, null).setMax(trapsLarge),
				new Exercise(false, "Wondering with weights", Classification.INTERVAL, Muscle.TRAPS, Muscle.CORE, null).setMax(wondering),
				new Exercise(false, "Lateral shoulder lifts", Classification.ISOLATE, Muscle.TRAPS, Muscle.SHOULDER,
						null).setMax(lateralLifts),
				new Exercise(false, "Lifting disk behind head", Classification.INTERVAL, Muscle.TRAPS, Muscle.SHOULDER,
						null).setMax(liftDisk),
				new Exercise(false, "Chin-ups", Classification.STRENGTH, Muscle.BACK, Muscle.BICEPS,
						new Muscle[] { Muscle.UPPER_SHOULDER }).setMax(chinUps),
				new Exercise(false, "Lats weight pull", Classification.ISOLATE, Muscle.UPPER_BACK, Muscle.UPPER_ABS,
						null).setMax(lateralRowing),
				new Exercise(false, "Bar pull", Classification.STRENGTH, Muscle.BACK, Muscle.BICEPS, null).setMax(barPull),
				new Exercise(false, "Pulling yourself to bar", Classification.STRENGTH, Muscle.UPPER_BACK,
						Muscle.LOWER_SHOULDER, new Muscle[] { Muscle.BICEPS, Muscle.CORE }),
				new Exercise(false, "Incline chest push", Classification.ISOLATE, Muscle.CHEST, Muscle.UPPER_SHOULDER,
						new Muscle[] { Muscle.TRICEPS }).setMax(inclineChestPush),
				new Exercise(false, "Raising dumbell over head from bench", Classification.ISOLATE, Muscle.UPPER_BACK,
						Muscle.UPPER_CHEST, null).setMax(dumbellBehindHead),
				new Exercise(false, "Dips", Classification.STRENGTH, Muscle.TRICEPS, Muscle.LOWER_CHEST, null).setMax(dips),
				new Exercise(false, "Push ups", Classification.INTERVAL, Muscle.CHEST, Muscle.TRICEPS,
						new Muscle[] { Muscle.CORE }),
				new Exercise(false, "Push ups on weigths", Classification.INTERVAL, Muscle.CHEST, Muscle.UPPER_CHEST,
						null),
				new Exercise(false, "Normal flies", Classification.ISOLATE, Muscle.CHEST, null, null).setMax(flies),
				new Exercise(false, "Front dumbell raises", Classification.ISOLATE, Muscle.SHOULDER, Muscle.TRAPS,
						null).setMax(dumbellRaises),
				new Exercise(false, "Dumbell raises", Classification.STRENGTH, Muscle.SHOULDER, Muscle.TRICEPS, null),
				new Exercise(false, "Outside flies", Classification.ISOLATE, Muscle.LOWER_SHOULDER, Muscle.UPPER_BACK,
						new Muscle[] { Muscle.CORE }),
				new Exercise(false, "Biceps curls", Classification.STRENGTH, Muscle.BICEPS, Muscle.FOREARM, null),
				new Exercise(false, "Biceps hammers", Classification.ISOLATE, Muscle.BICEPS, Muscle.FOREARM, null),
				new Exercise(false, "Triceps dips on two benches", Classification.ISOLATE, Muscle.TRICEPS, null, null),
				new Exercise(false, "Dumbell pushes close grip", Classification.ISOLATE, Muscle.TRICEPS, Muscle.CHEST,
						null),
				new Exercise(false, "Incline abs", Classification.ISOLATE, Muscle.ABS, Muscle.LOWER_BACK, null),
				new Exercise(false, "Planking x30sec", Classification.STRENGTH, Muscle.ABS, Muscle.LOWER_BACK, null),
				new Exercise(false, "Abs from holding position", Classification.STRENGTH, Muscle.ABS, Muscle.UPPER_BACK,
						null),
				new Exercise(false, "Split Squat with dumbells", Classification.ISOLATE, Muscle.HAMSTRINGS,
						Muscle.QUADS, null),
				new Exercise(false, "Split Squat with disk", Classification.ISOLATE, Muscle.HAMSTRINGS, Muscle.QUADS,
						null),
				new Exercise(false, "Wide squats", Classification.ISOLATE, Muscle.LEGS, Muscle.CORE, null),
				new Exercise(false, "Calves raises", Classification.ISOLATE, Muscle.CALVES, Muscle.CORE, null)));

	}

	public void cleanExercises() {
		this.exercises = new ArrayList<>();
	}

	public static Exercise[] getStrengthExercises(int amount) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("Deadlifts", "Chest bar push", "Pull-ups", "Squats", "Sumo deadlifts"));

		if (amount == 1) {
			return (Exercise[]) exercises.stream().filter((e) -> list.get(0).equals(e.getName()))
					.toArray(Exercise[]::new);
		}

		return exercises.stream().filter((e) -> list.subList(1, amount + 1).contains(e.getName()))
				.toArray(Exercise[]::new);
	}

	public static Exercise[] getKillerExercises(int position) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("Squats", "Chest bar push", "Bar pull"));

		List<String> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList("Clean", "Incline chest push", "Lats weight pull"));

		List<String> list3 = new ArrayList<>();
		list3.addAll(Arrays.asList("Snatch dumbell", "Overhead press", "Pulling yourself to bar"));

		List<String> list4 = new ArrayList<>();
		list4.addAll(Arrays.asList("Power Clean", "Chest bar push", "Pull-ups"));

		List<String> list5 = new ArrayList<>();
		list5.addAll(Arrays.asList("Snatch", "Deadlifts", "Bar pull"));

		List<List<String>> killerExs = new ArrayList<List<String>>();
		killerExs.addAll(Arrays.asList(list, list2, list3, list4, list5));

		return exercises.stream().filter((e) -> killerExs.get(position).contains(e.getName())).toArray(Exercise[]::new);
	}

	public static Exercise[] getRandomPyramidExercises(Level level) {
		int amount = 5 + Level.valueOf(level.toString()).ordinal();
		List<Exercise> finalList = new ArrayList<>();
		List<Exercise> listWithStrength =  exercises.stream().filter((e) -> e.isFullBody()).collect(Collectors.toList());
		List<Exercise> restOfExercises =  exercises.stream().filter((e) -> !e.isFullBody()).collect(Collectors.toList());
		Collections.shuffle(listWithStrength);
		Collections.shuffle(restOfExercises);
		switch (amount) {
		case 5:
			finalList.add(listWithStrength.get(0));
			finalList.addAll(restOfExercises.subList(0, 2));
			finalList.add(listWithStrength.get(1));
		
			break;

		case 6:
			finalList.add(listWithStrength.get(0));
			finalList.add(restOfExercises.get(0));
			finalList.add(listWithStrength.get(1));
			finalList.add(restOfExercises.get(2));
			finalList.add(listWithStrength.get(2));
			break;

		case 7:
			finalList.add(listWithStrength.get(0));
			finalList.add(restOfExercises.get(0));
			finalList.add(listWithStrength.get(1));
			finalList.add(restOfExercises.get(2));
			finalList.add(listWithStrength.get(2));
			finalList.add(listWithStrength.get(3));
			break;

		default:
			break;
		}
		
		return Stream
				.concat(finalList.subList(0, amount -1).stream(),
						finalList.subList(0, amount -2).stream().sorted(Collections.reverseOrder((o1, o2) -> -1)))
				.toArray(Exercise[]::new);

	}

	public static Exercise[] getRandomTabataExercises() {
		List<Exercise> list = new ArrayList<Exercise>();
		list.addAll(exercises);
		Collections.shuffle(list);
		return list.subList(0, 10).stream().toArray(Exercise[]::new);
	}
}
