package net.skhu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Date;

public class Test1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        Test1 test = new Test1(new Date());
        Intent intent = new Intent();
        intent.putExtra("NOW", test);
        setResult(RESULT_OK, intent);
        finish();
    }
}

