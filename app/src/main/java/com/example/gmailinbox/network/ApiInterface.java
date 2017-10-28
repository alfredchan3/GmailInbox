package com.example.gmailinbox.network;

import com.example.gmailinbox.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author alfred
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();

}
