package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.Job;

import static org.junit.Assert.*;

public class JobTest {

    @Before
    public Job firstTestJob;
    public Job secondTestJob;

    @Test
    public void testSettingJobId() {
        firstTestJob = new Job();
        secondTestJob = new Job();
        assertNotEquals(firstTestJob.getId(), secondTestJob.getId());
    }


}
