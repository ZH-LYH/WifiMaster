package com.lyh.wifikey;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import java.util.List;
import android.widget.BaseAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.zip.Inflater;

public class MainActivity extends Activity 
{
	private WifiManager mWifiManager;
	List<ScanResult>mList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		init();
    }

	private void init()
	{
		mWifiManager = (WifiManager)getSystemService(Context.WIFI_SERVICE);
		mList = mWifiManager.getScanResults();
		ListView mListView = (ListView) findViewById(R.id.wifi_list);
		if(mList==null)
		{
			Toast.makeText(getApplicationContext(),"Wifi未打开",Toast.LENGTH_SHORT).show();
		}
		else
		{
			mListView.setAdapter(new WifiAdapter(this,mList));
		}
		// TODO: Implement this method
	}
}
