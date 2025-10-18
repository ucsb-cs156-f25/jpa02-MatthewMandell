package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    

    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }
    @Test
    public void equalsWorks1() {
        assertEquals(true, team.equals(team));
    }
    @Test
    public void equalsWorks2() {
        String str = "Hello";
        assertEquals(false, team.equals(str));
    }
    @Test
    public void equalsWorks31() {
        Team team2;
        team2 = new Team("test-team");
        assertEquals(true, team.equals(team2));
    }
    @Test
    public void equalsWorks32() {
        Team team3;
        team3 = new Team("test-tea");
        assertEquals(false, team.equals(team3));
    }
    @Test
    public void equalsWorks33() {
        Team team4;
        team4 = new Team("test-team");
        team4.addMember("mem");
        assertEquals(false, team.equals(team4));
    }
    @Test
    public void equalsWorks34() {
        Team team4;
        team4 = new Team("test-tem");
        team4.addMember("mem");
        assertEquals(false, team.equals(team4));
    }
    @Test
    public void hashWorks() {
        Team t = new Team("a");
        int result = t.hashCode();
        int expectedResult = 97;
        assertEquals(expectedResult, result);
    }
    
    





   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
