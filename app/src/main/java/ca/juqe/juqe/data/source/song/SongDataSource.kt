package ca.juqe.juqe.data.source.song

import ca.juqe.juqe.data.model.Playlist
import ca.juqe.juqe.data.model.Song
import io.reactivex.Completable
import io.reactivex.Single


interface SongDataSource {
    fun getSong(): Single<Song>
    fun getSongsFromPlaylist(playlist: Playlist): Single<ArrayList<Song>>
    fun deleteSong(song: Song): Completable
    fun addSongToPlaylist(song: Song, playlist: Playlist)
    fun deleteSongFromPlaylist(song: Song, playlist: Playlist)
}