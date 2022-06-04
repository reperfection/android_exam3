package net.skhu;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ActivityResultLauncher<Intent> activityResultLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityResultLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK) {
                            Intent intent = result.getData();
                            Test1 test = (Test1)intent.getSerializableExtra("NOW");
                            String s = String.format(
                                    "<p>%s</p>",
                                    test.getDateFormatted());
                            TextView textView = findViewById(R.id.textView1);
                            textView.setText(Html.fromHtml(s));
                        }
                    }
                }
        );
    }

    public void test1_clicked(View view) {
        Intent intent = new Intent(this, Test1Activity.class);
        activityResultLauncher.launch(intent);
    }

    public void test2_clicked(View view) {
        Intent intent = new Intent(this, Test2Activity.class);
        startActivity(intent);
    }

}
