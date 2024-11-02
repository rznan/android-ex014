package br.com.renan.ex014;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import br.com.renan.ex014.controller.GeneralAthleteOperations;
import br.com.renan.ex014.controller.SafeParser;
import br.com.renan.ex014.controller.interfaces.IOperations;
import br.com.renan.ex014.model.GeneralAthlete;

/**
 * @author: renan santos carvalho
 */
public class GeneralAthleteFragment extends BaseAthleteFragment<GeneralAthlete> {

    private EditText etGName;
    private EditText etGBirthDate;
    private EditText etGNeighborhood;
    private EditText etGGym;
    private EditText etGRecord;
    private TextView tvGResult;

    public GeneralAthleteFragment() {
        super();
    }

    @Override
    void findViews() {
        etGName = super.view.findViewById(R.id.etGName);
        etGBirthDate = super.view.findViewById(R.id.etGBirthDate);
        etGNeighborhood = super.view.findViewById(R.id.etGNeighborhood);
        etGGym = super.view.findViewById(R.id.etGGym);
        etGRecord = super.view.findViewById(R.id.etGRecord);
        tvGResult = super.view.findViewById(R.id.tvGResult);

        Button btnGSave = super.view.findViewById(R.id.btnGSave);
        btnGSave.setOnClickListener(e -> super.register());
    }

    @Override
    void clearEditTexts() {
        this.etGName.setText("");
        this.etGBirthDate.setText("");
        this.etGNeighborhood.setText("");
        this.etGGym.setText("");
        this.etGRecord.setText("");
    }

    @Override
    TextView getResultTextView() {
        return this.tvGResult;
    }

    @Override
    IOperations<GeneralAthlete> getController() {
        return new GeneralAthleteOperations();
    }

    @NonNull
    @Override
    GeneralAthlete getAthlete() {
        String name = this.etGName.getText().toString();
        String birth = this.etGBirthDate.getText().toString();
        String neighborhood = this.etGNeighborhood.getText().toString();
        String gym = this.etGGym.getText().toString();
        double record = SafeParser.safeParseDouble(this.etGRecord.getText().toString(), -1);
        return new GeneralAthlete(name, birth, neighborhood, gym, record);
    }

    @Override
    int getFragmentLayout() {
        return R.layout.fragment_general_athlete;
    }
}