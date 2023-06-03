package com.example.homework3

import android.graphics.ColorSpace.get
import android.net.Uri
import com.google.gson.annotations.SerializedName
import java.security.acl.Owner


data class GalleryItem(
    var title: String = "",
    var id: String = "",
    @SerializedName("url_s") var url: String = "",
    @SerializedName("owener") var owner: String = ""
){
    val photoPageUri: Uri
        get() {
            return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(owner)
                .appendPath(id)
                .build()
        }
}
