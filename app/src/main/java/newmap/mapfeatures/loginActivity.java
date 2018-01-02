package newmap.mapfeatures;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {

    EditText email,password;
    TextView id_comment,pass_comment;
    Button login_btn,signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id_comment= (TextView) findViewById(R.id.id_comment);
        pass_comment= (TextView) findViewById(R.id.pass_comment);

        email= (EditText) findViewById(R.id.email);
        password= (EditText) findViewById(R.id.password);

        login_btn= (Button) findViewById(R.id.login_btn);
        signup= (Button) findViewById(R.id.signup);

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1="ps@gmail.com";
                String s2="hello";
                if(email.getText().toString().trim().equals(""))
                    id_comment.setText("Please enter your email");

               else if(password.getText().toString().trim().equals(""))
                    pass_comment.setText("Please enter your password");

              else if(email.getText().toString().trim().equals(s1))
                {
                    id_comment.setText("");
                    if(password.getText().toString().trim().equals(s2))
                    {
                        Toast.makeText(loginActivity.this,"login successful",Toast.LENGTH_SHORT);


                        Intent inent=new Intent(loginActivity.this, newmap.mapfeatures.MapsActivity.class);
                        startActivity(inent);
                        id_comment.setText("");
                        pass_comment.setText("");
                        email.setText("");
                        password.setText("");
                    }
                    else
                        pass_comment.setText("Password is incorrect");
                }
                else
                    id_comment.setText("Email is incorrect");
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inent2=new Intent(loginActivity.this, newmap.mapfeatures.signup.class);
                startActivity(inent2);
                id_comment.setText("");
                pass_comment.setText("");
                email.setText("");
                password.setText("");
            }
        });
    }
}
