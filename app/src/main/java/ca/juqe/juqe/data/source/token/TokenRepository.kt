package ca.juqe.juqe.data.source.token


class TokenRepository(
        private val tokenRemoteDataSource: TokenRemoteDataSource,
        private val tokenLocalDataSource: TokenLocalDataSource
) : TokenDataSource {
    companion object {
        var INSTANCE: TokenRepository? = null

        @JvmStatic fun getInstance(
                localDataSource: TokenLocalDataSource,
                remoteDataSource: TokenRemoteDataSource): TokenRepository {
            return INSTANCE ?: TokenRepository(remoteDataSource, localDataSource).apply {
                INSTANCE = this
            }
        }

        @JvmStatic fun destroyInstance() {
            INSTANCE = null
        }
    }
}