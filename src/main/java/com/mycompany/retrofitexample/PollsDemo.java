/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitexample;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author zubal
 */
public class PollsDemo {
    public static void main(String[] args){

    Retrofit retrofit = new Retrofit.Builder()
    .baseUrl("https://reqres.in")
    .addConverterFactory(GsonConverterFactory.create())
    .build();

PollsService polls=retrofit.create(PollsService.class);

        try {
            Response<Page> execute = polls.listUsers().execute();
            if(execute.isSuccessful()){
            Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Response<Data> execute = polls.singleUser(2).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            Response<Data> execute = polls.singleUser(23).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }else if(execute.code()==404) {
                Logger.getGlobal().log(Level.INFO,"error: 404  user not found");
            }
            } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }


        try {
            Response<Page2> execute = polls.listResource().execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Response<Data2> execute = polls.singleResource(2).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }else if(execute.code()==404) {
                Logger.getGlobal().log(Level.INFO,"error: 404  resource not found");
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Response<Data2> execute = polls.singleResource(23).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }else if(execute.code()==404) {
                Logger.getGlobal().log(Level.INFO,"error: 404  resource not found");
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }


        PostUser user = new PostUser();
        user.name="morpheus";
        user.job="leader";
        try {
            Response<PostResponse> execute = polls.postUser(user).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        user.job="zion resident";

        try {
            Response<PutUser> execute = polls.putuser(user).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Response<PutUser> execute = polls.delete().execute();
            if(execute.code()==204){
                Logger.getGlobal().log(Level.INFO,"user deleted");
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
Register r= new Register();
        r.email="sydney@fife";
        r.password="pistol";
        try {
            Response<Token> execute = polls.registers(r).execute();
            if(execute.isSuccessful()){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        Email ema=new Email();
        ema.email="sydney@fife";
/*        try {
            Response<Error> execute = polls.registerf(ema).execute();
            if(execute.code()==400){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }*/

        r.email="peter@klaven";
        r.password="cityslicka";
        try {
            Response<Token> execute = polls.loginUser(r).execute();
            if(execute.code()==200){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*ema.email="peter@klaven";
        try {
            Response<Error> execute = polls.loginUserf(ema).execute();
            if(execute.code()==400){
                Logger.getGlobal().log(Level.INFO,execute.body().toString());
            }
        } catch (IOException ex) {
            Logger.getLogger(PollsDemo.class.getName()).log(Level.SEVERE, null, ex);
        }*/


    }
}
