package com.caoyu.broadcastbestpractice;

import java.security.PublicKey;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends BaseActivity implements OnClickListener{
	EditText id_editText;
	EditText passwd_editText;
	Button btn_login;
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.login);
		id_editText=(EditText)findViewById(R.id.id_edittext_id);
		passwd_editText=(EditText)findViewById(R.id.id_edittext_passwd);
		Log.e("Login", "����������");
		btn_login=(Button)findViewById(R.id.id_btn_login);
		btn_login.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch(v.getId()){
		case R.id.id_btn_login:
			Log.e("Login", "����login�¼�");
			String ID=id_editText.getText().toString();
			String passwd=passwd_editText.getText().toString();
			if(ID.equals("admin")&&passwd.equals("123456789")){
				Intent intent = new Intent(LoginActivity.this,MainActivity.class);
				startActivity(intent);
				finish();
			}else{
				Toast.makeText(getApplicationContext(), "�˺��������", Toast.LENGTH_SHORT).show();
			}
		}
	}
}
