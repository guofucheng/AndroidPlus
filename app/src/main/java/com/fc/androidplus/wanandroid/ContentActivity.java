package com.fc.androidplus.wanandroid;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.fc.androidplus.R;
import com.fc.androidplus.wanandroid.category.CategoryFragment;
import com.fc.androidplus.wanandroid.home.HomeFragment;
import com.fc.androidplus.wanandroid.personal.PersonalFragment;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContentActivity extends AppCompatActivity {

    @BindView(R.id.ll_home)
    LinearLayout llHome;
    @BindView(R.id.ll_category)
    LinearLayout llCategory;
    @BindView(R.id.ll_personal)
    LinearLayout llPersonal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        ButterKnife.bind(this);
        toFragment(R.id.container,HomeFragment.newInstance());

    }

    public void toFragment(int id, Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(id, fragment).commit();

    }


    @OnClick({R.id.ll_home, R.id.ll_category, R.id.ll_personal})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.ll_home:
                toFragment(R.id.container, HomeFragment.newInstance());

                break;
            case R.id.ll_category:
                toFragment(R.id.container, CategoryFragment.newInstance("", ""));

                break;
            case R.id.ll_personal:
                toFragment(R.id.container, PersonalFragment.newInstance("", ""));

                break;
        }
    }
}
