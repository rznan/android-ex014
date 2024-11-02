package br.com.renan.ex014.model;

/**
 *@author: renan santos carvalho
 */
public enum AthleteType {
    JUNIOR(0), SENIOR(1), GENERAL(3);

    private final int value;

    AthleteType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
