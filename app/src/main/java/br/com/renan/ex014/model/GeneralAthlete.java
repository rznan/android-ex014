package br.com.renan.ex014.model;

/**
 *@author: renan santos carvalho
 */
public class GeneralAthlete extends Athlete {
    private String gym;
    private double recordInSeconds;

    public GeneralAthlete(String name, String birthDate, String neighborhood, String gym, double recordInSeconds) {
        super(name, birthDate, neighborhood, AthleteType.GENERAL);
        this.gym = gym;
        this.recordInSeconds = recordInSeconds;
    }

    @Override
    public String getDetails() {
        return "Academia: " + gym + ", Recorde (seg): " + recordInSeconds;
    }
}
