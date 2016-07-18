package tech.tawsoft.com.rxble.WebApi;



import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GetApi {

    @POST("insert.php")
    Call<SubmitResponse> syncData();
}