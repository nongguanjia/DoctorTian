package com.nongguanjia.doctorTian.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nongguanjia.doctorTian.R;

/**
 * @author tx
 * 我的课程 -- 即将开始
 */
public class FgMyCourseWillStart extends Fragment {

	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.will_start,
				null);
		
		
		return view;
	}

}
