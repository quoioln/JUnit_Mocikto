package com.ntts.struts2.mockprivate;

import java.util.Random;

public class MockPrivateAction {

    public void meaningfulPublicApi() {
        if (doTheGamble("Whatever", 1 << 3)) {
            throw new RuntimeException("boom");
        }
    }

    private boolean doTheGamble(String whatever, int binary) {
        Random random = new Random(System.nanoTime());
        boolean gamble = random.nextBoolean();
        return gamble;
    }
}
