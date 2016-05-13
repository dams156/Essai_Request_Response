package com.example.dgivelet.essai_request_response;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import org.json.JSONObject;

import java.util.Iterator;
import java.util.List;

/**
 * Created by dgivelet on 13/05/2016.
 */
public class MainCreationProduit extends AppCompatActivity{

    ListView listeessai;
    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.creationproduit_main);
        listeessai= (ListView) findViewById(R.id.listviewcategorie);
    }
    public void ajouterListe(){
         String[] mStrings = {
                "AAAAAAAA", "BBBBBBBB", "CCCCCCCC", "DDDDDDDD", "EEEEEEEE",
                "FFFFFFFF", "GGGGGGGG", "HHHHHHHH", "IIIIIIII", "JJJJJJJJ",
                "KKKKKKKK", "LLLLLLLL", "MMMMMMMM", "NNNNNNNN", "OOOOOOOO",
                "PPPPPPPP", "QQQQQQQQ", "RRRRRRRR", "SSSSSSSS", "TTTTTTTT",
                "UUUUUUUU", "VVVVVVVV", "WWWWWWWW", "XXXXXXXX", "YYYYYYYY",
                "ZZZZZZZZ"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainCreationProduit.this,
                android.R.layout.simple_list_item_1, mStrings);
        listeessai.setAdapter(adapter);


    }
    private void recupererCategorie(){
        JSONObject jsonObject=new JSONObject();
        Iterator<String> liste=jsonObject.keys();
    }


}
