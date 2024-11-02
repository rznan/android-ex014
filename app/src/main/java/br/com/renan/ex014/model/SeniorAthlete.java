package br.com.renan.ex014.model;

/**
 *@author: renan santos carvalho
 */
public class SeniorAthlete extends Athlete {
    private boolean hasHeartProblems;

    public SeniorAthlete(String name, String birthDate, String neighborhood, boolean hasHeartProblems) {
        super(name, birthDate, neighborhood, AthleteType.SENIOR);
        this.hasHeartProblems = hasHeartProblems;
    }

    @Override
    public String getDetails() {
        return "Problemas cardiácos: " + (hasHeartProblems ? "Sim" : "Não");
    }

    public boolean HasHeartProblems() {
        return hasHeartProblems;
    }

    public void setHasHeartProblems(boolean hasHeartProblems) {
        this.hasHeartProblems = hasHeartProblems;
    }
}
