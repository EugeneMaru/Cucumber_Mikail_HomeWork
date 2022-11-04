package com.mikail_homeWork.step_def;

import com.mikail_homeWork.utilities.Driver;
import org.junit.After;

public class Hooks {

    @After
    public void tearDown() {

        Driver.closeDriver();
    }
}
