package in.androidmate.anujgupta.espresso_sample_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button bt1;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1 =  findViewById(R.id.bt1);
        tv1 =  findViewById(R.id.tv1);
        bt1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        tv1.setText("Hello World");
    }
}
