package vn.edu.lamthpd01881.nhom2_qlks;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class TrangChuActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    NavigationView navigationView;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    TextView txtTenFacebook;

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

//        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.mo,R.string.dong);
//        drawerLayout.setDrawerListener(actionBarDrawerToggle);
//        actionBarDrawerToggle.syncState();

        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
