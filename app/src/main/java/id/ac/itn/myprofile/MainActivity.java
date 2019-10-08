package id.ac.itn.myprofile;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btn,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btnLayout);
        btn.setOnClickListener(this);
        btn2 = findViewById(R.id.btnLayout2);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnLayout){
            Log.d("MainActivity", "onClick: gak tampil bosss");
            Intent intent = new Intent(MainActivity.this,LayoutGroupActivity.class);
            startActivity(intent);
        }
        if(view.getId()==R.id.btnLayout2){
            Log.d("MainActivity", "onClick: gak tampil bosss");
            Intent intent = new Intent(MainActivity.this,LayoutGroup2Activity.class);
            startActivity(intent);
        }
    }
}
