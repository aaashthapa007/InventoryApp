package Api;

import com.example.inventoryapp.models.Response;
import com.example.inventoryapp.models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface UserApi {

    @POST("register")
    Call<Response> register (@Body User user);

    @POST("login")
    Call<Response> login (@Field("email")String email, @Field("password")String password);
}
