// Adapter class that adapts the LegacyAudioPlayer to the NewAudioPlayer interface
class AudioPlayerAdapter(private val legacyAudioPlayer: LegacyAudioPlayer) : NewAudioPlayer {
    override fun play(fileType: String, fileName: String): String {
        return when (fileType) {
            "mp3" -> legacyAudioPlayer.playMp3(fileName)
            else -> "Unsupported file type"
        }
    }
}