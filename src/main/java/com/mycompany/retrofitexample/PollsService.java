/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.retrofitexample;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.*;

/**
 *
 * @author zubal
 */
public interface PollsService {

  @GET("/api/users?page=2")
  Call<Page> listUsers();

  @GET("/api/users/{id}")
  Call<Data> singleUser(@Path("id") int us);

  @GET("/api/unknown")
  Call<Page2> listResource();

  @GET("/api/unknown/{id}")
  Call<Data2> singleResource(@Path("id") int us);

/*
  @GET("/api/users/23")
  Call<UserNF> singleUserNF();*/
  @POST("/api/users")
  Call<PostResponse> postUser(@Body PostUser postUser);
  @PUT("/api/users")
  Call<PutUser> putuser(@Body PostUser pUser);
  @DELETE("/api/users/2")
  Call<PutUser> delete();
  @POST("/api/register")
  Call<Token> registers(@Body Register reg);
  @POST("/api/register")
  Call<Error> registerf(@Body Email em);
  @POST("/api/login")
  Call<Token> loginUser(@Body Register reg);
  @POST("/api/login")
  Call<Error> loginUserf(@Body Email em);
}
