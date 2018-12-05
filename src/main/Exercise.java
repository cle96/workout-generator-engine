package main;

import main.WorkoutRoutine.Type;

public class Exercise {
	public enum Classification {
		STRENGTH, INTERVAL, ISOLATE
	};

	public enum Muscle {
		TRAPS, UPPER_BACK, BACK, LOWER_BACK, UPPER_SHOULDER, SHOULDER, LOWER_SHOULDER, UPPER_CHEST, CHEST, LOWER_CHEST, BICEPS, TRICEPS, FOREARM, UPPER_ABS, ABS, LOWER_ABS, CORE, LEGS, QUADS, HAMSTRINGS, CALVES
	};

	private boolean fullBody;
	private String name;
	private Classification classification;
	private Muscle mainTarget;
	private Muscle secondaryTarget;
	private Muscle[] otherTargets;
	private MaxForType max;

	public Exercise(boolean fullBody, String name, Classification classification, Muscle mainTarget,
			Muscle secondaryTarget, Muscle[] otherTargets) {
		this.fullBody = fullBody;
		this.name = name;
		this.classification = classification;
		this.mainTarget = mainTarget;
		this.secondaryTarget = secondaryTarget;
		this.otherTargets = otherTargets;
	}

	public boolean isFullBody() {
		return fullBody;
	}

	public void setFullBody(boolean fullBody) {
		this.fullBody = fullBody;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public Muscle getMainTarget() {
		return mainTarget;
	}

	public void setMainTarget(Muscle mainTarget) {
		this.mainTarget = mainTarget;
	}

	public Muscle getSecondaryTarget() {
		return secondaryTarget;
	}

	public void setSecondaryTarget(Muscle secondaryTarget) {
		this.secondaryTarget = secondaryTarget;
	}

	public Muscle[] getOtherTargets() {
		return otherTargets;
	}

	public void setOtherTargets(Muscle[] otherTargets) {
		this.otherTargets = otherTargets;
	}
	
	public int getLimit(Type type){
		int limit = 0;
		if(max != null){
			limit = max.limits.get(type);
		}
		return limit;
	}

	public MaxForType getMax() {
		return max;
	}

	public Exercise setMax(MaxForType max) {
		this.max = max;
		return this;
	}

	public String toString() {
		return this.name + " is an exercise for working out mainly: " + this.getMainTarget()
				+ " whith a classification of: " + this.getClassification();
	}

	public String toJSON() {
		return "";
	}
}
