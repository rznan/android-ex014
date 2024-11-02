package br.com.renan.ex014;

import androidx.annotation.NonNull;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import br.com.renan.ex014.controller.SeniorAthleteOperations;
import br.com.renan.ex014.controller.interfaces.IOperations;
import br.com.renan.ex014.model.SeniorAthlete;

/**
 * @author: renan santos carvalho
 */
public class SeniorAthleteFragment extends BaseAthleteFragment<SeniorAthlete> {


    private EditText etSName;
    private EditText etSBirthDate;
    private EditText etSNeighborhood;
    private TextView tvSResult;
    private RadioButton rbSYes;
    private RadioButton rbSNo;

    public SeniorAthleteFragment() {
        super();
    }

    @Override
    void findViews() {
        etSName = super.view.findViewById(R.id.etSName);
        etSBirthDate = super.view.findViewById(R.id.etSBirthDate);
        etSNeighborhood = super.view.findViewById(R.id.etSNeighborhood);
        tvSResult = super.view.findViewById(R.id.tvSResult);
        rbSYes = super.view.findViewById(R.id.rbSYes);
        rbSNo = super.view.findViewById(R.id.rbSNo);

        Button btnSSave = view.findViewById(R.id.btnSSave);
        btnSSave.setOnClickListener(e -> super.register());
        rbSNo.setChecked(true);
    }

    @Override
    void clearEditTexts() {
        this.etSName.setText("");
        this.etSBirthDate.setText("");
        this.etSNeighborhood.setText("");
    }

    @Override
    TextView getResultTextView() {
        return this.tvSResult;
    }

    @Override
    IOperations<SeniorAthlete> getController() {
        return new SeniorAthleteOperations();
    }

    @NonNull
    @Override
    SeniorAthlete getAthlete() {
        String name = this.etSName.getText().toString();
        String birth = this.etSBirthDate.getText().toString();
        String neighborhood = this.etSNeighborhood.getText().toString();
        boolean hasHeartProblems = rbSYes.isChecked();

        return new SeniorAthlete(name, birth, neighborhood, hasHeartProblems);
    }

    @Override
    int getFragmentLayout() {
        return R.layout.fragment_senior_athlete;
    }
}