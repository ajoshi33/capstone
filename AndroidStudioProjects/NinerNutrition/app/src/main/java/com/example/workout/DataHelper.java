package com.example.NinerNutrition;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class DataHelper {
    public static ArrayList<Exercises> loadExercises(Context context) {
        ArrayList<Exercises> exercises = new ArrayList<>();
        String json = "";

        try {
            InputStream is = context.getAssets().open("data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        }catch(IOException e){
                e.printStackTrace();
                return null;
            }
        try {
            JSONObject obj = new JSONObject(json);
            JSONArray jsonArray = obj.getJSONArray("Exercises");

            for(int i = 0; i<jsonArray.length(); i++){
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                Exercises exercise = new Exercises();
                exercise.setTitle(jsonObject.getString("title"));
                exercise.setWod(jsonObject.getString("wod"));
                exercises.add(exercise);
            }
        } catch(JSONException e){
            e.printStackTrace();
        }
        return exercises;
    }
}
