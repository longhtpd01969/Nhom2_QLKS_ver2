package vn.edu.lamthpd01881.nhom2_qlks;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.facebook.login.LoginManager;
import com.facebook.login.widget.ProfilePictureView;

public class DangNhapActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    NavigationView navigationView;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    TextView txtTenFacebook;
    ProfilePictureView profilePictureView;
    ImageView imgAnhDaiDien;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang_chu);

        addControls();
    }
    @SuppressLint("RestrictedApi")
    private void addControls() {
        navigationView = findViewById(R.id.Navigation);
        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);

        View view = navigationView.inflateHeaderView(R.layout.layout_header_navigation);
        txtTenFacebook = view.findViewById(R.id.txtTenFacebook);
        //profilePictureView = view.findViewById(R.id.avatar2);
        imgAnhDaiDien = view.findViewById(R.id.imgAnhDaiDien);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.mo,R.string.dong);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);

        fragmentManager = getSupportFragmentManager();

        FragmentTransaction transactionTrangChu = fragmentManager.beginTransaction();
        TrangChuFragment trangChuFragment = new TrangChuFragment();
        transactionTrangChu.replace(R.id.content,trangChuFragment);
        transactionTrangChu.commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.itemTrangChu:
                FragmentTransaction transactionTrangChu = fragmentManager.beginTransaction();
                TrangChuFragment trangChuFragment = new TrangChuFragment();
                transactionTrangChu.replace(R.id.content,trangChuFragment);
                transactionTrangChu.commit();

                item.setChecked(true);
                drawerLayout.closeDrawers();
                break;

            case R.id.itemHocTap:
//                FragmentTransaction transactionHocTap = fragmentManager.beginTransaction();
//                HocTapFragment hocTapFragment = new HocTapFragment();
//                transactionHocTap.replace(R.id.content,hocTapFragment);
//                transactionHocTap.addToBackStack(hocTapFragment.getClass().getSimpleName());
//                transactionHocTap.commit();
//
                item.setChecked(true);
                drawerLayout.closeDrawers();
                break;
//
            case R.id.itemTinTuc:
//                FragmentTransaction transactionTinTuc = fragmentManager.beginTransaction();
//                TinTucFragment tinTucFragment = new TinTucFragment();
//                transactionTinTuc.replace(R.id.content,tinTucFragment);
//                transactionTinTuc.addToBackStack(tinTucFragment.getClass().getSimpleName());
//                transactionTinTuc.commit();
//
                item.setChecked(true);
                drawerLayout.closeDrawers();
                break;
//
            case R.id.itemBanDo:
//                FragmentTransaction transactionBanDo = fragmentManager.beginTransaction();
//                BanDoFragment banDoFragment = new BanDoFragment();
//                transactionBanDo.replace(R.id.content,banDoFragment);
//                transactionBanDo.addToBackStack(banDoFragment.getClass().getSimpleName());
//                transactionBanDo.commit();
//
                item.setChecked(true);
                drawerLayout.closeDrawers();
                break;

            case R.id.itemDangXuat:
                Intent intent = new Intent(DangNhapActivity.this, TrangChuActivity.class);
                startActivity(intent);
                item.setChecked(true);
                drawerLayout.closeDrawers();
                break;
        }
        return false;
    }
}
