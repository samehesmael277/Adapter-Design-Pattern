fun main(args: Array<String>) {
    // Using the Adapter Pattern to make the LegacyAudioPlayer work with the New Audio Player Interface
    val legacyAudioPlayer = LegacyAudioPlayer()
    val audioPlayerAdapter = AudioPlayerAdapter(legacyAudioPlayer)
    val audioClient = AudioClient(audioPlayerAdapter)

    val mp3Result = audioClient.playAudio("mp3", "song.mp3")
    println(mp3Result)

    val unsupportedResult = audioClient.playAudio("wav", "audio.wav")
    println(unsupportedResult)
}