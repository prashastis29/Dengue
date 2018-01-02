package newmap.mapfeatures;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class signup extends AppCompatActivity {
EditText first_name,last_name,email_signup,phn_number,age,signup_password,signup_confirmPassword;
Button gender_male,gender_female,gender_other,btn_signup;
TextView signup_comment;
String gender="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        first_name=(EditText) findViewById(R.id.first_name);
        last_name=(EditText) findViewById(R.id.last_name);
        email_signup=(EditText) findViewById(R.id.email_signup);
        phn_number=(EditText) findViewById(R.id.phn_number);
        age=(EditText) findViewById(R.id.age);
        signup_password=(EditText) findViewById(R.id.signup_password);
        signup_confirmPassword=(EditText) findViewById(R.id.signup_confirmPassword);

        gender_male=(Button) findViewById(R.id.gender_male);
        gender_female=(Button) findViewById(R.id.gender_female);
        gender_other=(Button) findViewById(R.id.gender_other);
        btn_signup=(Button) findViewById(R.id.btn_signup);

        signup_comment=(TextView) findViewById(R.id.signup_comment);

        gender_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender_male.setBackgroundColor(Color.DKGRAY);
                gender_female.setBackgroundColor(Color.GRAY);
                gender_other.setBackgroundColor(Color.GRAY);
                gender= gender_male.getText().toString();
            }
        });
        gender_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender_male.setBackgroundColor(Color.GRAY);
                gender_female.setBackgroundColor(Color.DKGRAY);
                gender_other.setBackgroundColor(Color.GRAY);
                gender= gender_female.getText().toString();
            }
        });
        gender_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gender_male.setBackgroundColor(Color.GRAY);
                gender_female.setBackgroundColor(Color.GRAY);
                gender_other.setBackgroundColor(Color.DKGRAY);
                gender= gender_other.getText().toString();
            }
        });
        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String firstName, lastName, emailSignup, ageSignup, mobileSignup, pass, confirmPass;
                    int ageSignup2;
                    Long mobileSignup2;
                    firstName = first_name.getText().toString().trim();
                    lastName = last_name.getText().toString().trim();
                    emailSignup = email_signup.getText().toString().trim();
                    ageSignup = age.getText().toString().trim();
                    mobileSignup = phn_number.getText().toString().trim();
                    pass = signup_password.getText().toString();
                    confirmPass = signup_confirmPassword.getText().toString();


                    if (firstName.equals("") || lastName.equals("") || emailSignup.equals("") || ageSignup.equals("")|| mobileSignup.equals("") || gender.equals(""))
                        signup_comment.setText("Please fill all the fields");
                    else if (!pass.equals(confirmPass))
                        signup_comment.setText("Passwords did not match");
                    else {
                        ageSignup2 = Integer.parseInt(ageSignup);
                        mobileSignup2 = Long.parseLong(mobileSignup);
                        Intent inent3 = new Intent(signup.this, newmap.mapfeatures.Homepage.class);
                        startActivity(inent3);
                    }
                } catch (Exception e)
                {
                    Log.d("EXCEPTION",""+e);
                }
            }
        });
    }
}
