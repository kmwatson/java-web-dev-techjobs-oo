package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job firstTestJob;
    Job secondTestJob;
    @Before
    public void createTestJobs(){
        //jobToTestEquality =
        //constructorTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        firstTestJob = new Job();
        secondTestJob = new Job();
        assertEquals(10, firstTestJob.getId());
        assertEquals(11, secondTestJob.getId());
        assertNotEquals(firstTestJob.getId(), secondTestJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        //Job constructorTestJob;
        //constructorTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        firstTestJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", firstTestJob.getName());
        assertEquals("ACME", firstTestJob.getEmployer().getValue());
        assertEquals("Desert", firstTestJob.getLocation().getValue());
        assertEquals("Quality Control", firstTestJob.getPositionType().getValue());
        assertEquals("Persistence", firstTestJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
//        Job firstJobToTestEquality;
//        Job secondJobToTestEquality;
        firstTestJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Contorl"), new CoreCompetency("Persistence"));
        secondTestJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(firstTestJob.equals(secondTestJob));

    }

    @Test
    public void testToStringIncludesBlankLines() {
        //Job jobToTestToStringMethod;
        firstTestJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(firstTestJob.toString().contains("\n"));
    }

    @Test
    public void testToStringIncludesLabelsForEachField() {
        //Job jobToTestToStringMethod;
        firstTestJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(firstTestJob.toString().contains("ID"));
        assertTrue(firstTestJob.toString().contains("Employer"));
        assertTrue(firstTestJob.toString().contains("Location"));
        assertTrue(firstTestJob.toString().contains("Position Type"));
        assertTrue(firstTestJob.toString().contains("Core Competency"));
    }

    @Test
    public void testToStringEmptyFieldName() {
        firstTestJob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("\n ID: 5\n Name: Data not available\n Employer: ACME\n Location: Desert\n Position Type: Quality Control\n Core Competency: Persistence\n", firstTestJob.toString());
    }

    @Test
    public void testToStringEmptyFieldEmployer() {
        firstTestJob = new Job("Product Tester", new Employer(""), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("\n ID: 9\n Name: Product Tester\n Employer: Data not available\n Location: Desert\n Position Type: Quality Control\n Core Competency: Persistence\n", firstTestJob.toString());
    }

    @Test
    public void testToStringEmptyFieldLocation() {
        firstTestJob = new Job("Product Tester", new Employer("ACME"), new Location(""), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("\n ID: 12\n Name: Product Tester\n Employer: ACME\n Location: Data not available\n Position Type: Quality Control\n Core Competency: Persistence\n", firstTestJob.toString());
    }

    @Test
    public void testToStringEmptyFieldPositionType() {
        firstTestJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals("\n ID: 6\n Name: Product Tester\n Employer: ACME\n Location: Desert\n Position Type: Data not available\n Core Competency: Persistence\n", firstTestJob.toString());
    }

    @Test
    public void testToStringEmptyFieldCoreCompetency() {
        firstTestJob = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency(""));
        assertEquals("\n ID: 1\n Name: Product Tester\n Employer: ACME\n Location: Desert\n Position Type: Quality Control\n Core Competency: Data not available\n", firstTestJob.toString());
    }

//
//    @Test
//    public void testToStringJobDoesNotExist() {
//
//    }

}
