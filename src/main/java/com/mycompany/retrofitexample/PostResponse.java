package com.mycompany.retrofitexample;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.ToStringBuilder;
public class PostResponse {

    @SerializedName("name")
    @Expose
    public String name;

    @SerializedName("job")
    @Expose
    public String job;

    @SerializedName("id")
    @Expose
    public String id;

    @SerializedName("createdAt")
    @Expose
    public String createdAt;
    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("job", job).append("id", id).append("createdAt", createdAt).toString();
    }

}
