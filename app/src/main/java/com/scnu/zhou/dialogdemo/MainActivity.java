package com.scnu.zhou.dialogdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.scnu.zhou.widget.UIAlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showTwoButtonDialog();
            }
        });
    }

    public void showTwoButtonDialog(){

        final UIAlertDialog dialog = new UIAlertDialog(this);
        dialog.setTitle("友情提示");
        dialog.setMessage("请先完善您的信息\n再进行相关操作");
        dialog.setNegativeButton("知道了", UIAlertDialog.BUTTON_LEFT, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setPositiveButton("现在就去", UIAlertDialog.BUTTON_RIGHT, new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        //dialog.show();
    }

    public void showOneButtonDialog(){

        final UIAlertDialog dialog = new UIAlertDialog(this);
        dialog.setTitle("友情提示");
        dialog.setMessage("请先完善您的信息\n再进行相关操作");
        dialog.setButton("知道了", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        //dialog.show();
    }
}
