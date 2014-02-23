package io.github.axxiss.places.enums;

/**
 * @author Alexis Mas <alexis @ holla.com>
 */
public enum RankBy {
    PROMINENCE("prominence"),
    DISTANCE("distance");

    private String mValue;

    RankBy(String value) {
        mValue = value;
    }

    public String getvalue() {
        return mValue;
    }
}
