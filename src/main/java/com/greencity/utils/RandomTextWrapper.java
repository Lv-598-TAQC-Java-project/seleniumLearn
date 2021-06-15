package com.greencity.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomTextWrapper {

    public static String getRandomAlphabeticText(int count)
    {
        return RandomStringUtils.randomAlphabetic(count);
    }

    public static String getRandomNumericText(int count)
    {
        return RandomStringUtils.randomNumeric(count);
    }


}
