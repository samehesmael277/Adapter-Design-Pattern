// Client code using the NewAudioPlayer interface
class AudioClient(private val audioPlayer: NewAudioPlayer) {
    fun playAudio(fileType: String, fileName: String): String {
        return audioPlayer.play(fileType, fileName)
    }
}