package com.fc.androidplus.words;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fc.androidplus.R;
import com.fc.androidplus.data.HttpUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WordsActivity extends AppCompatActivity implements WordsContract.View {


    @BindView(R.id.et_word)
    EditText etWord;
    @BindView(R.id.btn_search)
    Button btnSearch;
    @BindView(R.id.tv_result)
    TextView tvResult;

    WordsContract.Presenter mPresenter;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_words);
        ButterKnife.bind(this);
        progressDialog = new ProgressDialog(this);
        mPresenter = new WordsPresenter(this);
    }

    @Override
    public void setPresenter(WordsContract.Presenter presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public void showProgressDialog() {
        progressDialog.setTitle("提示");
        progressDialog.setMessage("正在查询");

        progressDialog.show();
    }

    @Override
    public void dismissProgressDialog() {
        progressDialog.dismiss();
    }

    @Override
    public void showResult(final String result) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                tvResult.setText(result);
            }
        });

    }

    @Override
    public void errPromopt(String err) {
        Toast.makeText(this, err, Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.btn_search)
    public void onViewClicked() {

        mPresenter.searchWord(etWord.getText().toString());


    }
}
