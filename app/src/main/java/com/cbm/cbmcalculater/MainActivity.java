package com.cbm.cbmcalculater;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.cbm.cbmcalculater.object.Value;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements AdapterView.OnItemSelectedListener {
    String unit;
    Double length, width, height, noBox, onefit, twoft, threeft, mul, cbm, cft;
    //    final ArrayList<Integer> values = new ArrayList<>();
    final ArrayList<Value> valueArrayList = new ArrayList<>();
    //    List<JSONObject> jsonArray = new ArrayList<>();
    String stringBuffer;

    @BindView(R.id.llAddCustomView)
    ViewGroup llAddCustomView;
    @BindView(R.id.Spinner)
    Spinner Spinner;
    @BindView(R.id.btnAddMore)
    Button btnAddMore;
    @BindView(R.id.btnRemove)
    Button btnRemove;
    @BindView(R.id.btnReset)
    Button btnReset;
    @BindView(R.id.btnCbm)
    TextView btnCbm;
    @BindView(R.id.btnCft)
    TextView btnCft;
    @BindView(R.id.tvCbm)
    TextView tvCbm;
    @BindView(R.id.tvCft)
    TextView tvCft;
    @BindView(R.id.editCft)
    EditText editCft;
    @BindView(R.id.editCbm)
    EditText editCbm;
    @BindView(R.id.tvFirstFt)
    TextView tvFirstFt;
    @BindView(R.id.editFirstFt)
    EditText editFirstFt;
    @BindView(R.id.tvSecondFt)
    TextView tvSecondFt;
    @BindView(R.id.etSecondFt)
    EditText etSecondFt;
    @BindView(R.id.tvThirdFt)
    TextView tvThirdFt;
    @BindView(R.id.etThirdFt)
    EditText etThirdFt;
    @BindView(R.id.tvTitle)
    TextView tvTitle;

    int maxView = 10;
    int cView = 1;
    int finalTotal;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        init();

    }

    private void init() {
        Spinner.setOnItemSelectedListener(this);
        tvTitle.setText("CBM Calculater");


//        btnCbm.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                length = Double.parseDouble(editLength.getText().toString());
////                width = Double.parseDouble(editWidth.getText().toString());
////                height = Double.parseDouble(editHeight.getText().toString());
////                noBox = Double.parseDouble(editNoBox.getText().toString());
//                onefit = Double.parseDouble(tvFirstFt.getText().toString());
//                twoft = Double.parseDouble(tvSecondFt.getText().toString());
//                threeft = Double.parseDouble(tvThirdFt.getText().toString());
//                hideSoftKeyboard(getActivity());
//                if (unit.equalsIgnoreCase("mm")) {
////                    mul = (length * 0.001) * (width * 0.001) * (height * 0.001) * (noBox);
//                    mul = Double.valueOf(finalTotal) * 0.001;
//
//                    String stringdouble = Double.toString(mul);
//                    editCbm.setText(Double.toString(mul));
//                    Double firstdouble = (onefit - mul);
//                    String first = Double.toString(firstdouble);
//                    editFirstFt.setText(first.toString());
//                    Double seconddouble = (twoft - mul);
//                    String second = Double.toString(seconddouble);
//                    etSecondFt.setText(second.toString());
//                    Double thirddouble = (threeft - mul);
//                    String third = Double.toString(thirddouble);
//                    etThirdFt.setText(third.toString());
//                }
//
//                if (unit.equalsIgnoreCase("cm")) {
//                    mul = Double.valueOf(finalTotal) * 0.01;
////                    mul = (length * 0.01) * (width * 0.01) * (height * 0.01) * (noBox);
//                    String stringdouble = Double.toString(mul);
//                    editCbm.setText(stringdouble.toString());
//                    Double firstdouble = (onefit - mul);
//                    String first = Double.toString(firstdouble);
//                    editFirstFt.setText(first.toString());
//                    Double seconddouble = (twoft - mul);
//                    String second = Double.toString(seconddouble);
//                    etSecondFt.setText(second.toString());
//                    Double thirddouble = (threeft - mul);
//                    String third = Double.toString(thirddouble);
//                    etThirdFt.setText(third.toString());
//
//                }
//
//                if (unit.equalsIgnoreCase("m")) {
//                    mul = Double.valueOf(finalTotal);
////                    mul = (length) * (width) * (height) * (noBox);
//                    String stringdouble = Double.toString(mul);
//                    editCbm.setText(stringdouble.toString());
//                    Double firstdouble = (onefit - mul);
//                    String first = Double.toString(firstdouble);
//                    editFirstFt.setText(first.toString());
//                    Double seconddouble = (twoft - mul);
//                    String second = Double.toString(seconddouble);
//                    etSecondFt.setText(second.toString());
//                    Double thirddouble = (threeft - mul);
//                    String third = Double.toString(thirddouble);
//                    etThirdFt.setText(third.toString());
//                }
//
//                if (unit.equalsIgnoreCase("inch")) {
//                    mul = Double.valueOf(finalTotal) * 0.0254;
////                    mul = (length * 0.0254) * (width * 0.0254) * (height * 0.0254) * (noBox);
//                    String stringdouble = Double.toString(mul);
//                    editCbm.setText(stringdouble.toString());
//                    Double firstdouble = (onefit - mul);
//                    String first = Double.toString(firstdouble);
//                    editFirstFt.setText(first.toString());
//                    Double seconddouble = (twoft - mul);
//                    String second = Double.toString(seconddouble);
//                    etSecondFt.setText(second.toString());
//                    Double thirddouble = (threeft - mul);
//                    String third = Double.toString(thirddouble);
//                    etThirdFt.setText(third.toString());
//                }
//
//                if (unit.equalsIgnoreCase("foot")) {
//                    mul = Double.valueOf(finalTotal) * 0.3048;
////                    mul = (length * 0.3048) * (width * 0.3048) * (height * 0.3048) * (noBox);
//                    String stringdouble = Double.toString(mul);
//                    editCbm.setText(stringdouble.toString());
//                    Double firstdouble = (onefit - mul);
//                    String first = Double.toString(firstdouble);
//                    editFirstFt.setText(first.toString());
//                    Double seconddouble = (twoft - mul);
//                    String second = Double.toString(seconddouble);
//                    etSecondFt.setText(second.toString());
//                    Double thirddouble = (threeft - mul);
//                    String third = Double.toString(thirddouble);
//                    etThirdFt.setText(third.toString());
//                }
//
//                if (unit.equalsIgnoreCase("yard")) {
//                    mul = Double.valueOf(finalTotal) * 0.9144;
////                    mul = (length * 0.9144) * (width * 0.9144) * (height * 0.9144) * (noBox);
//                    String stringdouble = Double.toString(mul);
//                    editCbm.setText(stringdouble.toString());
//                    Double firstdouble = (onefit - mul);
//                    String first = Double.toString(firstdouble);
//                    editFirstFt.setText(first.toString());
//                    Double seconddouble = (twoft - mul);
//                    String second = Double.toString(seconddouble);
//                    etSecondFt.setText(second.toString());
//                    Double thirddouble = (threeft - mul);
//                    String third = Double.toString(thirddouble);
//                    etThirdFt.setText(third.toString());
//                }
//            }
//        });


        btnCft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideSoftKeyboard(getActivity());
                cbm = Double.parseDouble(editCbm.getText().toString());
                cft = (cbm) * 35.3147;
                String stringdouble = Double.toString(cft);
                editCft.setText(stringdouble);
            }
        });


        addScoreUI(maxView, cView);
    }


    private void addScoreUI(final int maxView, final int position) {

        cView = position;

        final LayoutInflater inflater = getLayoutInflater();
        final View view1 = inflater.inflate(R.layout.row, null);
        llAddCustomView.addView(view1, (cView - 1));

        if (position > 1) {
            btnRemove.setVisibility(View.VISIBLE);
        }

        final EditText editLength = (EditText) view1.findViewById(R.id.editLength);
        final EditText editNoBox = (EditText) view1.findViewById(R.id.editNoBox);
        final EditText editWidth = (EditText) view1.findViewById(R.id.editWidth);
        final EditText editHeight = (EditText) view1.findViewById(R.id.editHeight);

        editLength.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable sEditable) {
                String boxno = editNoBox.getText().toString().trim();
                String length = editLength.getText().toString().trim();
                String width = editWidth.getText().toString().trim();
                String hie = editHeight.getText().toString().trim();


                insurtValue(position, boxno, length, width, hie);

            }
        });
//
        editNoBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String boxno = editNoBox.getText().toString().trim();
                String length = editLength.getText().toString().trim();
                String width = editWidth.getText().toString().trim();
                String hie = editHeight.getText().toString().trim();


                insurtValue(position, boxno, length, width, hie);

//                insurtValue(position, boxno, length, width, hie);
            }
        });

        editWidth.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String boxno = editNoBox.getText().toString().trim();
                String length = editLength.getText().toString().trim();
                String width = editWidth.getText().toString().trim();
                String hie = editHeight.getText().toString().trim();


                insurtValue(position, boxno, length, width, hie);
            }
        });

        editHeight.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String boxno = editNoBox.getText().toString().trim();
                String length = editLength.getText().toString().trim();
                String width = editWidth.getText().toString().trim();
                String hie = editHeight.getText().toString().trim();

                insurtValue(position, boxno, length, width, hie);
            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                cView--;
                if (llAddCustomView != null) {
                    llAddCustomView.removeViewAt(cView);
                }
                if (editNoBox.getText().toString().length() > 0 || editLength.getText().toString().length() > 0
                        || editWidth.getText().toString().length() > 0 || editHeight.getText().toString().length() > 0) {
                    valueArrayList.remove(cView);
                }
                if (cView == 1) {
                    btnRemove.setVisibility(View.GONE);
                }

            }
        });


        btnAddMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (cView == position) {
                    if (editNoBox.getText().toString().trim().length() <= 0) {
                        showToast("Enter No of Box.", Toast.LENGTH_LONG);
                    } else if (editLength.getText().toString().trim().length() <= 0) {
                        showToast("Enter Length First ", Toast.LENGTH_LONG);
                    } else if (editWidth.getText().toString().trim().length() <= 0) {
                        showToast("Enter Width First ", Toast.LENGTH_LONG);
                    } else if (editHeight.getText().toString().trim().length() <= 0) {
                        showToast("Enter Heigth First ", Toast.LENGTH_LONG);
                    } else {
                        addScoreUI(maxView, (cView + 1));
                    }
                } else {
                    addScoreUI(maxView, (cView + 1));
                }
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cView == 1) {
                    editNoBox.getText().clear();
                    editLength.getText().clear();
                    editWidth.getText().clear();
                    editHeight.getText().clear();
                    editCbm.getText().clear();
                    editCft.getText().clear();
                    editFirstFt.getText().clear();
                    etSecondFt.getText().clear();
                    etThirdFt.getText().clear();
                } else {
                    llAddCustomView.removeAllViews();
                    btnRemove.setVisibility(View.GONE);
                    editCbm.getText().clear();
                    editCft.getText().clear();
                    editFirstFt.getText().clear();
                    etSecondFt.getText().clear();
                    etThirdFt.getText().clear();
                    int maxView = 10;
                    int cView = 1;
                    addScoreUI(maxView, cView);
                }
            }
        });

        btnCbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int totalValue = 0;

                if (cView == position) {
                    if (editNoBox.getText().toString().trim().length() <= 0) {
                        showToast("Enter No of Box.", Toast.LENGTH_LONG);
                    } else if (editLength.getText().toString().trim().length() <= 0) {
                        showToast("Enter Length First ", Toast.LENGTH_LONG);
                    } else if (editWidth.getText().toString().trim().length() <= 0) {
                        showToast("Enter Width First ", Toast.LENGTH_LONG);
                    } else if (editHeight.getText().toString().trim().length() <= 0) {
                        showToast("Enter Heigth First ", Toast.LENGTH_LONG);
                    } else {
                        for (int i = 0; i < valueArrayList.size(); i++) {

                            int boxNo = Integer.valueOf(valueArrayList.get(i).boxNo);
                            int length = Integer.valueOf(valueArrayList.get(i).length);
                            int width = Integer.valueOf(valueArrayList.get(i).width);
                            int height = Integer.valueOf(valueArrayList.get(i).height);

                            totalValue = totalValue + (boxNo * length * width * height);
                        }
                    }
                } else {
                    for (int i = 0; i < valueArrayList.size(); i++) {

                        int boxNo = Integer.valueOf(valueArrayList.get(i).boxNo);
                        int length = Integer.valueOf(valueArrayList.get(i).length);
                        int width = Integer.valueOf(valueArrayList.get(i).width);
                        int height = Integer.valueOf(valueArrayList.get(i).height);

                        totalValue = totalValue + (boxNo * length * width * height);
                    }
                }
                finalTotal = totalValue;
                Log.e("final Total -->> ", "" + finalTotal);


                onefit = Double.parseDouble(tvFirstFt.getText().toString());
                twoft = Double.parseDouble(tvSecondFt.getText().toString());
                threeft = Double.parseDouble(tvThirdFt.getText().toString());
                hideSoftKeyboard(getActivity());
                if (unit.equalsIgnoreCase("mm")) {
//                    mul = (length * 0.001) * (width * 0.001) * (height * 0.001) * (noBox);
                    mul = Double.valueOf(finalTotal) * 0.001;

                    String stringdouble = Double.toString(mul);
                    editCbm.setText(Double.toString(mul));
                    Double firstdouble = (onefit - mul);
                    String first = Double.toString(firstdouble);
                    editFirstFt.setText(first.toString());
                    Double seconddouble = (twoft - mul);
                    String second = Double.toString(seconddouble);
                    etSecondFt.setText(second.toString());
                    Double thirddouble = (threeft - mul);
                    String third = Double.toString(thirddouble);
                    etThirdFt.setText(third.toString());
                }

                if (unit.equalsIgnoreCase("cm")) {
                    mul = Double.valueOf(finalTotal) * 0.01;
//                    mul = (length * 0.01) * (width * 0.01) * (height * 0.01) * (noBox);
                    String stringdouble = Double.toString(mul);
                    editCbm.setText(stringdouble.toString());
                    Double firstdouble = (onefit - mul);
                    String first = Double.toString(firstdouble);
                    editFirstFt.setText(first.toString());
                    Double seconddouble = (twoft - mul);
                    String second = Double.toString(seconddouble);
                    etSecondFt.setText(second.toString());
                    Double thirddouble = (threeft - mul);
                    String third = Double.toString(thirddouble);
                    etThirdFt.setText(third.toString());

                }

                if (unit.equalsIgnoreCase("m")) {
                    mul = Double.valueOf(finalTotal);
//                    mul = (length) * (width) * (height) * (noBox);
                    String stringdouble = Double.toString(mul);
                    editCbm.setText(stringdouble.toString());
                    Double firstdouble = (onefit - mul);
                    String first = Double.toString(firstdouble);
                    editFirstFt.setText(first.toString());
                    Double seconddouble = (twoft - mul);
                    String second = Double.toString(seconddouble);
                    etSecondFt.setText(second.toString());
                    Double thirddouble = (threeft - mul);
                    String third = Double.toString(thirddouble);
                    etThirdFt.setText(third.toString());
                }

                if (unit.equalsIgnoreCase("inch")) {
                    mul = Double.valueOf(finalTotal) * 0.0254;
//                    mul = (length * 0.0254) * (width * 0.0254) * (height * 0.0254) * (noBox);
                    String stringdouble = Double.toString(mul);
                    editCbm.setText(stringdouble.toString());
                    Double firstdouble = (onefit - mul);
                    String first = Double.toString(firstdouble);
                    editFirstFt.setText(first.toString());
                    Double seconddouble = (twoft - mul);
                    String second = Double.toString(seconddouble);
                    etSecondFt.setText(second.toString());
                    Double thirddouble = (threeft - mul);
                    String third = Double.toString(thirddouble);
                    etThirdFt.setText(third.toString());
                }

                if (unit.equalsIgnoreCase("foot")) {
                    mul = Double.valueOf(finalTotal) * 0.3048;
//                    mul = (length * 0.3048) * (width * 0.3048) * (height * 0.3048) * (noBox);
                    String stringdouble = Double.toString(mul);
                    editCbm.setText(stringdouble.toString());
                    Double firstdouble = (onefit - mul);
                    String first = Double.toString(firstdouble);
                    editFirstFt.setText(first.toString());
                    Double seconddouble = (twoft - mul);
                    String second = Double.toString(seconddouble);
                    etSecondFt.setText(second.toString());
                    Double thirddouble = (threeft - mul);
                    String third = Double.toString(thirddouble);
                    etThirdFt.setText(third.toString());
                }

                if (unit.equalsIgnoreCase("yard")) {
                    mul = Double.valueOf(finalTotal) * 0.9144;
//                    mul = (length * 0.9144) * (width * 0.9144) * (height * 0.9144) * (noBox);
                    String stringdouble = Double.toString(mul);
                    editCbm.setText(stringdouble.toString());
                    Double firstdouble = (onefit - mul);
                    String first = Double.toString(firstdouble);
                    editFirstFt.setText(first.toString());
                    Double seconddouble = (twoft - mul);
                    String second = Double.toString(seconddouble);
                    etSecondFt.setText(second.toString());
                    Double thirddouble = (threeft - mul);
                    String third = Double.toString(thirddouble);
                    etThirdFt.setText(third.toString());
                }
            }
        });

        if (maxView == position) {
            btnAddMore.setVisibility(View.GONE);
            return;
        }
    }

    public void insurtValue(int i, String boxno, String length, String width, String hie) {

        if (boxno.length() <= 0) {
            boxno = "1";
        } else if (length.length() <= 0) {
            length = "1";
        } else if (width.length() <= 0) {
            width = "1";
        } else if (hie.length() <= 0) {
            hie = "1";
        }

        try {
            if (valueArrayList.size() > 0) {
                if (i > valueArrayList.size()) {

                    valueArrayList.add(new Value(boxno, length, width, hie));
                } else {
                    valueArrayList.get(i - 1);
                    valueArrayList.set(i - 1, new Value(boxno, length, width, hie));
                }
            } else {
                valueArrayList.add(new Value(boxno, length, width, hie));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        unit = parent.getItemAtPosition(position).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public static void hideSoftKeyboard(Context context) {
        if (((Activity) context).getCurrentFocus() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(INPUT_METHOD_SERVICE);
            inputMethodManager.hideSoftInputFromWindow(((Activity) context).getCurrentFocus().getWindowToken(), 0);
        }
    }
}
