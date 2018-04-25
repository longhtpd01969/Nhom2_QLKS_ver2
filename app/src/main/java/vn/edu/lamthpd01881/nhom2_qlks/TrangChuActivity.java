package vn.edu.lamthpd01881.nhom2_qlks;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TrangChuActivity extends AppCompatActivity {

    Button btnDangKy, btnDangNhap;
    EditText edTenDangNhap, edMatKhau;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        btnDangKy = findViewById(R.id.btnDangKy);
        btnDangNhap = findViewById(R.id.btnDangnhap);
        edTenDangNhap = findViewById(R.id.edTaiKhoan);
        edMatKhau = findViewById(R.id.edMatKhau);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edMatKhau.getText().length()==0 || edTenDangNhap.getText().length()==0){
                    Toast.makeText(getApplicationContext(),"Mời nhập tài khoản hoặc mật khẩu",Toast.LENGTH_SHORT).show();
                }else {
                    Intent intent = new Intent(TrangChuActivity.this,DangNhapActivity.class);
                    startActivity(intent);
                }
            }
        });

    }
}
