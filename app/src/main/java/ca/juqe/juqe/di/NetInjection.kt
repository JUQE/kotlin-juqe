package ca.juqe.juqe.di

import android.support.annotation.NonNull
import ca.juqe.juqe.api.JuqeApi
import ca.juqe.juqe.di.providers.ApiProvider
import ca.juqe.juqe.di.providers.OkhttpProvider
import ca.juqe.juqe.di.providers.RetroProvider
import okhttp3.OkHttpClient
import retrofit2.Retrofit


object NetInjection {

    @Throws(IllegalStateException::class)
    fun provideOkHttpClient(@NonNull timeOut: Long): OkHttpClient {
        checkNotNull(timeOut)
        return OkhttpProvider.getInstance(timeOut).okHttpClient
    }

    @Throws(IllegalStateException::class)
    fun provideRetrofit(@NonNull apiDomain: String, @NonNull okHttpClient: OkHttpClient): Retrofit {
        checkNotNull(apiDomain)
        checkNotNull(okHttpClient)
        return RetroProvider.getInstance(apiDomain, okHttpClient).retrofit
    }

    @Throws(IllegalStateException::class)
    fun provideJuqeApi(@NonNull retrofit: Retrofit): JuqeApi {
        checkNotNull(retrofit)
        return ApiProvider.getInstance(retrofit).juqeApi
    }
}