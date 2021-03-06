package kr.hs.emirim.w2034.project10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnClose = findViewById(R.id.btn_close);
        btnClose.setOnClickListener(btnCloseListetner);
    }

    View.OnClickListener btnCloseListetner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}