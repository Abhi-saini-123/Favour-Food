package com.favour_food.app.SendNotification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAmEOviYY:BHhOKilN16_yRCLl6VmJQvB5nUW3yKc2Ywm3ZvVtSGVMPOkfDf5FPPqS1EO9a2hUD4_et-trt82FjXzZSpUfpNA"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);
}
