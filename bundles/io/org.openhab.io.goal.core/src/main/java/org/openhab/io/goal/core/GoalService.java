package org.openhab.io.goal.core;

import java.util.List;

public interface GoalService {

    // TODO all service methods which are used in rest resource are defined here

    List<Goal> getGoals();

    List<Quality> getQualities();

}
