package com.example.win10_pc.project.activity;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.win10_pc.project.R;
import com.example.win10_pc.project.fragment.BookFragment;


public class BookActivity extends AppCompatActivity {
    private FragmentManager mFm;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private String[] mMenuList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_main);

        mFm = getFragmentManager();
        mFm.beginTransaction()
                .replace(R.id.container, new BookFragment())
                .commit();
    }

}