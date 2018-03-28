package com.mycompany.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Token {
    @SerializedName("token")
    @Expose
    public String token;


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("token", token).toString();
    }
}
