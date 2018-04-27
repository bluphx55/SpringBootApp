package com.boot;

import com.boot.controller.HomeController;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class AppTest
{
    @Test
    public void testApp() {
        HomeController hc = new HomeController();
        String result = hc.home();
        assertThat(result , is(equalTo("Das Boot, reporting for duty!")));
    }
}
