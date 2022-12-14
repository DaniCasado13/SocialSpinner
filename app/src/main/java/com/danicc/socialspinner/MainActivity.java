package com.danicc.socialspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.danicc.socialspinner.adapter.SocialAdapter;
import com.danicc.socialspinner.databinding.ActivityMainBinding;
import com.danicc.socialspinner.model.Social;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
private ArrayAdapter<String> adapterxml;
private ArrayAdapter<Social> adapter;
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //ejemplo 1 adapter mediante un recurso xml
      //  adapterxml= new ArrayAdapter<String>(this,
        //        android.R.layout.simple_spinner_item,
          //      getResources().getStringArray(R.array.socialsarray));
        //adapterxml.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //binding.spinner.setAdapter(adapterxml);

        //ejemplo 2 crear adapter con el origen de datos en codigo
       adapter = new ArrayAdapter<Social>(this, android.R.layout.simple_spinner_dropdown_item,getList());

        //3 Array adapter personalizado
      //  adapter=new SocialAdapter(this,R.layout.item_social,getList());

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinner.setAdapter(adapter);
        binding.spinner.setSelection(0,false);
        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Social itemSocial = (Social) adapterView.getSelectedItem();
                Toast.makeText(MainActivity.this, "se ha seleccionado " + itemSocial.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    //metodo que inicializa el adapter
    private List<Social> getList(){
        List<Social> list = new ArrayList<>();
        list.add(new Social(R.drawable.twitter,"Twitter"));
        list.add(new Social(R.drawable.instagram,"Instagram"));
        list.add(new Social(R.drawable.android,"Android"));
        list.add(new Social(R.drawable.linkedin,"Linkedin"));
        list.add(new Social(R.drawable.facebook,"Facebook"));
        return  list;
    }
}
