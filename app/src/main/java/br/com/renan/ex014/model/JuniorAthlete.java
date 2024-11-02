package br.com.renan.ex014.model;

/**
 *@author: renan santos carvalho
 */
public class JuniorAthlete extends Athlete {
    private int yearsOfPractice;

    public JuniorAthlete(String name, String birthDate, String neighborhood, int yearsOfPractice) {
        super(name, birthDate, neighborhood, AthleteType.JUNIOR);
        this.yearsOfPractice = yearsOfPractice;
    }

    @Override
    public String getDetails() {
        return "Anos de prática: " + yearsOfPractice;
    }

    public int getYearsOfPractice() {
        return yearsOfPractice;
    }

    public void setYearsOfPractice(int yearsOfPractice) {
        this.yearsOfPractice = yearsOfPractice;
    }
}
