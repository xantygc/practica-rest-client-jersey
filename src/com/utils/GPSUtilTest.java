package com.utils;

import org.junit.Test;

import static org.junit.Assert.*;

public class GPSUtilTest
{

    GPSUtil gpsUtil = new GPSUtil();

    @Test
    public void distance ()
    {
        double result = gpsUtil.distance(40.418407,40.418407, -3.712354, -3.712354);
        assertTrue(result == 0);
    }
}