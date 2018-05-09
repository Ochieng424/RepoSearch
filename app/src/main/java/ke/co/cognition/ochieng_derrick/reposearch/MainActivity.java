package ke.co.cognition.ochieng_derrick.reposearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etSearchBox;
    TextView tvUrlDisplay;
    TextView tvSearchResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSearchBox = findViewById(R.id.et_search_box);
        tvUrlDisplay = findViewById(R.id.tv_url_display);
        tvSearchResults = findViewById(R.id.github_search_results_json);
    }
}
