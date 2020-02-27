package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText nameInput;
    private TextView outputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handledExplisitIntent(View view) {
        Intent intent = new  Intent(this, ExplicitIntentActivity.class);
        startActivity(intent);
        finish();
    }

    public void handledImplicitIntent(View view) {
        Intent intent = new Intent(this, ImplicitIntentActivity.class);
        startActivity(intent);
        finish();
    }

    public void handleBundle(View view) {
        Intent intent = new Intent(this, BundleActivity.class);
        startActivity(intent);
        finish();
    }

    public void handleParcelable(View view) {
        Intent intent = new Intent(this, BundleActivity.class);
        startActivity(intent);
        finish();
    }

    public void handleExit(View view) {
        Intent intent = new Intent(this, BundleActivity.class);
        startActivity(intent);
        finish();
    }
}
