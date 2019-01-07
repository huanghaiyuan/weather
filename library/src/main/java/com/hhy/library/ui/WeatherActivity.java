package com.hhy.library.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.hhy.library.R;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

public class WeatherActivity extends AppCompatActivity {
    private TextView location, date, degrees, tips;
    private ImageView weatherImg;
    private LineChart lineChart;
    private RecyclerView air;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        OkGo.<String>get("http://www.weather.com.cn/data/zs/101301402.html")
                .tag(this).execute(new StringCallback() {
            @Override
            public void onSuccess(Response<String> response) {
                Log.e("hhy", response.toString());
            }
        });
    }
}
