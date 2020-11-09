package app.testing.com.practicalwork.network;

import java.util.List;

import app.testing.com.practicalwork.dummy.DummyContent;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiInterface {
    @GET("v0/topstories.json?print=pretty")
    Call<List<Integer>> getTopStories();
    @GET("v0/item/{articleid}.json?print=pretty")
    Call<DummyContent.DummyItem> getItems(@Path("articleid") int id);
}
