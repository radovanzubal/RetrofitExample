package com.mycompany.retrofitexample;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
public class Register {

    @SerializedName("email")
    @Expose
    public String email;

    @SerializedName("password")
    @Expose
    public String password;

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("email", email).append("password", password).toString();
    }
}
