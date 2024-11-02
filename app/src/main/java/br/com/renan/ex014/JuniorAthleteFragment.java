package br.com.renan.ex014;

import androidx.annotation.NonNull;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import br.com.renan.ex014.controller.JuniorAthleteOperations;
import br.com.renan.ex014.controller.SafeParser;
import br.com.renan.ex014.controller.interfaces.IOperations;
import br.com.renan.ex014.model.JuniorAthlete;

/**
 * @author: renan santos carvalho
 */
public class JuniorAthleteFragment extends BaseAthleteFragment<JuniorAthlete> {


    private EditText etJName;
    private EditText etJBirthDate;
    private EditText etJNeighborhood;
    private EditText etJYearOfPractice;
    private TextView tvJResult;

    public JuniorAthleteFragment() {
        super();
    }

    @Override
    void findViews() {
        tvJResult = super.view.findViewById(R.id.tvJResult);
        etJYearOfPractice = super.view.findViewById(R.id.etJYearOfPractice);
        etJNeighborhood = super.view.findViewById(R.id.etJNeighborhood);
        etJBirthDate = super.view.findViewById(R.id.etJBirthDate);
        etJName = super.view.findViewById(R.id.etJName);

        Button btnJSave = super.view.findViewById(R.id.btnJSave);
        btnJSave.setOnClickListener(e -> super.register());
    }

    @Override
    void clearEditTexts() {
        this.etJYearOfPractice.setText("");
        this.etJNeighborhood.setText("");
        this.etJBirthDate.setText("");
        this.etJName.setText("");
    }

    @Override
    TextView getResultTextView() {
        return this.tvJResult;
    }

    @Override
    IOperations<JuniorAthlete> getController() {
        return new JuniorAthleteOperations();
    }

    @NonNull
    @Override
    JuniorAthlete getAthlete() {
        String neighborhood = this.etJNeighborhood.getText().toString();
        String birth = this.etJBirthDate.getText().toString();
        String name = this.etJName.getText().toString();
        int yop = SafeParser.safeParseInt(this.etJYearOfPractice.getText().toString(), 0);

        return new JuniorAthlete(name, birth, neighborhood, yop);
    }

    @Override
    int getFragmentLayout() {
        return R.layout.fragment_junior_athlete;
    }
}
