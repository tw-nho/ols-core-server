package com.thoughtworks.nho.ci.example.services;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MessageServiceTests {
    private MessageService service;

    @Before
    public void setUp() {
        service = new MessageService();
    }

    @Test
    public void testIfGreetingMessageCorrect() {
        Assert.assertEquals("欢迎加入TW!!", service.getGreetingMessage());
    }
}
