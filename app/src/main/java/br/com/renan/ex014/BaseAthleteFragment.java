package br.com.renan.ex014;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.List;

import br.com.renan.ex014.controller.interfaces.IOperations;
import br.com.renan.ex014.model.Athlete;

/**
 * @author: renan santos carvalho
 */
public abstract class BaseAthleteFragment<T extends Athlete> extends Fragment {

    View view;

    abstract void findViews();
    abstract void clearEditTexts();

    // campos
    abstract TextView getResultTextView();
    abstract IOperations<T> getController();
    abstract @NonNull T getAthlete();
    abstract int getFragmentLayout();


    public BaseAthleteFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this.view = inflater.inflate(getFragmentLayout(), container, false);
        findViews();
        return view;
    }

    void register() {
        T a = getAthlete();
        IOperations<T> op = getController();
        op.register(a);
        clearEditTexts();
        Toast.makeText(this.view.getContext(), a.toString(), Toast.LENGTH_LONG).show();
        showAthletes(op);
    }

    void showAthletes(IOperations<T> op) {
        List<T> list = op.list();
        StringBuilder sb = new StringBuilder();
        for (T j : list) {
            sb.append(j.toString()).append("\n");
        }
        getResultTextView().setText(sb.toString());
    }
}
