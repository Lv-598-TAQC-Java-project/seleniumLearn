package com.greencity.locators;

public enum Tag {

    NEWS("News"),
    ADS("Ads"),
    EVENTS("Events"),
    INITIATIVES("Initiatives"),
    EDUCATION("Education");

    private String nameOfTag;

    Tag(String nameOfTag) {
        this.nameOfTag = nameOfTag;
    }

    @Override
    public String toString() {
        return nameOfTag;
    }
}
