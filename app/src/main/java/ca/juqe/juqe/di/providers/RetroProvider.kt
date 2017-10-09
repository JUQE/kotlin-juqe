package ca.juqe.juqe.di.providers

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetroProvider private constructor(apiDomain: String, okHttpClient: OkHttpClient) {

    val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(apiDomain)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()

    companion object {

        private var INSTANCE: RetroProvider? = null

        @JvmStatic fun getInstance(apiDomain: String, okHttpClient: OkHttpClient): RetroProvider =
                INSTANCE ?: RetroProvider(apiDomain, okHttpClient).apply { INSTANCE = this }
    }
}