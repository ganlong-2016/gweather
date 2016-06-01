package app.gweather.com.gweather.util;

/**
 * Created by Administrator on 2016/6/1.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);

}
