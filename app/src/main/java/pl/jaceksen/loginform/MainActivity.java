package pl.jaceksen.loginform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final String UserName = "admin";
    public final String Password = "admin";

    EditText etUserNAme;
    EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize user name instance with real input in xml
        etUserNAme=(EditText)findViewById(R.id.etUserName);
        etPassword=(EditText)findViewById(R.id.etPassword);
    }

    public void buLogin(View view) {
        if(UserName.equals(etUserNAme.getText().toString()) && Password.equals(etPassword.getText().toString())){
            Toast.makeText(getApplicationContext(),"Data is Saved",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
            intent.putExtra("key","123");
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"UserName or Password was incorrect", Toast.LENGTH_LONG).show();
        }
    }
}
