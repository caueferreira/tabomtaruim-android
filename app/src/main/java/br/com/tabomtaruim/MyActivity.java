package br.com.tabomtaruim;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.tabomtaruim.communication.FeignClientBuilder;
import br.com.tabomtaruim.communication.api.BaseAPI;
import br.com.tabomtaruim.entity.GoodBad;


public class MyActivity extends Activity {

    private Map<Integer, String> favoriteLines = new LinkedHashMap<Integer, String>();
    private BaseAPI baseAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        FeignClientBuilder feignClientBuilder = new FeignClientBuilder();
        feignClientBuilder.setUrl(FeignClientBuilder.TEST);

        Log.i("URL", feignClientBuilder.url);

        baseAPI = feignClientBuilder.getBaseApi(BaseAPI.class);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public void chooseLine(View v) {
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//
//        StrictMode.setThreadPolicy(policy);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Tá bom? Tá ruim?");

        TelephonyManager mngr = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
        final String imei = mngr.getDeviceId();
        switch (v.getId()) {
            case R.id.ruby7:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-7");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-7");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();

                break;
            case R.id.diamond8:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-8");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-8");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();

                break;
            case R.id.emerald9:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-9");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-9");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;
            case R.id.turquoise10:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-10");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-10");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;
            case R.id.coral11:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-11");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-11");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;
            case R.id.sapphire12:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-12");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("cptm-12");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;

            case R.id.blue1:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-1");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-1");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;

            case R.id.green2:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-2");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-2");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;

            case R.id.red3:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-3");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-3");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;

            case R.id.yellow4:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-4");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-4");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;

            case R.id.lilac5:
                builder.setPositiveButton("Tá bom", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-5");
                        goodBad.setStatus("good");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                builder.setNegativeButton("Tá ruim", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        GoodBad goodBad = new GoodBad();
                        goodBad.setLine("metro-5");
                        goodBad.setStatus("bad");
                        goodBad.setImei(imei);

                        new ConnectToApi().execute(goodBad);
                    }
                });
                dialog = builder.create();
                dialog.show();
                break;
        }

        for (Integer key : favoriteLines.keySet()) {
            Log.i("Map says ", favoriteLines.get(key) + " choose");
        }
    }

    private class ConnectToApi extends AsyncTask<GoodBad, Void, GoodBad> {

        ProgressDialog dialog = ProgressDialog.show(MyActivity.this, "",
                "Canalizando nuvens de caos...", true);


        @Override
        protected GoodBad doInBackground(GoodBad... goodBads) {
            //Yet to code
            dialog.show();
            return baseAPI.report(goodBads[0]);
        }

        @Override
        protected void onPostExecute(GoodBad result) {
            dialog.cancel();

            new AlertDialog.Builder(MyActivity.this)
                    .setTitle("Good Bad")
                    .setMessage(result.getLine()+ " is "+result.getStatus())
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // continue with delete
                        }
                    })
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();
        }
    }
}