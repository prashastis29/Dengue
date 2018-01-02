package newmap.mapfeatures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Homepage extends AppCompatActivity {
Button see_map,about_dengue,report;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        Button see_map=(Button) findViewById(R.id.see_map);
        Button about_dengue=(Button) findViewById(R.id.about_dengue);

    }
}
