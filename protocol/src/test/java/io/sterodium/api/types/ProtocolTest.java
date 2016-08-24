package io.sterodium.api.types;

import org.junit.Test;

public class ProtocolTest {

    @Test
    public void testObject() throws Exception {
        new SeleniumSchema()
                .withTimestamp(123L)
                .withEvent("newSession")
                .withAttributes(new Attributes()
                        .withBody("ok")
                        .withClientIp("127.0.0.1")
                        .withRequestType("START_SESSION")
                );
    }

}
