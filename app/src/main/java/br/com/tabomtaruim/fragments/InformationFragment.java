package br.com.tabomtaruim.fragments;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import br.com.tabomtaruim.R;
import br.com.tabomtaruim.communication.FeignClientBuilder;
import br.com.tabomtaruim.communication.api.BaseAPI;
import br.com.tabomtaruim.entity.GoodBad;
import br.com.tabomtaruim.helper.LoadingMessageGenerator;


public class InformationFragment extends Fragment {

    private Map<Integer, String> favoriteLines = new LinkedHashMap<Integer, String>();
    private BaseAPI baseAPI;

    private TextView line1, line2, line3, line4, line5, line7, line8, line9, line10, line11, line12;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.information_activity, container, false);

        FeignClientBuilder feignClientBuilder = new FeignClientBuilder();
        feignClientBuilder.setUrl(FeignClientBuilder.TEST);

        Log.i("URL", feignClientBuilder.url);

        baseAPI = feignClientBuilder.getBaseApi(BaseAPI.class);


        line1 = (TextView) rootView.findViewById(R.id.line1);
        line2 = (TextView) rootView.findViewById(R.id.line2);
        line3 = (TextView) rootView.findViewById(R.id.line3);
        line4 = (TextView) rootView.findViewById(R.id.line4);
        line5 = (TextView) rootView.findViewById(R.id.line5);

        line7 = (TextView) rootView.findViewById(R.id.line7);
        line8 = (TextView) rootView.findViewById(R.id.line8);
        line9 = (TextView) rootView.findViewById(R.id.line9);
        line10 = (TextView) rootView.findViewById(R.id.line10);
        line11 = (TextView) rootView.findViewById(R.id.line11);
        line12 = (TextView) rootView.findViewById(R.id.line12);

        new ConnectToApi().execute();


        final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) rootView.findViewById(R.id.container);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new ConnectToApi().execute();
            }
        });

        return rootView;
    }

    private class ConnectToApi extends AsyncTask<GoodBad, Void, List<GoodBad>> {

        ProgressDialog dialog = ProgressDialog.show(getActivity(), "",
                LoadingMessageGenerator.randomOne(), true);


        @Override
        protected List<GoodBad> doInBackground(GoodBad... goodBads) {
            //Yet to code
            dialog.show();
            List<GoodBad> goodBadList = new ArrayList<GoodBad>();
            goodBadList.add(baseAPI.checkLineStatus("metro-1"));
            goodBadList.add(baseAPI.checkLineStatus("metro-2"));
            goodBadList.add(baseAPI.checkLineStatus("metro-3"));
            goodBadList.add(baseAPI.checkLineStatus("metro-4"));
            goodBadList.add(baseAPI.checkLineStatus("metro-5"));


            goodBadList.add(baseAPI.checkLineStatus("cptm-7"));
            goodBadList.add(baseAPI.checkLineStatus("cptm-8"));
            goodBadList.add(baseAPI.checkLineStatus("cptm-9"));
            goodBadList.add(baseAPI.checkLineStatus("cptm-10"));
            goodBadList.add(baseAPI.checkLineStatus("cptm-11"));
            goodBadList.add(baseAPI.checkLineStatus("cptm-12"));


            Log.i("GoodBad", goodBadList.toString());
            return goodBadList;
        }

        @Override
        protected void onPostExecute(List<GoodBad> result) {
            line1.setText(result.get(0).getStatus());
            line2.setText(result.get(1).getStatus());
            line3.setText(result.get(2).getStatus());
            line4.setText(result.get(3).getStatus());
            line5.setText(result.get(4).getStatus());

            line7.setText(result.get(5).getStatus());
            line8.setText(result.get(6).getStatus());
            line9.setText(result.get(7).getStatus());
            line10.setText(result.get(8).getStatus());
            line11.setText(result.get(9).getStatus());
            line12.setText(result.get(10).getStatus());

            dialog.cancel();
        }
    }
}