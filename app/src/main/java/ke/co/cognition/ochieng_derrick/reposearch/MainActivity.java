package ke.co.cognition.ochieng_derrick.reposearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuItemThatWasSelected = item.getItemId();

        if (menuItemThatWasSelected == R.id.action_search){
            Toast.makeText(MainActivity.this, "Search was Clicked", Toast.LENGTH_SHORT).show();;
        }
        return super.onOptionsItemSelected(item);
    }
}
