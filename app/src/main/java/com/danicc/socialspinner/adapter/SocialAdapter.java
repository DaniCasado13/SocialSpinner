package com.danicc.socialspinner.adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import com.danicc.socialspinner.model.Social;

import java.util.List;

public class SocialAdapter  extends ArrayAdapter<Social> {
    public SocialAdapter(@NonNull Context context, int resource, @NonNull List<Social> objects) {
        super(context, resource, objects);
    }
}
