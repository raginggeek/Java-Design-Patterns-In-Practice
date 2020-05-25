package com.raginggeek.examples.singleton;

public class TeamCaptain {
    private static TeamCaptain captain;

    //singleton behavior
    private TeamCaptain() {}

    //helper inner
    private static class SingletonHelper {
        private static final TeamCaptain captain = new TeamCaptain();
    }
    public static TeamCaptain getCaptain() {
        return SingletonHelper.captain;
    }
}
