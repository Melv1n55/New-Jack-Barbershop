package com.example.jackbarbershop;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.text.NumberFormat;
import static android.R.string.no;
import static android.os.Build.VERSION_CODES.N;
import android.os.Bundle;

public class paket extends AppCompatActivity {

    int quantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View arg0) {
        startActivity(new Intent(paket.this,hasil.class));
    }

    public void increment(View view){
        if(quantity==100){
            Toast.makeText(this, "pesanan maximal 10", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity+1 ;
        display(quantity);
    }
    public void decrement(View view){
        if (quantity==1){
            Toast.makeText(this,"pesanan minimal 1",Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity -1;
        display(quantity);
    }


    public void Submitorder(View view) {
        EditText nameEditText=(EditText)findViewById(R.id.edt_name);
        String name=nameEditText.getText().toString();
        Log.v("MainActivity","Nama:"+name);

        CheckBox regulerChekBox= (CheckBox) findViewById(R.id.Reguler_checkbox);
        boolean hasreguler=regulerChekBox.isChecked();
        Log.v("MainActivity","has whippedcream:"+hasreguler);

        CheckBox premiereChekBox= (CheckBox) findViewById(R.id.Premiere_checkbox);
        boolean haspremiere=premiereChekBox.isChecked();
        Log.v("MainActivity","has whippedcream:"+haspremiere);

        int price=calculateprice(hasreguler,haspremiere);
        String pricemessage=createOrderSummary(price,name,hasreguler,haspremiere);


        displayMessage(pricemessage);

    }
    private int calculateprice(boolean addwhipedcream,boolean addchocolate){
        int harga=0;

        if(addwhipedcream){
            harga=harga+25000;
        }

        if (addchocolate){
            harga=harga+40000;
        }

        return quantity * harga;
    }
    private String createOrderSummary(int price, String name, boolean addChocolate, boolean addWhippedCream) {//hasil pemesanan
        String pricemessage=" Nama :"+name;
        pricemessage+="\n Total Rp."+price;
        return  pricemessage;
    }

    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_textview);
        priceTextView.setText(message);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_textview);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_textview);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

}