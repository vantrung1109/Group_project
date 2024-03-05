package com.example.group_project;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DataLocalManager {
    private static final String PREF_LIST_HISTORY = "PREF_LIST_HISTORY";
    private static DataLocalManager instance;
    private MySharedPreferences mySharedPreferences;
    public static void init(Context context) {
        instance = new DataLocalManager();
        instance.mySharedPreferences = new MySharedPreferences(context);
    }

    public static DataLocalManager getInstance() {
        if (instance == null) {
            instance = new DataLocalManager();

        }
        return instance;
    }
    public static void setListHistories(List<String> listHistory) {
        Gson gson = new Gson();
        JsonArray jsonArray = gson.toJsonTree(listHistory).getAsJsonArray();
        String strJsonArray = jsonArray.toString();
        DataLocalManager.getInstance().mySharedPreferences.putStringValue(PREF_LIST_HISTORY, strJsonArray);
    }
    public static List<String> getListHistories() {
        String strJsonArray = DataLocalManager.getInstance().mySharedPreferences.getStringValue(PREF_LIST_HISTORY);
        List<String> listHistories = new ArrayList<>();
        try {
            if (strJsonArray.isEmpty()) {
                return listHistories;
            }
            JSONArray jsonArray = new JSONArray(strJsonArray);
            String string;
            for (int i = 0; i < jsonArray.length(); i++) {
                string = jsonArray.getString(i);
                listHistories.add(string);
            }
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
        return listHistories;
    }
}
