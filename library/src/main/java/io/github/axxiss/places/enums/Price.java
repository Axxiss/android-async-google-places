package io.github.axxiss.places.enums;

/**
 * Created by alexis on 9/14/13.
 */
public enum Price {
    FREE(0),
    INEXPENSIVE(1),
    MODERATE(2),
    EXPENSIVE(3),
    VERY_EXPENSIVE(4);

    private int mValue;

    private Price(int value) {
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }
}
