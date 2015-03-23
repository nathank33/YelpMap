package com.nathanbraun.yelpmap;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.nathanbraun.yelpmap.com.nathanbraun.yelpapi.YelpAPI;


public class MainActivity extends ActionBarActivity {
    private YelpAPI yelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //RelativeLayout layout = (RelativeLayout) this.findViewById(R.id.act_main_layout);
        yelp = new YelpAPI();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem searchItem = menu.findItem(R.id.searchView);
        SearchView search = (SearchView) searchItem.getActionView();
        Toast.makeText(this, "here", Toast.LENGTH_SHORT).show();
        search.setOnQueryTextListener(new YelpSearchListener());
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //if (id == R.id.action_settings) {
        //    return true;
        //}
        return super.onOptionsItemSelected(item);
    }

    public class YelpSearchListener implements SearchView.OnQueryTextListener {
        @Override
        public boolean onQueryTextSubmit(String s) {
            Toast.makeText(MainActivity.this, yelp.search("Mexican"), Toast.LENGTH_SHORT).show();
            return false;
        }

        @Override
        public boolean onQueryTextChange(String s) {
            return false;
        }
    }
}
