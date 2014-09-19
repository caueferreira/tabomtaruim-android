package br.com.tabomtaruim.fragments;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.LinkedHashMap;
import java.util.Map;

import br.com.tabomtaruim.R;
import br.com.tabomtaruim.communication.FeignClientBuilder;
import br.com.tabomtaruim.communication.api.BaseAPI;
import br.com.tabomtaruim.entity.GoodBad;
import br.com.tabomtaruim.helper.LoadingMessageGenerator;


public class MainFragment extends Fragment {

    private Map<Integer, String> favoriteLines = new LinkedHashMap<Integer, String>();
    private BaseAPI baseAPI;

    private Button blue1, green2, red3, yellow4, lilac5, ruby7, diamond8, emerald9, turquoise10, coral11, sapphire12;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.main_activity, container, false);

        FeignClientBuilder feignClientBuilder = new FeignClientBuilder();
        feignClientBuilder.setUrl(FeignClientBuilder.TEST);

        Log.i("URL", feignClientBuilder.url);

        baseAPI = feignClientBuilder.getBaseApi(BaseAPI.class);

        blue1 = (Button) rootView.findViewById(R.id.blue1);
        green2 = (Button) rootView.findViewById(R.id.green2);
        red3 = (Button) rootView.findViewById(R.id.red3);
        yellow4 = (Button) rootView.findViewById(R.id.yellow4);
        lilac5 = (Button) rootView.findViewById(R.id.lilac5);

        ruby7 = (Button) rootView.findViewById(R.id.ruby7);
        diamond8 = (Button) rootView.findViewById(R.id.diamond8);
        emerald9 = (Button) rootView.findViewById(R.id.emerald9);
        turquoise10 = (Button) rootView.findViewById(R.id.turquoise10);
        coral11 = (Button) rootView.findViewById(R.id.coral11);
        sapphire12 = (Button) rootView.findViewById(R.id.sapphire12);

        blue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        green2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        red3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        yellow4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        lilac5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        ruby7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        diamond8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        emerald9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        turquoise10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        coral11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });

        sapphire12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chooseLine(view);
            }
        });
        return rootView;
    }


    public void chooseLine(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Tá bom? Tá ruim?");

        TelephonyManager mngr = (TelephonyManager) getActivity().getSystemService(Context.TELEPHONY_SERVICE);
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

        ProgressDialog dialog = ProgressDialog.show(getActivity(), "",
                LoadingMessageGenerator.randomOne(), true);


        @Override
        protected GoodBad doInBackground(GoodBad... goodBads) {
            //Yet to code
            dialog.show();
            return baseAPI.report(goodBads[0]);
        }

        @Override
        protected void onPostExecute(GoodBad result) {
            dialog.cancel();

            new AlertDialog.Builder(getActivity())
                    .setTitle("Good Bad")
                    .setMessage(result.getLine() + " is " + result.getStatus())
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