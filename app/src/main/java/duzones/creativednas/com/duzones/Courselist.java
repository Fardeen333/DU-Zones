package duzones.creativednas.com.duzones;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;


public class Courselist extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courselist);
        tabLayout=(TabLayout)findViewById(R.id.courselayout);
        viewPager=(ViewPager)findViewById(R.id.coursepage);
        adapter=new ViewPagerAdapter(getSupportFragmentManager());

        // Add Fragment Here
        adapter.AddFragment(new fragment_bsc(),"Bsc");
        adapter.AddFragment(new fragment_bcom(),"Bcom");
        adapter.AddFragment(new fragment_ba(),"Ba");
      //  adapter.AddFragment(new fragment_bed(),"B-ed");


        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        if(!checknetwork(Courselist.this))
        {
            Snackbar snackbar2 = Snackbar.make(findViewById(R.id.llout), "You are offline!", Snackbar.LENGTH_LONG);
            snackbar2.show();

        }

    }
    public boolean checknetwork(Context context)
    {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if((networkInfo != null) && networkInfo.isConnectedOrConnecting())
        {
            android.net.NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            android.net.NetworkInfo mobiledata = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

            if((mobiledata!=null && mobiledata.isConnectedOrConnecting())||(wifi!=null && wifi.isConnectedOrConnecting()))
                return true;
            else return false;
        }
        else return  false;
    }


}
