package com.raginggeek.examples.singleton;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeamCaptainTest {

    @Test
    public void testSingleton() {
        TeamCaptain teamCaptain1 = TeamCaptain.getCaptain();
        TeamCaptain teamCaptain2 = TeamCaptain.getCaptain();
        assertEquals(teamCaptain1, teamCaptain2);
    }
}
