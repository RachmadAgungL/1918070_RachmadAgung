package id.ac.itn.myprofile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn, btn2,btnConstraint, btnConstraint2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnLayout);
        btn.setOnClickListener(this);
        btn2 = findViewById(R.id.btnLayout2);
        btn2.setOnClickListener(this);
        btnConstraint = findViewById(R.id.btnConstraint);
        btnConstraint.setOnClickListener(this);
        btnConstraint2 = findViewById(R.id.btnConstraint2);
        btnConstraint2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case (R.id.btnLayout):
                Intent intent = new Intent(MainActivity.this, LayoutGroupActivity.class);
                startActivity(intent);
                break;
            case (R.id.btnLayout2):
                Intent intent2 = new Intent(MainActivity.this, LayoutGroup2Activity.class);
                startActivity(intent2);
                break;
            case (R.id.btnConstraint):
                Intent intent3 = new Intent(MainActivity.this, ConstraintLayoutActivity.class);
                startActivity(intent3);
                break;
            case (R.id.btnConstraint2):
                Intent intent4 = new Intent(MainActivity.this, ConstraintLayout2Activity.class);
                startActivity(intent4);
                break;

        }
    }
}
