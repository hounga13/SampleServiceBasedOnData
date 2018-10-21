package com.hounga.sampleservicebasedondata;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.hounga.sampleservicebasedondata.entity.Quote;
import com.hounga.sampleservicebasedondata.presenter.quote.QuoteAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private ArrayList<Quote> list;
    private RecyclerView recyclerView;
    private QuoteAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*        //툴바세팅
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        //툴바 설정
        toolbar.setTitleTextColor(Color.parseColor("#ffffff")); //제목의 칼라
        toolbar.setSubtitle(R.string.subtitle); //부제목 넣기
        toolbar.setSubtitleTextColor(Color.parseColor("#000000"));
        //toolbar.setNavigationIcon(R.mipmap.ic_launcher); //제목앞에 아이콘 넣기
        setSupportActionBar(toolbar);*/

        //데이터 준비
        list = new ArrayList<>();
        list.add(new Quote("공부 안하면 더울 때 더운데서 일하고 추울 때 추운데서 일한다.","박명수"));
        list.add(new Quote("시작은 시작일 뿐이다.","박명수"));
        list.add(new Quote("늦었다고 생각할대가 늦은 것이다.","박명수"));
        list.add(new Quote("어려운 길은 길이 아니다.","박명수"));
        list.add(new Quote("고생끝에 골병 든다.","박명수"));

        //Log.d(TAG, "result :"+list.get(1).getQuote());

        //어답터 설정
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview_quote);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new QuoteAdapter(MainActivity.this, list);
        recyclerView.setAdapter(adapter);
    }
/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        //각각의 버튼을 클릭할때의 수행할것을 정의해 준다.
        switch (item.getItemId()){
            case R.id.home:
                Toast.makeText(this, "홈버튼을 눌렀습니다.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_add:
                Toast.makeText(this, "버튼2을 눌렀습니다.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_settings:
                Toast.makeText(this, "버튼3을 눌렀습니다.", Toast.LENGTH_SHORT).show();
                break;
        }

        return true;
    }*/
}
