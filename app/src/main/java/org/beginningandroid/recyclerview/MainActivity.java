package org.beginningandroid.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<MatchModel> matchesList = new ArrayList<>();
    ArrayList<String> listFutbolHeaders = new ArrayList<String>();
    ArrayList<String> listFutboldata = new ArrayList<String>();
    Document doc = null;
    private MatchesAdapter mAdapter;
    ArrayList<String> listFutbolUno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        mAdapter = new MatchesAdapter(matchesList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        ///GetHtmlFromWeb();
        prepareMatchData();

    }
    private void prepareMatchData() {
        /*


        for (int i = 0; i > listFutboldata.size(); i = i + 4) {
            MatchModel match = new MatchModel(listFutboldata.get(i), listFutboldata.get(i+1), listFutboldata.get(i +2), listFutboldata.get(i +3));
            matchesList.add(match);


        }
        */
        ///mAdapter.notifyDataSetChanged();
        ///MatchModel movie = new MatchModel("Mad Max: Fury Road", "Action & Adventure", "2015");
        ///movieList.add(movie);
        MatchModel match = new MatchModel("Inside Out", "Animation, Kids & Family", "Colombiana", "Win", "En Vivo", "https");
        matchesList.add(match);
        mAdapter.notifyDataSetChanged();
    }
    /*
    private void GetHtmlFromWeb() {

        new Thread(new Runnable() {
            @Override


            public void run() {


                try {
                    doc = Jsoup.connect("https://www.futbolred.com/parrilla-de-futbol").get();
                    Elements links = doc.select("table");
                    Elements ths = links.select("th");
                    Elements tds = links.select("td");

                    for(Element titulo : ths) {
                        listFutbolHeaders.add(titulo.text());
                        for (Element singleMatch : tds) {
                            listFutboldata.add((singleMatch.text()));
                        }

                }
            } catch (IOException e) {
                    e.printStackTrace();
                }
                /*
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //text3.setText(Html.fromHtml(stringBuilder.toString()));
                        ///text3.setText("" + listFutbolHeaders);
                        listFutbolUno = listFutbolHeaders;

                    }
                });
                *
                 */
            }
    /*
    }).start();
    }

     */

