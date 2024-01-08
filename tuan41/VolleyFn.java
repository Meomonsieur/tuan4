package com.example.scapplication.tuan41;

import android.content.Context;
import android.view.PixelCopy;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.jar.JarException;

public class VolleyFn {
    String strJson="";
    public void getJsonArrayOfObject(Context context, TextView textView)
    {
        //tao request

        RequestQueue queue=Volley.newRequestQueue(context)
        //url
        string url="https://jsonformatter.org/";
        //goi request
        //JsonArrayRequest(url,thanhcong,that bai)
        JsonArrayRequest request =newJsonArrayRequest = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>()
                {
                    public void onReponse(JSONArray response){
                        //chuyen mang sang cac doi tuong
                        for(int i =0; i< response.length();i++)
                        {
                            try{
                            JSONObject  person=response.getJSONObject(i);
                            String id=person.getString("id");
                            String name= person.getString("name");
                            String email= person.getString("email");
                            //
                                strJson += "Id: " +id+ "\n";
                                strJson += "name: " +name+ "\n";
                                strJson += "email: " +email+ "\n";

                        }catch (JarException e){
                                throw new RuntimeException(e);
                            }
                            textView.setText(strJson);
                    }
                }
        ); new Response.ErrorListener() {

                public void onErrorResponse(VolleyError error){
                    textView.setText(error.getMessage());
                }
    }
        //thuc thi request
        queue
    }
}
