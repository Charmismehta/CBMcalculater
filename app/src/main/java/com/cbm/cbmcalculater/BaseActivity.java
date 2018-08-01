package com.cbm.cbmcalculater;


import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//import com.google.gson.Gson;
//import com.google.gson.reflect.TypeToken;

//import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class BaseActivity extends AppCompatActivity {

//    public static final String DATE_FORMAT_SERVER = Constant.DATE_FORMAT_SERVER;
//    LocationService locationService;
    public boolean isRetry = false;
    public boolean isCallAgain = true;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        toast = Toast.makeText(getActivity(), "", Toast.LENGTH_LONG);


    }

    public BaseActivity getActivity() {
        return this;
    }


//    @Override
//    protected void onResume() {
//        updateToken();
////        if(isCallAgain) {
////            checkVersion();
////        }
//        super.onResume();
//    }



    //    public void initTeamView(boolean b) {
//
//        View llTeamView = (View) findViewById(R.id.llTeamView);
//        llTeamView.setVisibility(View.VISIBLE);
//
//        TextView tvTitleText = (TextView) findViewById(R.id.tvTitleText);
//        tvTitleText.setVisibility(View.GONE);
//
//        ImageView imgTeamProfile = (ImageView) findViewById(R.id.imgTeamProfile);
//
//        initBack(true);
//    }
//    public void initBack(boolean b) {
//        ImageView imgBack = (ImageView) findViewById(R.id.imgBack);
//
//        imgBack.setVisibility(View.VISIBLE);
//        imgBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });
//    }




//
//    Drawer result;
//
//    public void initDrawer(boolean b) {
//        if (b) {
//            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//            setSupportActionBar(toolbar);
//
//
////create the drawer and remember the `Drawer` result object
//            result = new DrawerBuilder()
//                    .withActivity(this).withCloseOnClick(true).withSelectedItemByPosition(-1)
//                    .withHeader(R.layout.nav_header_main)
//                    .addDrawerItems(
//                            new PrimaryDrawerItem().withName("Log out").withSelectable(false).withIcon(R.drawable.ic_place),
//                            new PrimaryDrawerItem().withName("Trip").withSelectable(false).withIcon(R.drawable.ic_call_24dp),
//                            new PrimaryDrawerItem().withName("Violations").withSelectable(false).withIcon(R.drawable.ic_chat),
//                            new PrimaryDrawerItem().withName("Hos").withSelectable(false).withIcon(R.drawable.ic_call_24dp),
//                            new PrimaryDrawerItem().withName("VIR").withSelectable(false).withIcon(R.drawable.ic_fax_24dp),
//                            new PrimaryDrawerItem().withName("Change Password").withSelectable(false).withIcon(R.drawable.ic_chat),
//                            new PrimaryDrawerItem().withName("Logout").withSelectable(false).withIcon(R.drawable.ic_delete_24dp)
//                    )
//                    .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
//                        @Override
//                        public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
//                            if (position == 0) {
//
//                            } else if (position == 1) {
//
//
//                            } else if (position == 2) {
//
//
//                            } else if (position == 6) {
////                            confirmLogout();
//                            }
//                            return true;
//                        }
//                    })
//                    .build();
//
//            ImageView imgMenu = (ImageView) findViewById(R.id.imgFilter);
//            if (imgMenu != null) {
//                imgMenu.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        if (result.isDrawerOpen()) {
//                            result.closeDrawer();
//                        } else {
//                            result.openDrawer();
//                        }
//                    }
//                });
//            }
//
//        initMenuItems();
//        fillProfileData();
//        }else {
//            ImageView imgMenu = (ImageView) findViewById(R.id.imgFilter);
//            imgMenu.setVisibility(View.GONE);
//        }
//    }
//    public void showLoginDialog() {
//
//        MaterialDialog.Builder builder = new MaterialDialog.Builder(getActivity())
//                .title(R.string.login_title)
//                .content(R.string.login_msg)
//                .buttonsGravity(GravityEnum.CENTER)
//                .positiveText(R.string.btn_ok)
//                .onPositive(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//
//                    }
//                });
//
//        MaterialDialog dialog = builder.build();
//        dialog.show();
//    }
//
//    private void hideMenu(boolean b) {
//        try {
////            if (b)
//            result.closeDrawer();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

//    private void finishActivity() {
//        if ((getActivity() instanceof MainActivity)) {
//
//        } else {
//            getActivity().finish();
//        }
//
//    }


//    ImageLoader imageLoader;

//    MyEventServiceReciever commonReciever;
//
//    class MyEventServiceReciever extends BroadcastReceiver {
//
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            try {
//                if (intent.getAction().equalsIgnoreCase(
//                        Constant.FINISH_ACTIVITY)) {
//                    finish();
//                } else if (intent.getAction().equalsIgnoreCase(
//                        Constant.GET_NEW_NOTIFICATION)) {
//                    newNotification();
//                }
//
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }



//    private TextView tvTitleText;

//    public void setTitleText(String text) {
//        try {
//
//            if (tvTitleText == null)
//                tvTitleText = (TextView) findViewById(R.id.tvTitleText);
//            tvTitleText.setText(text);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean handled = super.onKeyDown(keyCode, event);

        // Eat the long press event so the keyboard doesn't come up.
        if (keyCode == KeyEvent.KEYCODE_MENU && event.isLongPress()) {
            return true;
        }

        return handled;
    }

    Toast toast;

    public void showToast(final String text, final int duration) {
        runOnUiThread(new Runnable() {

            @Override
            public void run() {
                toast.setText(text);
                toast.setDuration(duration);
                toast.show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        try {
//            locationService.stopLocationUpdates();
//            locationService.stop();
//            LocalBroadcastManager.getInstance(this).unregisterReceiver(mLocationReceiver);
//            LocalBroadcastManager.getInstance(getApplicationContext())
//                    .unregisterReceiver(commonReciever);
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.onDestroy();
    }

    BaseCallback baseCallback;

    public void setBaseCallback(BaseCallback baseCallback) {
        this.baseCallback = baseCallback;
    }

    interface BaseCallback {
        void onMasterDataLoad();
    }

//    public void showSpinner(final String title, final TextView tv,
//                            final ArrayList<Spinner> data, boolean isFilterable, final SpinnerCallback callback) {
//
//        showSpinner(title, tv, data, isFilterable, false, callback);
//    }
//
//    public void showSpinner(final String title, final TextView tv,
//                            final ArrayList<Spinner> data, boolean isFilterable, boolean isClear, final SpinnerCallback callback) {
//
//        final Dialog a = new Dialog(getActivity());
//        Window w = a.getWindow();
//        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        a.setContentView(R.layout.spinner);
//        w.setBackgroundDrawableResource(android.R.color.transparent);
//
//        TextView lblselect = (TextView) w.findViewById(R.id.dialogtitle);
//        lblselect.setText(title.replace("*", "").trim());
//
//        TextView dialogClear = (TextView) w.findViewById(R.id.dialogClear);
//
//        dialogClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tv.setText("");
//                tv.setTag(null);
//
//                a.dismiss();
//            }
//        });
//
//        if (isClear) {
//            dialogClear.setVisibility(View.VISIBLE);
//        } else {
//            dialogClear.setVisibility(View.GONE);
//        }
//
//        final EditText editSearch = (EditText) w.findViewById(R.id.editSearch);
//        if (isFilterable) {
//            editSearch.setVisibility(View.VISIBLE);
//        } else {
//            editSearch.setVisibility(View.GONE);
//        }
//
//        final SpinnerAdapter adapter = new SpinnerAdapter(getActivity());
//        adapter.setFilterable(isFilterable);
//        ListView lv = (ListView) w.findViewById(R.id.lvSpinner);
//        lv.setAdapter(adapter);
//        adapter.addAll(data);
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterview, View view,
//                                    int position, long l) {
//                ArrayList<Spinner> selList = new ArrayList<Spinner>();
//                selList.add(adapter.getItem(position));
//
//                if (title.equalsIgnoreCase(getString(R.string.choose_country))) {
//                    tv.setText(adapter.getItem(position).ID);
//                    tv.setTag(adapter.getItem(position).ID);
//                } else {
//                    if (tv != null) {
//                        tv.setText(adapter.getItem(position).title);
//                        tv.setTag(adapter.getItem(position).ID);
//                    }
//
//                }
//
//                if (callback != null) {
//                    callback.onDone(selList);
//                }
//
//                a.dismiss();
//
//            }
//        });
//
//        editSearch.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.toString().trim().length() >= 1) {
//                    adapter.getFilter().filter(editable.toString().trim());
//                } else {
//                    adapter.getFilter().filter("");
//                }
//
//            }
//        });
//
//        a.show();
//    }
//
//    public void showSpinnerClearCallBack(final String title, final TextView tv,
//                                         final ArrayList<Spinner> data, boolean isFilterable, boolean isClear, final SpinnerClearCallback ClearCallback) {
//
//        final Dialog a = new Dialog(getActivity());
//        Window w = a.getWindow();
//        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        a.setContentView(R.layout.spinner);
//        w.setBackgroundDrawableResource(android.R.color.transparent);
//
//        TextView lblselect = (TextView) w.findViewById(R.id.dialogtitle);
//        lblselect.setText(title.replace("*", "").trim());
//
//        TextView dialogClear = (TextView) w.findViewById(R.id.dialogClear);
//        dialogClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tv.setText("");
//                tv.setTag(null);
//
//                ClearCallback.onDone();
//
//                a.dismiss();
//            }
//        });
//
//        if (isClear) {
//            dialogClear.setVisibility(View.VISIBLE);
//        } else {
//            dialogClear.setVisibility(View.GONE);
//        }
//
//        final EditText editSearch = (EditText) w.findViewById(R.id.editSearch);
//        if (isFilterable) {
//            editSearch.setVisibility(View.VISIBLE);
//        } else {
//            editSearch.setVisibility(View.GONE);
//        }
//
//        final SpinnerAdapter adapter = new SpinnerAdapter(getActivity());
//        adapter.setFilterable(isFilterable);
//        ListView lv = (ListView) w.findViewById(R.id.lvSpinner);
//        lv.setAdapter(adapter);
//        adapter.addAll(data);
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterview, View view,
//                                    int position, long l) {
//                ArrayList<Spinner> selList = new ArrayList<Spinner>();
//                selList.add(adapter.getItem(position));
//
//                if (title.equalsIgnoreCase(getString(R.string.choose_country))) {
//                    tv.setText(adapter.getItem(position).ID);
//                    tv.setTag(adapter.getItem(position).ID);
//                } else {
//                    tv.setText(adapter.getItem(position).title);
//                    tv.setTag(adapter.getItem(position).ID);
//                }
//
//                if (ClearCallback != null) {
//                    ClearCallback.onDone(selList);
//                }
//
//                a.dismiss();
//
//            }
//        });
//
//        editSearch.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.toString().trim().length() >= 1) {
//                    adapter.getFilter().filter(editable.toString().trim());
//                } else {
//                    adapter.getFilter().filter("");
//                }
//
//            }
//        });
//
//        a.show();
//    }
//
//    public void showGameSpinner(final String title,
//                                final ArrayList<Spinner> data, boolean isFilterable, final SpinnerCallback callback) {
//
//        final Dialog a = new Dialog(getActivity());
//        Window w = a.getWindow();
//        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        a.setContentView(R.layout.spinner);
//        w.setBackgroundDrawableResource(android.R.color.transparent);
//
//        TextView lblselect = (TextView) w.findViewById(R.id.dialogtitle);
//        lblselect.setText(title.replace("*", "").trim());
//
//        TextView dialogClear = (TextView) w.findViewById(R.id.dialogClear);
//
////        dialogClear.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                tv.setText("");
////                tv.setTag(null);
////
////                a.dismiss();
////            }
////        });
//
////        if (isClear) {
////            dialogClear.setVisibility(View.VISIBLE);
////        } else {
////            dialogClear.setVisibility(View.GONE);
////        }
//
//        final EditText editSearch = (EditText) w.findViewById(R.id.editSearch);
//        if (isFilterable) {
//            editSearch.setVisibility(View.VISIBLE);
//        } else {
//            editSearch.setVisibility(View.GONE);
//        }
//
//        final SpinnerAdapter adapter = new SpinnerAdapter(getActivity());
//        adapter.setFilterable(isFilterable);
//        ListView lv = (ListView) w.findViewById(R.id.lvSpinner);
//        lv.setAdapter(adapter);
//        adapter.addAll(data);
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterview, View view,
//                                    int position, long l) {
//                ArrayList<Spinner> selList = new ArrayList<Spinner>();
//                selList.add(adapter.getItem(position));
//
//                if (adapter.getItem(position).title.equalsIgnoreCase("Football")) {
//                    Intent intent = new Intent(getActivity(), FindActivity.class);
//                    intent.putExtra("gameName", adapter.getItem(position).title);
//                    intent.putExtra("gameId", adapter.getItem(position).ID);
//                    intent.putExtra("frag_Id", "1");
//                    startActivity(intent);
//                } else if (adapter.getItem(position).title.equalsIgnoreCase("Futsal")) {
//                    Intent intent1 = new Intent(getActivity(), FindActivity.class);
//                    intent1.putExtra("gameName", adapter.getItem(position).title);
//                    intent1.putExtra("gameId", adapter.getItem(position).ID);
//                    intent1.putExtra("frag_Id", "1");
//                    startActivity(intent1);
//                }
//
//                if (callback != null) {
//                    callback.onDone(selList);
//                }
//
//                a.dismiss();
//
//            }
//        });
//
//        editSearch.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.toString().trim().length() >= 1) {
//                    adapter.getFilter().filter(editable.toString().trim());
//                } else {
//                    adapter.getFilter().filter("");
//                }
//
//            }
//        });
//
//        a.show();
//    }
//
//    public void showSpinnerSel(String title, final TextView tv,
//                               final ArrayList<Spinner> data, boolean isFilterable, final SpinnerCallback callback) {
//
//        final Dialog a = new Dialog(this);
//        Window w = a.getWindow();
//        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        a.setContentView(R.layout.spinner_sel);
//        w.setBackgroundDrawableResource(android.R.color.transparent);
//
//        TextView lblselect = (TextView) w.findViewById(R.id.dialogtitle);
//        lblselect.setText(title);
//        lblselect.setText(title.replace("*", "").trim());
//
////        TextView dialogClear = (TextView) w.findViewById(R.id.dialogClear);
////        dialogClear.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                tv.setText("");
////                tv.setTag(null);
////
////                a.dismiss();
////            }
////        });
//
////        EditText editSearch = (EditText) w.findViewById(R.id.editSearch);
////        if (isFilterable) {
////            editSearch.setVisibility(View.VISIBLE);
////        } else {
////            editSearch.setVisibility(View.GONE);
////        }
//
//        String selectedStr = "";
//
////        if (tv == editIntensity) {
////            selectedStr = stoneParam.FancycolorIntensityList;
////        }
////        if (tv == editColor) {
////            selectedStr = stoneParam.FancyColorList;
////        }
////        if (tv == editOvertone) {
////            selectedStr = stoneParam.FancycolorOvertoneList;
////        }
//
//
//        if (!StringUtils.isEmpty(selectedStr)) {
//            ArrayList<String> selected = Utils.asList(selectedStr.replaceAll("'", ""));
//
//            if (!selected.isEmpty()) {
//                for (int i = 0; i < data.size(); i++) {
//                    if (selected.contains(data.get(i).ID)) {
//                        data.get(i).setSelected(true);
//                    } else {
//                        data.get(i).setSelected(false);
//                    }
//                }
//            }
//        }
//
//
//        final SpinnerSelAdapter adapter = new SpinnerSelAdapter(getActivity());
//        adapter.setFilterable(isFilterable);
//        ListView lv = (ListView) w.findViewById(R.id.lvSpinner);
//        lv.setAdapter(adapter);
//        adapter.addAll(data);
//
////        if (tv.getTag().toString().trim()!= null){
////            for (int i = 0; i <data.size() ; i++) {
////                if (tv.getTag().toString().trim().equals(data.get(i).ID)){
////                    Debug.e("Game Id" , data.get(i).ID);
////                }
////            }
////        }
//
//        lv.setOnItemClickListener(
//                new AdapterView.OnItemClickListener() {
//
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterview, View view,
//                                            int position, long l) {
//
//                        adapter.changeSelection(position, true);
//
//                    }
//                }
//
//        );
//
////        for (int i = 0; i <data.size() ; i++) {
////            if (adapter.isSelectedAtleastOne()){
////                adapter.changeSelection(Integer.valueOf(data.get(i).ID), true);
////            }else{
////                adapter.changeSelection(Integer.valueOf(data.get(i).ID), false);
////            }
////        }
//
////        editSearch.addTextChangedListener(new TextWatcher() {
////            @Override
////            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////
////            }
////
////            @Override
////            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////
////            }
////
////            @Override
////            public void afterTextChanged(Editable editable) {
////                if (editable.toString().trim().length() >= 1) {
////                    adapter.getFilter().item_filter(editable.toString().trim());
////                } else {
////                    adapter.getFilter().item_filter("");
////                }
////
////            }
////        });
//
//        Button btnSpinnerOk = (Button) w.findViewById(R.id.btnPositive);
////        final View llGame = (View) w.findViewById(R.id.llGame);
////        final TextView tvGameName = (TextView) w.findViewById(R.id.tvGameName);
//        btnSpinnerOk.setOnClickListener(
//                new View.OnClickListener() {
//
//                    @Override
//                    public void onClick(View v) {
//                        ArrayList<Spinner> selList = adapter.getSelectedAll();
//                        tv.setText(adapter.getSelectedTitle());
//                        tv.setTag(adapter.getSelectedId());
//
//
//                        if (selList.size() > 0) {
//                            tv.setTag(adapter.getSelectedIdArray());
//
//                        } else {
//                            tv.setTag(null);
//                        }
//
//                        if (callback != null) {
////                            tvGameName.setText(tv.getText());
//                            callback.onDone(selList);
//                        }
//
//                        a.dismiss();
//                    }
//                }
//
//        );
//
//        Button btnSpinnerCancel = (Button) w
//                .findViewById(R.id.btnNegative);
//        btnSpinnerCancel.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        a.dismiss();
//                    }
//
//                }
//
//        );
//
//        a.show();
//    }
//
//    public void showSpinnerSelGrp(String title, final TextView tv,
//                                  final ArrayList<Spinner> data, boolean isFilterable, final SpinnerCallback callback) {
//
//        final Dialog a = new Dialog(this);
//        Window w = a.getWindow();
//        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        a.setContentView(R.layout.spinner_sel_grp);
//        w.setBackgroundDrawableResource(android.R.color.transparent);
//
//        TextView lblselect = (TextView) w.findViewById(R.id.dialogtitle);
//        lblselect.setText(title);
//        lblselect.setText(title.replace("*", "").trim());
//
////        TextView dialogClear = (TextView) w.findViewById(R.id.dialogClear);
////        dialogClear.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                tv.setText("");
////                tv.setTag(null);
////
////                a.dismiss();
////            }
////        });
//
////        EditText editSearch = (EditText) w.findViewById(R.id.editSearch);
////        if (isFilterable) {
////            editSearch.setVisibility(View.VISIBLE);
////        } else {
////            editSearch.setVisibility(View.GONE);
////        }
//
//        String selectedStr = "";
//        int selectedId = 0;
//
////        if (tv == editIntensity) {
////            selectedStr = stoneParam.FancycolorIntensityList;
////        }
////        if (tv == editColor) {
////            selectedStr = stoneParam.FancyColorList;
////        }
////        if (tv == editOvertone) {
////            selectedStr = stoneParam.FancycolorOvertoneList;
////        }
//
//        if (!StringUtils.isEmpty(selectedStr)) {
//            ArrayList<String> selected = Utils.asList(selectedStr.replaceAll("", ""));
//
//            if (!selected.isEmpty()) {
//                for (int i = 0; i < data.size(); i++) {
//                    if (selected.contains(data.get(i).ID)) {
//                        data.get(i).setSelected(true);
//                    } else {
//                        data.get(i).setSelected(false);
//                    }
//                }
//            }
//        }
//
//
//        RecyclerView recyclerView = (RecyclerView) w.findViewById(R.id.recyclerView);
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(linearLayoutManager);
////        recyclerView.setLayoutAnimation(Utils.getRowFadeSpeedAnimation(getActivity()));
//        recyclerView.addItemDecoration(new SimpleListDividerDecorator(getResources().getDrawable(R.drawable.list_divider), true));
//
//
//        final SpinnerSelGrpAdapter adapter = new SpinnerSelGrpAdapter(getActivity());
////        adapter.setFilterable(isFilterable);
//        recyclerView.setAdapter(adapter);
//        adapter.addAll(data);
//
////        if (tv.getTag().toString().trim()!= null){
////            for (int i = 0; i <data.size() ; i++) {
////                if (tv.getTag().toString().trim().equals(data.get(i).ID)){
////                    Debug.e("Game Id" , data.get(i).ID);
////                }
////            }
////        }
//
//        adapter.setEventListener(new SpinnerSelGrpAdapter.EventListener() {
//            @Override
//            public void onItemViewClicked(int position) {
//                adapter.changeSelection(position, true);
//            }
//        });
//
////        for (int i = 0; i <data.size() ; i++) {
////            if (adapter.isSelectedAtleastOne()){
////                adapter.changeSelection(Integer.valueOf(data.get(i).ID), true);
////            }else{
////                adapter.changeSelection(Integer.valueOf(data.get(i).ID), false);
////            }
////        }
//
////        editSearch.addTextChangedListener(new TextWatcher() {
////            @Override
////            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////
////            }
////
////            @Override
////            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////
////            }
////
////            @Override
////            public void afterTextChanged(Editable editable) {
////                if (editable.toString().trim().length() >= 1) {
////                    adapter.getFilter().item_filter(editable.toString().trim());
////                } else {
////                    adapter.getFilter().item_filter("");
////                }
////
////            }
////        });
//
//        Button btnSpinnerOk = (Button) w.findViewById(R.id.btnPositive);
//        btnSpinnerOk.setOnClickListener(
//                new View.OnClickListener() {
//
//                    @Override
//                    public void onClick(View v) {
//                        ArrayList<Spinner> selList = adapter.getSelectedAll();
//                        tv.setText(adapter.getSelectedTitle());
//                        tv.setTag(adapter.getSelectedId());
//                        Debug.e("Selected Id ", "" + adapter.getSelectedId());
//
//                        if (selList.size() > 0) {
//                            tv.setTag(adapter.getSelectedIdArray());
//
//                        } else {
//                            tv.setTag(null);
//                        }
//
//                        if (callback != null) {
//                            callback.onDone(selList);
//                        }
//
//                        a.dismiss();
//                    }
//                }
//
//        );
//
//        Button btnSpinnerCancel = (Button) w
//                .findViewById(R.id.btnNegative);
//        btnSpinnerCancel.setOnClickListener(
//                new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        a.dismiss();
//                    }
//
//                }
//
//        );
//
//        a.show();
//    }

//    public void showSpinnerTeam(String title, final TextView tv,
//                               final ArrayList<Spinner> data, boolean isFilterable, final SpinnerCallback callback) {
//
//        final Dialog a = new Dialog(this);
//        Window w = a.getWindow();
//        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        a.setContentView(R.layout.spinner_team);
//        w.setBackgroundDrawableResource(android.R.color.transparent);
//
//        TextView lblselect = (TextView) w.findViewById(R.id.dialogtitle);
//        lblselect.setText(title);
//        lblselect.setText(title.replace("*", "").trim());
//
////        TextView dialogClear = (TextView) w.findViewById(R.id.dialogClear);
////        dialogClear.setOnClickListener(new View.OnClickListener() {
////            @Override
////            public void onClick(View view) {
////                tv.setText("");
////                tv.setTag(null);
////
////                a.dismiss();
////            }
////        });
//
////        EditText editSearch = (EditText) w.findViewById(R.id.editSearch);
////        if (isFilterable) {
////            editSearch.setVisibility(View.VISIBLE);
////        } else {
////            editSearch.setVisibility(View.GONE);
////        }
//
//        String selectedStr = "";
////        if (tv == editIntensity) {
////            selectedStr = stoneParam.FancycolorIntensityList;
////        }
////        if (tv == editColor) {
////            selectedStr = stoneParam.FancyColorList;
////        }
////        if (tv == editOvertone) {
////            selectedStr = stoneParam.FancycolorOvertoneList;
////        }
//
//        if (!StringUtils.isEmpty(selectedStr)) {
//            ArrayList<String> selected = Utils.asList(selectedStr.replaceAll("'", ""));
//
//            if (!selected.isEmpty()) {
//                for (int i = 0; i < data.size(); i++) {
//                    if (selected.contains(data.get(i).ID)) {
//                        data.get(i).setSelected(true);
//                    } else {
//                        data.get(i).setSelected(false);
//                    }
//                }
//            }
//        }
//
//        final SpinnerTeamAdapter adapter = new SpinnerTeamAdapter(getActivity());
//        adapter.setFilterable(isFilterable);
//        ListView lv = (ListView) w.findViewById(R.id.lvSpinner);
//        lv.setAdapter(adapter);
//        adapter.addAll(data);
//
//        lv.setOnItemClickListener(
//                new AdapterView.OnItemClickListener() {
//
//                    @Override
//                    public void onItemClick(AdapterView<?> adapterview, View view,
//                                            int position, long l) {
//                        adapter.changeSelection(position, true);
//                    }
//                }
//
//        );
//
////        editSearch.addTextChangedListener(new TextWatcher() {
////            @Override
////            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////
////            }
////
////            @Override
////            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
////
////            }
////
////            @Override
////            public void afterTextChanged(Editable editable) {
////                if (editable.toString().trim().length() >= 1) {
////                    adapter.getFilter().item_filter(editable.toString().trim());
////                } else {
////                    adapter.getFilter().item_filter("");
////                }
////
////            }
////        });
//
//
//        a.show();
//    }

//    public void showTimePicker(final EditText editText) {
//        TimePickerDialog.Builder builder = new TimePickerDialog.Builder(true ? R.style.Material_App_Dialog_TimePicker_Light : R.style.Material_App_Dialog_TimePicker, 24, 00) {
//            @Override
//            public void onPositiveActionClicked(DialogFragment fragment) {
//                TimePickerDialog dialog = (TimePickerDialog) fragment.getDialog();
////                String AM_PM;
////                if (dialog.getHour() < 12) {
////                    AM_PM = "AM";
////                } else {
////                    AM_PM = "PM";
////                }
////                editText.setText(dialog.getHour() + ":" + dialog.getMinute());
//                editText.setText(((dialog.getHour() < 10) ? "0" + dialog.getHour() : "" + dialog.getHour()) + ((dialog.getMinute() < 10) ? ":0" + dialog.getMinute() : ":" + dialog.getMinute()));
////                editText.setText(dialog.getHour() + ":" + dialog.getMinute());
////                editText.setText(date + " " + dialog.getHour() + ":" + dialog.getMinute());
////                Date selectedDate = Utils.parseTime(editText.getText().toString(), "dd MMM yyyy HH:mm");
////                Debug.e("showTimePicker", "" + Utils.parseTimeDefaultToUTC(selectedDate).toString());
////                long timestamp = Utils.parseTime((selectedDate).getTime());
////                Utils.parseTime(timestamp, DATE_FORMAT_SERVER);
////                Debug.e("showTimePicker", "" + Utils.parseTime(timestamp, DATE_FORMAT_SERVER));
////                // editText.setTag(Utils.parseTime(timestamp, DATE_FORMAT_SERVER));
////                editText.setTag(Utils.parseTime(timestamp, DATE_FORMAT_SERVER));
////                Debug.e("final date", "" + editText.getTag().toString());
////                Utils.parseTime(dialog.get)
////                Toast.makeText(mActivity, "Time is " + dialog.getFormattedTime(SimpleDateFormat.getTimeInstance()), Toast.LENGTH_SHORT).show();
////                editText.setText(Utils.parseTime(dialog.getFormattedTime(SimpleDateFormat.getTimeInstance()));
//                super.onPositiveActionClicked(fragment);
//            }
//
//            @Override
//            public void onNegativeActionClicked(DialogFragment fragment) {
////                Toast.makeText(mActivity, "Cancelled" , Toast.LENGTH_SHORT).show();
//                super.onNegativeActionClicked(fragment);
//            }
//        };
//
//        builder.positiveAction("OK")
//                .negativeAction("CANCEL");
//
//        DialogFragment fragment = DialogFragment.newInstance(builder);
//        fragment.show(getSupportFragmentManager(), null);
//
//    }
//
//
//    public void showDatePicker(final EditText editText) {
//        DatePickerDialog.Builder builder = null;
//        builder = new DatePickerDialog.Builder(R.style.Material_App_Dialog_DatePicker_Light) {
//            @Override
//            public void onPositiveActionClicked(DialogFragment fragment) {
//                DatePickerDialog dialog = (DatePickerDialog) fragment.getDialog();
//                // String date = dialog.getFormattedDate(SimpleDateFormat.getDateInstance());
//                editText.setText(Utils.parseTime(dialog.getDate(), "yyyy-MM-dd"));
//                super.onPositiveActionClicked(fragment);
//            }
//
//            @Override
//            public void onNegativeActionClicked(DialogFragment fragment) {
//                super.onNegativeActionClicked(fragment);
//            }
//
//        };
//
//        builder.positiveAction("" + getString(R.string.btn_ok))
//                .negativeAction("" + getString(R.string.btn_cancel));
//
//        Calendar calendarDate = Calendar.getInstance();
//        calendarDate.add(Calendar.DAY_OF_MONTH, 1);
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.YEAR, -60);
//
//        Calendar calendarNext = Calendar.getInstance();
//        calendarNext.add(Calendar.YEAR, 0);
//
//        builder.dateRange(calendar.getTimeInMillis(), calendarNext.getTimeInMillis());
//
//        // if (editText.getText().length() > 0) {
//        // builder.date(Utils.parseTime(editText.getText().toString(), DATE_FORMAT).getTime());
//        // }
//
//        DialogFragment fragment = DialogFragment.newInstance(builder);
//        fragment.show(getSupportFragmentManager(), null);
//    }
//
//    public void showDatePickerFromTomorrow(final EditText editText) {
//        DatePickerDialog.Builder builder = null;
//        builder = new DatePickerDialog.Builder(R.style.Material_App_Dialog_DatePicker_Light) {
//
//            @Override
//            public void onPositiveActionClicked(DialogFragment fragment) {
//                DatePickerDialog dialog = (DatePickerDialog) fragment.getDialog();
////                 String date = dialog.getFormattedDate(SimpleDateFormat.getDateInstance());
//                Date d = new Date();
////
////                if (!Utils.parseTime(dialog.getDate(), "yyyy-MM-dd").equals(Utils.parseTime(new Date().getTime(), "yyyy-MM-dd"))){
//                editText.setText(Utils.parseTime(dialog.getDate(), "yyyy-MM-dd"));
//                super.onPositiveActionClicked(fragment);
////                }else{
////                    showToast(getString(R.string.err_date), Toast.LENGTH_SHORT);
////                }
//
//            }
//
//            @Override
//            public void onNegativeActionClicked(DialogFragment fragment) {
//                super.onNegativeActionClicked(fragment);
//            }
//
//        };
//
//        builder.positiveAction("" + getString(R.string.btn_ok))
//                .negativeAction("" + getString(R.string.btn_cancel));
//
//        Calendar calendar = Calendar.getInstance();
//        calendar.add(Calendar.DAY_OF_MONTH, 0);
//
//        Calendar calendarNext = Calendar.getInstance();
//        calendarNext.add(Calendar.YEAR, 60);
//
//        builder.dateRange(calendar.getTimeInMillis(), calendarNext.getTimeInMillis());
//
//        // if (editText.getText().length() > 0) {
//        // builder.date(Utils.parseTime(editText.getText().toString(), DATE_FORMAT).getTime());
//        // }
//
//        DialogFragment fragment = DialogFragment.newInstance(builder);
//        fragment.show(getSupportFragmentManager(), null);
//    }

//    public void showAgAge(final EditText editText) {
//        showAgAge(editText, false);
//    }

//    ArrayList<Spinner> data = new ArrayList<Spinner>();
//
//    public void showShirtSize(final EditText editText, boolean isClear) {
//        data.clear();
//        data.add(new Spinner("1", "XS"));
//        data.add(new Spinner("2", "S"));
//        data.add(new Spinner("3", "M"));
//        data.add(new Spinner("4", "L"));
//        data.add(new Spinner("5", "XL"));
//        data.add(new Spinner("6", "2XL"));
//        showSpinner("Shirt Size", editText, data, false, isClear, null);
//    }
//
//    public void showShoeSize(final EditText editText, boolean isClear) {
//        ArrayList<Spinner> data = new ArrayList<Spinner>();
//
//        int j = 30;
//
//        for (int i = 1; i <= 21; i++) {
//            data.add(new Spinner("" + i, "" + j));
//            j++;
//        }
//        showSpinner("Shoe Size", editText, data, false, isClear, null);
//    }
//
//    public void showJerseyNumber(final EditText editText, boolean isClear) {
//        ArrayList<Spinner> data = new ArrayList<Spinner>();
//
//        for (int i = 1; i < 100; i++) {
//            data.add(new Spinner("" + i, "" + i));
//        }
//        showSpinner("Jersey Number", editText, data, false, isClear, null);
//    }
//
//    public void showPosition(final EditText editText, boolean isClear) {
//        data.clear();
//        data.add(new Spinner("1", "GK"));
//        data.add(new Spinner("2", "CB"));
//        data.add(new Spinner("3", "RB"));
//        data.add(new Spinner("4", "LB"));
//        data.add(new Spinner("5", "CM"));
//        data.add(new Spinner("6", "RM"));
//        data.add(new Spinner("7", "LM"));
//        data.add(new Spinner("8", "ST"));
//        showSpinner("Position", editText, data, false, isClear, null);
//    }
//
//    public void showPreferredFoot(final EditText editText, boolean isClear) {
//        data.clear();
//        data.add(new Spinner("1", "Left"));
//        data.add(new Spinner("2", "Right"));
//        showSpinner("Preferred Foot", editText, data, false, isClear, null);
//    }
//
//    public void showAgAge(final TextView textView, boolean isClear) {
//        data.clear();
//        data.add(new Spinner("1", "< 10"));
//        data.add(new Spinner("2", "< 12"));
//        data.add(new Spinner("3", "< 15"));
//        data.add(new Spinner("4", "< 18"));
//        data.add(new Spinner("5", "< 20"));
//        data.add(new Spinner("6", "21 – 30"));
//        data.add(new Spinner("7", "31 – 40"));
//        data.add(new Spinner("8", "> 40"));
//        showSpinner("Average Age", textView, data, false, isClear, null);
//    }


//    public void showState(final EditText editText, boolean isClear) {
//        data.clear();
//        data.add(new Spinner("1", "Johor"));
//        data.add(new Spinner("2", "Kedah"));
//        data.add(new Spinner("3", "Kelantan"));
//        data.add(new Spinner("4", "Melaka"));
//        data.add(new Spinner("5", "Negeri Sembilan"));
//        data.add(new Spinner("6", "Pahang"));
//        data.add(new Spinner("7", "Perak"));
//        data.add(new Spinner("8", "Perlis"));
//        data.add(new Spinner("9", "Penang"));
//        data.add(new Spinner("10", "Sabah"));
//        data.add(new Spinner("11", "Sarawak"));
//        data.add(new Spinner("12", "Selangor + Kuala Lumpur"));
//        data.add(new Spinner("13", "Terengganu"));
//        showSpinner("State", editText, data, false, isClear, null);
//    }

//    public void showCost(final EditText editText, boolean isClear) {
//        data.clear();
//        data.add(new Spinner("1", "0-100"));
//        data.add(new Spinner("2", "101-200"));
//        data.add(new Spinner("3", "201-400"));
//        data.add(new Spinner("4", "> 400"));
//        data.add(new Spinner("5", "Any"));
//        showSpinner("Cost", editText, data, false, isClear, null);
//    }


//    public void confirmLogout() {
//
//        MaterialDialog.Builder builder = new MaterialDialog.Builder(getActivity())
//                .title(R.string.logout_title)
//                .content(R.string.logout_msg)
//                .positiveText(R.string.btn_yes)
//                .negativeText(R.string.btn_no)
//                .onPositive(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//
//                        logout();
//
//
//                    }
//                }).onNegative(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//
//                    }
//                });
//
//        MaterialDialog dialog = builder.build();
//        dialog.show();
//    }
//    public void confirmGroundLogout() {
//
//        MaterialDialog.Builder builder = new MaterialDialog.Builder(getActivity())
//                .title(R.string.logout_title)
//                .content(R.string.logout_msg)
//                .positiveText(R.string.btn_yes)
//                .negativeText(R.string.btn_no)
//                .onPositive(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//
//                        logout();
//                        showToast("Successfully logged out.", Toast.LENGTH_SHORT);
//                        Utils.clearLoginCredetials(getActivity());
//                        LocalBroadcastManager.getInstance(getActivity()).sendBroadcast(new Intent(Constant.FINISH_ACTIVITY));
//                        Intent intent = new Intent(getActivity(), LoginTypeActivity.class);
//                        startActivity(intent);
//                    }
//                }).onNegative(new MaterialDialog.SingleButtonCallback() {
//                    @Override
//                    public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//
//                    }
//                });
//
//        MaterialDialog dialog = builder.build();
//        dialog.show();
//    }


//    public void logout() {
//        try {
//
//            showDialog("");
//
//            RequestParams params = RequestParamsUtils.newRequestParams(getActivity());
//
//            AsyncHttpClient clientPhotos = AsyncHttpRequest.newRequest(getActivity());
//            Debug.e("", "" + params.toString());
//            clientPhotos.get(URLs.LOG_OUT(), params, new AsyncResponseHandler(getActivity()) {
//                @Override
//                public void onSuccess(String content) {
//
//                }
//
//                @Override
//                public void onFailure(Throwable e, String content) {
//
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }



//    private void checkUpdate(CheckAppVersion checkAppVersion) {
//
//        if (checkAppVersion.data.android.maintananance) {
//            Intent intent = new Intent(getApplicationContext(), MaintenanceActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(intent);
//        } else {
//            if (checkAppVersion.data.android.checkForUpdate) {
//                if (checkAppVersion.data.android.compulsoryUpdate) {
//
//                }
//            } else {
//
//            }
//        }


//        int versionNumber = Utils.getAppVersionCode(getActivity());
//        if (versionNumber != Integer.valueOf(checkAppVersion.data.android.versionNumber)) {
//            if (checkAppVersion.data.android.checkForUpdate) {
////                if (versionNumber != Integer.valueOf(checkAppVersion.data.android.versionNumber))
//                    if (checkAppVersion.data.android.maintananance) {
////                        if (checkAppVersion.data.android.compulsoryUpdate){
////                            showUpdateDialog(false, checkAppVersion.data.android.message);
////                            return;
////                        }
//                        Intent intent = new Intent(getApplicationContext(), MaintenanceActivity.class);
//                        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(intent);
//                    } else {
//                        if (checkAppVersion.data.android.compulsoryUpdate) {
//                            showUpdateDialog(false, checkAppVersion.data.android.message);
//                            return;
//                        } else {
//                            showUpdateDialog(true, checkAppVersion.data.android.message);
//                            return;
//                        }
//                    }
//            }
//        }

//        if (isRetry) {
//            finishActivity();
//            Intent intent = new Intent(getApplicationContext(), SplashActivity.class);
//            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//            startActivity(intent);
//        }

//    }



//    LocationUpdateReciever locationUpdateReciever;
//
//
//    public void startUpdatingLocation() {
//
//
//        IntentFilter intentFilter = new IntentFilter();
//        intentFilter.addAction(Constant.LOCATION_UPDATED);
//
//        locationUpdateReciever = new LocationUpdateReciever();
//        LocalBroadcastManager.getInstance(this).registerReceiver(
//                locationUpdateReciever, intentFilter);
//
//        updateUserLocation();
//
//    }
//
//    public void updateUserLocation() {
//        if (locationService != null) {
//            locationService.stopLocationUpdates();
//            locationService.stop();
//        }
//
//        locationService = new LocationService("Location Update");
//        locationService.setOneTime(false);
//        locationService.setInterval(5 * 1000);
//        locationService.setFastestInterval(5 * 1000);
//        locationService.init(getActivity());
//
//    }
//
//
//    class LocationUpdateReciever extends BroadcastReceiver {
//
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            try {
//                if (intent.getAction().equalsIgnoreCase(
//                        Constant.LOCATION_UPDATED)) {
//
//                    if (intent.getStringExtra(LocationService.TOKEN).equals("Location Update")) {
//                        Double liveLat = Double.valueOf(Utils.getPref(getActivity(), Constant.USER_LATITUDE, ""));
//                        Double liveLng = Double.valueOf(Utils.getPref(getActivity(), Constant.USER_LONGITUDE, ""));
//                        Debug.e("liveLat-->", "" + liveLat);
//                        Debug.e("liveLng-->", "" + liveLng);
//                        if (liveLng != null && liveLat != null) {
////                            updateUserLocation(liveLat, liveLng);
//                        }
//
//                    }
//
//                }
//
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    public ArrayList<Spinner> getCountryCodes() {
//        ArrayList<Spinner> data = new ArrayList<>();
//        List<Country> countryList = Utils.getAllCountries(getActivity());
//
//        for (Country country : countryList) {
////                    String[] countryFullName = country.getName().trim().split(":");
//            data.add(new Spinner("" + country.getCode(), country.getName()));
//        }
//
//        return data;
//
//    }
//
//    public ArrayList<Spinner> getCity() {
//        ArrayList<Spinner> data = new ArrayList<>();
//        CityRes city = Utils.getCity(getActivity());
//
//        for (int i = 0; i < city.data.size(); i++) {
//            data.add(new Spinner("" + city.data.get(i).id, city.data.get(i).cityName));
//        }
//
//        return data;
//
//    }
//
//    public void showSpinnerImage(String title, final TextView tv,
//                                 final ArrayList<Spinner> data, boolean isFilterable, final SpinnerCallback callback) {
//
//        final Dialog a = new Dialog(getActivity());
//        Window w = a.getWindow();
//        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        a.setContentView(R.layout.spinner);
//        w.setBackgroundDrawableResource(android.R.color.transparent);
//
//        TextView lblselect = (TextView) w.findViewById(R.id.dialogtitle);
//        lblselect.setText(title.replace("*", "").trim());
//
//        TextView dialogClear = (TextView) w.findViewById(R.id.dialogClear);
//        dialogClear.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tv.setText("");
//                tv.setTag(null);
//
//                a.dismiss();
//            }
//        });
//
//        final EditText editSearch = (EditText) w.findViewById(R.id.editSearch);
//        if (isFilterable) {
//            editSearch.setVisibility(View.VISIBLE);
//        } else {
//            editSearch.setVisibility(View.GONE);
//        }
//
//        final ImageSpinnerAdapter adapter = new ImageSpinnerAdapter(getActivity());
//        adapter.setFilterable(isFilterable);
//        ListView lv = (ListView) w.findViewById(R.id.lvSpinner);
//        lv.setAdapter(adapter);
//        adapter.addAll(data);
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterview, View view,
//                                    int position, long l) {
//                ArrayList<Spinner> selList = new ArrayList<Spinner>();
//                selList.add(adapter.getItem(position));
//
//                tv.setText(adapter.getItem(position).title);
//                tv.setTag(adapter.getItem(position).ID);
//
//                if (callback != null) {
//                    callback.onDone(selList);
//                }
//
//                a.dismiss();
//
//            }
//        });
//
//        editSearch.addTextChangedListener(new TextWatcher() {
//
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.toString().trim().length() >= 1) {
//                    adapter.getFilter().item_filter(editable.toString().trim());
//                } else {
//                    adapter.getFilter().item_filter("");
//                }
//
//            }
//        });
//
//        a.show();
//    }
//
//    public Runnable postLocationDialog = new Runnable() {
//
//        @Override
//        public void run() {
//
//            MaterialDialog.Builder builder = new MaterialDialog.Builder(getActivity())
//                    .title(R.string.location_title)
//                    .content(R.string.location_msg)
//                    .positiveText(R.string.btn_settings)
//                    .negativeText(R.string.btn_retry)
//                    .onPositive(new MaterialDialog.SingleButtonCallback() {
//                        @Override
//                        public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//                            try {
//                                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
//                                startActivity(intent);
//                                finish();
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }).onNegative(new MaterialDialog.SingleButtonCallback() {
//                        @Override
//                        public void onClick(MaterialDialog materialDialog, DialogAction dialogAction) {
//                            if (!Utils.isLocationProviderEnabled(getActivity())) {
//                                new Handler().post(postLocationDialog);
//                            }
//                        }
//                    });
//
//            MaterialDialog dialog = builder.build();
//            dialog.show();
//
//        }
//    };
//
//    LocationService locationService;
//
//    public void updateLocation() {
//        if (locationService != null) {
//            locationService.stopLocationUpdates();
//            locationService.stop();
//        }
//
//        locationService = new LocationService("Location Update");
//        locationService.setOneTime(false);
//        locationService.setInterval(60 * 1000);
//        locationService.setFastestInterval(60 * 1000);
//        locationService.init(getActivity());
//    }
////
//    class LocationReceiver extends BroadcastReceiver {
//
//        @Override
//        public void onReceive(Context context, Intent intent) {
//
//            try {
//                if (intent.getAction().equalsIgnoreCase(
//                        Constant.LOCATION_UPDATED)) {
//
//                    if (intent.getExtras().getString(LocationService.TOKEN).equalsIgnoreCase("Location Update")) {
//
//                        String lon = Utils.getPref(context, Constant.USER_LONGITUDE, "");
//                        String lat = Utils.getPref(context, Constant.USER_LATITUDE, "");
//                    }
//
//                }
//            } catch (NumberFormatException e) {
//                e.printStackTrace();
//            }
//
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        updateLocation();
//    }


//
//    public void getAllCity() {
//        try {
//            showDialog("");
//
//            RequestParams params = RequestParamsUtils.newRequestParams(getActivity());
//
//            Debug.e("getAllCity", "" + params.toString());
//            AsyncHttpClient clientPhotos = AsyncHttpRequest.newRequest(getActivity());
//            clientPhotos.post(URLs.GET_ALL_CITIES(), params, new GetVersionWDataHandler(getActivity()));
//        } catch (
//                Exception e)
//
//        {
//            e.printStackTrace();
//        }
//    }
//
//    private class GetVersionWDataHandler extends AsyncResponseHandler {
//
//        public GetVersionWDataHandler(Activity context) {
//            super(context);
//        }
//
//        @Override
//        public void onStart() {
//            super.onStart();
//        }
//
//        @Override
//        public void onFinish() {
//            super.onFinish();
//            try {
//                dismissDialog();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        @Override
//        public void onSuccess(String response) {
//
//            try {
//                Debug.e("", "getAllCity# " + response);
//                if (response != null && response.length() > 0) {
//                    CityRes login = new Gson().fromJson(
//                            response, new TypeToken<CityRes>() {
//                            }.getType());
//
//                    if (login.status == 1) {
//                        Utils.setPref(getActivity(), Constant.CITY_INFO, response);
//
//                    } else {
//                        showToast(login.message, Toast.LENGTH_SHORT);
//                    }
//                }
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//
//        }
//
//        @Override
//        public void onFailure(Throwable e, String content) {
//            dismissDialog();
//        }
//
//    }

//    public void showPicture() {
//
//        final Dialog a = new Dialog(getActivity());
//        Window w = a.getWindow();
//        a.requestWindowFeature(Window.FEATURE_NO_TITLE);
//        a.setContentView(R.layout.spinner);
//        w.setBackgroundDrawableResource(android.R.color.transparent);
//
//        TextView lblselect = (TextView) w.findViewById(R.id.dialogtitle);
//        lblselect.setTypeface(Utils.getBold(getActivity()));
//        lblselect.setText("Choose");
//
////        w.findViewById(R.id.dialogClear).setVisibility(View.GONE);
////        w.findViewById(R.id.editSearch).setVisibility(View.GONE);
//
//        final EditText editSearch = (EditText) w.findViewById(R.id.editSearch);
//        editSearch.setVisibility(View.GONE);
//
//        SpinnerAdapter adapter = new SpinnerAdapter(getActivity());
//        ListView lv = (ListView) w.findViewById(R.id.lvSpinner);
//        lv.setAdapter(adapter);
//        adapter.add(new Spinner("1", getString(R.string.choose_gallery)));
//        adapter.add(new Spinner("2", getString(R.string.choose_camera)));
//
//        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> adapterview, View view,
//                                    int position, long l) {
//
//                a.dismiss();
//                if (position == 0) {
//
//                    Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
//                    intent.setType("image/*");
//                    intent.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
//                    intent.addCategory(Intent.CATEGORY_OPENABLE);
//
//                    try {
//                        startActivityForResult(Intent.createChooser(intent,
//                                "Select"), REQ_PICK_IMAGE);
//
//                    } catch (Exception ex) {
//                        showToast(getString(R.string.err_file_manager),
//                                Toast.LENGTH_SHORT);
//                    }
//
//                } else if (position == 1) {
//
//                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//                    intent.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
//                    intent.putExtra(MediaStore.EXTRA_FINISH_ON_COMPLETION, true);
//                    fileUri = new File(Utils.getOutputMediaFile().getAbsolutePath());
//                    intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(fileUri));
//
//                    try {
//
//                        startActivityForResult(Intent.createChooser(intent,
//                                "Select"), REQ_CAPTURE_IMAGE);
//
//                    } catch (Exception ex) {
//                        showToast(getString(R.string.err_file_manager),
//                                Toast.LENGTH_SHORT);
//                    }
//
//                }
//            }
//        });
//
//        a.show();
//    }
//
//    File fileUri;
//    public static final int REQ_CAPTURE_IMAGE = 4470;
//    public static final int REQ_PICK_IMAGE = 4569;
//
//    @SuppressWarnings("unchecked")
//    @Override
//    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        try {
//            Debug.e("", "requestCode# " + requestCode + " resultCode# "
//                    + resultCode);
//
//            if (requestCode == REQ_CAPTURE_IMAGE) {
//
//                if (resultCode == Activity.RESULT_OK) {
//                    try {
//                        if (fileUri == null || !fileUri.exists()) {
//                            Uri tmp_fileUri = data.getData();
//                            Debug.e("", "tmp_fileUri : " + tmp_fileUri.getPath());
//                            // Debug.e("", "fileUri : " + fileUri.getPath());
//
//                            String selectedImagePath = UriHelper.getPath(
//                                    getActivity(), tmp_fileUri);
//                            fileUri = new File(selectedImagePath);
//
//                        } else {
//
//                        }
//
//                        if (fileUri != null && fileUri.exists()) {
//                            if (Utils.isJPEGorPNG(fileUri.getAbsolutePath())) {
////                              startCropActivity(Uri.fromFile(fileUri));
//                                Intent intent = new Intent(getActivity(), ImageDisplayActivity.class);
//                                intent.putExtra("imageUri", fileUri);
//                                startActivity(intent);
//
//                            } else {
//                                showToast("Select PNG or JPEG file only", Toast.LENGTH_SHORT);
//                            }
//                        }
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
////                    if (requestCode == REQ_CAPTURE_IMAGE1) {
////                        imageLoader.displayImage("file://" + fileUri.getAbsolutePath(), imgPollOp1);
////                        imgPollOp1.setTag(fileUri);
////
////                    } else if (requestCode == REQ_CAPTURE_IMAGE2) {
////                        imageLoader.displayImage("file://" + fileUri.getAbsolutePath(), imgPollOp2);
////                        imgPollOp2.setTag(fileUri);
////                    }
//
//                }
//            } else if (requestCode == REQ_PICK_IMAGE) {
//
//                if (resultCode == Activity.RESULT_OK) {
//
//                    Uri tmp_fileUri = data.getData();
//                    Debug.e("", "tmp_fileUri : " + tmp_fileUri.getPath());
//
//                    String selectedImagePath = UriHelper.getPath(getActivity(),
//                            tmp_fileUri);
//                    fileUri = new File(selectedImagePath);
//
//                    startCropActivity(tmp_fileUri);
//
////                    if (requestCode == REQ_PICK_IMAGE1) {
////                        imageLoader.displayImage("file://" + fileUri.getAbsolutePath(), imgPollOp1);
////                        imgPollOp1.setTag(fileUri);
////
////                    } else if (requestCode == REQ_PICK_IMAGE2) {
////                        imageLoader.displayImage("file://" + fileUri.getAbsolutePath(), imgPollOp2);
////                        imgPollOp2.setTag(fileUri);
////
////                    }
//
//                }
//            } else if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
//                CropImage.ActivityResult result = CropImage.getActivityResult(data);
//                if (resultCode == RESULT_OK) {
//                    Uri resultUri = result.getUri();
//
//                    String selectedImagePath = UriHelper.getPath(
//                            getActivity(), resultUri);
//                    fileUri = new File(selectedImagePath);
//
//                    Debug.e("", "fileUri : " + fileUri.getAbsolutePath());
////                    imageLoader.displayImage("file://" + fileUri.getAbsolutePath(), imgTeamProfile);
//
////                    imageLoader.displayImage("file://" + fileUri.getAbsolutePath(), imgUserProfile);
////                    imgUserProfile.setTag(fileUri);
//
//                } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
//                    Exception error = result.getError();
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void startCropActivity(Uri tmp_fileUri) {
//        CropImage.activity(tmp_fileUri)
//                .setGuidelines(CropImageView.Guidelines.OFF)
//                .setAllowRotation(true)
//                .setFixAspectRatio(true)
//                .start(this);
//    }


}
