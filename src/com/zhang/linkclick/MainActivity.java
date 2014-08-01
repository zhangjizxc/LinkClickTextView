
package com.zhang.linkclick;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.test.zhang.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.text.style.ForegroundColorSpan;
import android.text.util.Linkify;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.text);
        String text = "【支付宝】付款校验码349924，购买网易产品(5.00元)www.baidu.com。";
        textView.setText(text);
//        textView.setOnTouchListener(new LinkTouchListener());
        textView.setOnClickListener(new View.OnClickListener() {
            
            @Override
            public void onClick(View v) {
                Log.v("533", "111111111111111111");
            }
        });
        textView.setOnLongClickListener(new View.OnLongClickListener() {
            
            @Override
            public boolean onLongClick(View v) {
                Log.v("533", "2222");
                return true;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    private class LinkTouchListener implements View.OnTouchListener {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            // TODO Auto-generated method stub
            return false;
        }

    }
}
