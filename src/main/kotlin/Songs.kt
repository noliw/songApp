fun main() {
    var song1 = Song(title = "The Mesopotmians", artist = "They Might be Giants")
    var song2 = Song(title = "Going Underground", artist = "The Jam")
    var song3 = Song(title = "Make Me Smile", artist = "Steve Harley")
    song2.play()
    song2.stop()
    song3.play()
}

class Song ( // Define the title and artist properties
    var title: String,
    var artist: String,
) {
    fun play() = println("Playing the song $title by $artist")
    fun stop() = println("Stopped playing $title")
}