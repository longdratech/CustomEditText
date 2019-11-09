package com.thl.tranhuulong.solardc;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DefaultEditText extends RelativeLayout {

    private RelativeLayout mRelativeLayout;
    private TextView mTextCell;
    private  View view;

    private String mValeCell;

    public DefaultEditText(Context context) {
        super(context);
        init(null);
    }

    public DefaultEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public DefaultEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attributeSet) {
        LayoutInflater layoutInflater = LayoutInflater.from(getContext());
        View view = layoutInflater.inflate(R.layout.item_edittext_popup,this,true);
        mapview(view);
        loadAttrsView(attributeSet);
        setupView();
    }


    private void mapview(View view) {
        mRelativeLayout = view.findViewById(R.id.relativeContainDefaultSolar);
        mTextCell = view.findViewById(R.id.textviewValueDefaultSolar);
    }
    private void loadAttrsView(AttributeSet attributeSet) {
        if (attributeSet == null) return;
        TypedArray typedArray =  getContext().obtainStyledAttributes(attributeSet,R.styleable.DefaultEditText);
        mValeCell = typedArray.getString(R.styleable.DefaultEditText_textValueCell);
        typedArray.recycle();
    }

    private void setupView() {
        mTextCell.setText(mValeCell);
    }

}
