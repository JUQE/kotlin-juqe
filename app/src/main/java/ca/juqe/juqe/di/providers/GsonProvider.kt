package ca.juqe.juqe.di.providers

import com.google.gson.Gson


object GsonProvider {
    private var gson: Gson? = null

    @JvmStatic fun provideGson(): Gson = gson ?: Gson().apply { gson = this }
}