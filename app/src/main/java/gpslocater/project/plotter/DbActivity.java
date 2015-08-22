package gpslocater.project.plotter;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class DbActivity extends Activity {

    private ListView obj;
    DBHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);
        mydb = new DBHelper(this);
        ArrayList array_list = mydb.getAllReadings();
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1, array_list);
        obj = (ListView)findViewById(R.id.listView1);
        obj.setAdapter(arrayAdapter);
    }
}
