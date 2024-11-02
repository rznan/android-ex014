package br.com.renan.ex014.controller.interfaces;

import java.util.List;

/**
 *@author: renan santos carvalho
 */
public interface IOperations<T> {
    public void register(T t);
    public T get(int id);
    public List<T> list();
}
