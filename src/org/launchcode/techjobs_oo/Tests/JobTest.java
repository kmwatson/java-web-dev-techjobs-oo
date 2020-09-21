package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job firstTestJob;
    Job secondTestJob;
    Job constructorTestJob;
    Job firstJobToTestEquality;
    Job secondJobToTestEquality;

    @Before
    public void createTestJobs(){
        firstTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        secondTestJob = new Job();
        //jobToTestEquality =
        constructorTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        //firstJobToTestEquality = new Job("");
    }

    @Test
    public void testSettingJobId() {
        assertEquals(firstTestJob.getId(), 1);
        assertEquals(secondTestJob.getId(), 2);
        assertNotEquals(firstTestJob.getId(), secondTestJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals(constructorTestJob.getName(), "Product tester");
        assertEquals(constructorTestJob.getEmployer().getValue(), "ACME");
        assertEquals(constructorTestJob.getLocation().getValue(), "Desert");
        assertEquals(constructorTestJob.getPositionType().getValue(), "Quality Control");
        assertEquals(constructorTestJob.getCoreCompetency().getValue(), "Persistence");
        //assertTrue(constructorTestJob instanceof Job);
    }

    @Test
    public void testJobsForEquality() {

        firstJobToTestEquality = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Contorl"), new CoreCompetency("Persistence"));
        secondJobToTestEquality = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(firstJobToTestEquality.equals(secondJobToTestEquality));

    }

}
