package com.lyh.wifikey;

import android.widget.BaseAdapter;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.net.wifi.ScanResult;
import java.util.List;
import android.content.Context;
import android.widget.TextView;

public class WifiAdapter extends BaseAdapter
{
	LayoutInflater mLayoutInflater;
	List<ScanResult>mList;
	
	public WifiAdapter(Context context,List<ScanResult>mList)
	{
		this.mLayoutInflater = LayoutInflater.from(context);
		this.mList = mList;
	}
	
	@Override
	public int getCount()
	{
		// TODO: Implement this method
		return mList.size();
	}

	@Override
	public Object getItem(int p1)
	{
		// TODO: Implement this method
		return p1;
	}

	@Override
	public long getItemId(int p1)
	{
		// TODO: Implement this method
		return p1;
	}

	@Override
	public View getView(int p1, View p2, ViewGroup p3)
	{
		View mView = null;
		mView = mLayoutInflater.inflate(R.layout.wifi_list_item,null);
		ScanResult mScanResult = mList.get(p1);
		TextView ssidTextView = (TextView) mView.findViewById(R.id.ssid);
		ssidTextView.setText("SSID:"+mScanResult.SSID);
		TextView bssidTextView = (TextView) mView.findViewById(R.id.bssid);
		bssidTextView.setText("BSSID:"+mScanResult.BSSID);
		TextView levelTextview = (TextView) mView.findViewById(R.id.level);
		levelTextview.setText("Level:"+mScanResult.level);
		// TODO: Implement this method
		return mView;
	}

}
