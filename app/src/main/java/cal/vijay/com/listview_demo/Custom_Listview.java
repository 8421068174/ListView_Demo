package cal.vijay.com.listview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Custom_Listview extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
    int flags[] = {R.drawable.india,R.drawable.india , R.drawable.india, R.drawable.india, R.drawable.india, R.drawable.india};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom__listview);

        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        //simpleList.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        simpleList.setAdapter(customAdapter);

    }
}
