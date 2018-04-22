package vn.edu.lamthpd01881.nhom2_qlks;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TrangChuFragment extends Fragment {
    View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.trang_chu_fragment,container,false);

        addControls();
        addEvents();

        return view;
    }

    private void addEvents() {

    }

    private void addControls() {

    }
}
