package main;

import java.util.HashMap;
import java.util.Map;

public class MaxForType {
	Map<WorkoutRoutine.Type, Integer> limits = new HashMap<>();

	public Map<WorkoutRoutine.Type, Integer> getLimits() {
		return limits;
	}

	public void setLimits(Map<WorkoutRoutine.Type, Integer> limits) {
		this.limits = limits;
	}
	
	public void addLimit(WorkoutRoutine.Type type, int kg){
		this.limits.put(type, kg);
	}
}
