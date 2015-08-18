package thailand.hblifang.easytraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit บริเวณนี้ใช้ในการประกาศตัวแปร เพื่อเรียกตัวแปรที่ต้องไปใช้งานว่ามีกี่ตัว
    private ListView trafficListView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // Initial Widget
        initialWidget();

    } // Main Method นี่คือ เมธอดหลัก เมธอดหลักควรจะเป็นตัว manager เพื่อให้ไม่ให้เกิดความยุ่งเหยิงเวลาโค้ด

    private void initialWidget() {
        trafficListView = findViewById(R.id.listView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
} //Main Class นี่คือคลาสหลัก
