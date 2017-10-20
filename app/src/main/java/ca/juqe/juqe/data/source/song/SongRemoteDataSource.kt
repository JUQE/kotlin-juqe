package ca.juqe.juqe.data.source.song

import ca.juqe.juqe.data.model.Playlist
import ca.juqe.juqe.data.model.Song
import io.reactivex.Completable
import io.reactivex.Single


class SongRemoteDataSource: SongDataSource {
    companion object {
        var INSTANCE: SongRemoteDataSource? = null

        fun getInstance(): SongRemoteDataSource =
                INSTANCE?: SongRemoteDataSource().apply { INSTANCE }

        fun destroyInstance() {
            INSTANCE = null
        }
    }

    override fun getSong(): Single<Song> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getSongsFromPlaylist(playlist: Playlist): Single<ArrayList<Song>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteSong(song: Song): Completable {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addSongToPlaylist(song: Song, playlist: Playlist) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun deleteSongFromPlaylist(song: Song, playlist: Playlist) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}