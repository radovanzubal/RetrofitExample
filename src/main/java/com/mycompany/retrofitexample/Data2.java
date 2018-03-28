package com.mycompany.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Data2 {
    @SerializedName("data")
    @Expose
    public Resource data;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("data", data).toString();
    }
}
