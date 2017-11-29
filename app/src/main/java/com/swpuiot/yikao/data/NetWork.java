package com.swpuiot.yikao.data;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Created by 羊荣毅_L on 2017/4/11.
 * 访问网络
 */
public class NetWork {
   private RequestParams mRequestParams;
    private AsyncHttpClient mHttpClient;
    private List<?> entityList;

    public NetWork( List<?> entityList) {
        this.entityList=entityList;
        mRequestParams = new RequestParams();
        mHttpClient = new AsyncHttpClient();
    }
    public List<?> getSomeBodyList(){
        mHttpClient.get("www.altman.top/easyExam/ad/study_all",new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {
                ObjectMapper objectMapper = new ObjectMapper();
                try {
                     entityList = objectMapper.readValue(new String(bytes), entityList.getClass());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {
                Log.i("getSomeBodyList","the net work is lost");
            }
        });
        return entityList;
    }
    //点击发送时调用 发送文件
    public static void sendFileToservers(File file,String fileName, String fileproduce,String academyString,String depatmentString,String fileexcept){
        RequestParams sendFilerequstparams = new RequestParams();
        AsyncHttpClient sendFile = new AsyncHttpClient();
        //添加传递参数
        // TODO: 2017/4/23
        sendFilerequstparams.add("academy",academyString);
        sendFilerequstparams.add("department",depatmentString);
        try {
            sendFilerequstparams.put("fileList", file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        sendFile.post("  ", sendFilerequstparams, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {

            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

            }
        });
    }
    public static void logIn(String name,String passwd){
        RequestParams requestParams=new RequestParams();
        AsyncHttpClient logIn = new AsyncHttpClient();
        requestParams.add("name",name);
        requestParams.add("password",passwd);
        logIn.get(" ", requestParams, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int i, Header[] headers, byte[] bytes) {

            }

            @Override
            public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

            }
        });
    }
}
