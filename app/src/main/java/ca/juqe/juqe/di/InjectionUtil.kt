package ca.juqe.juqe.di

import android.content.Context
import ca.juqe.juqe.Constants
import ca.juqe.juqe.R
import ca.juqe.juqe.api.JuqeApi


object InjectionUtil {

    fun getJuqeApi(context: Context): JuqeApi {
        return NetInjection.provideJuqeApi(
                NetInjection.provideRetrofit(
                        "https://api.spotify.com",
                        NetInjection.provideOkHttpClient(Constants.NETWORK_TIMEOUT)))
    }
}