package br.com.renan.ex014.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.renan.ex014.controller.interfaces.IOperations;
import br.com.renan.ex014.model.Athlete;

/**
 *@author: renan santos carvalho
 */
public abstract class AthleteOperations<T extends Athlete> implements IOperations<T> {

    protected final List<T> list;

    public AthleteOperations() {
        super();
        this.list = new ArrayList<>();
    }

    @Override
    public void register(T t) {
        list.add(t);
    }

    @Override
    public T get(int id) {
        for(T a : this.list) {
            if(a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    @Override
    public List<T> list() {
        return this.list;
    }
}
