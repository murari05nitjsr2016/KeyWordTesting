package com.bridgelabz;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KeyworddTesting extends DriverScript {

    @Test
    public void validateLogin() throws Exception
    {
        ActionClass actionClass = new ActionClass();
        boolean result = actionClass.run(driver,"C:\\Users\\Murari\\IdeaProjects\\Linkdin3\\src\\test\\resources\\inputData.xlsx","Sheet1");
        Assert.assertTrue(result);
    }
}
