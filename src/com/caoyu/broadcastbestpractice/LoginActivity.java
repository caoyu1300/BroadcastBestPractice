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
		Log.e("Login", "其他正常！");
		btn_login=(Button)findViewById(R.id.id_btn_login);
		btn_login.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch(v.getId()){
		case R.id.id_btn_login:
			Log.e("Login", "进入login事件");
			String ID=id_editText.getText().toString();
			String passwd=passwd_editText.getText().toString();
			if(ID.equals("admin")&&passwd.equals("123456789")){
				Intent intent = new Intent(LoginActivity.this,MainActivity.class);
				startActivity(intent);
				finish();
			}else{
				Toast.makeText(getApplicationContext(), "账号密码错误！", Toast.LENGTH_SHORT).show();
			}
		}
	}
}
