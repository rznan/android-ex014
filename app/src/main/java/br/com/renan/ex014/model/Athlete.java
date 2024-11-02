package br.com.renan.ex014.model;

import androidx.annotation.NonNull;

/**
 *@author: renan santos carvalho
 */
public abstract class Athlete {

    private final int id;
    private String name;
    private String birthDate;
    private String neighborhood;
    private AthleteType athleteType;

    private static int counter = 0;

    public Athlete(String name, String birthDate, String neighborhood, AthleteType athleteType) {
        this.id = counter++;
        this.name = name;
        this.birthDate = birthDate;
        this.neighborhood = neighborhood;
        this.athleteType = athleteType;
    }

    // Método abstrato para obter detalhes específicos do atleta
    public abstract String getDetails();


    @NonNull
    @Override
    public String toString() {
        return "Id: " + id + ", Tipo: " + athleteType + ", Nome: " + name + ", Nascimento: " + birthDate + ", Bairro: " + neighborhood + ", " + getDetails();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public AthleteType getAthleteType() {
        return athleteType;
    }

    public void setAthleteType(AthleteType athleteType) {
        this.athleteType = athleteType;
    }
}



