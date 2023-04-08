package com.company;
/*Create an interface called "Playable" with a method called "play".
Create two classes called "Song" and "Video" that implement the
Playable interface and implement the "play" method.
Create objects of both the Song and Video classes and call their respective "play" methods.*/
// Define the Playable interface
interface Playable {
    void play();
}

// Implement the Playable interface in the Song class
class Song implements Playable {
    public void play() {
        // Implementation of the play method for Song
        System.out.println("Playing a song...");
    }
}

// Implement the Playable interface in the Video class
class Video implements Playable {
    public void play() {
        // Implementation of the play method for Video
        System.out.println("Playing a video...");
    }
}

// Create objects of the Song and Video classes and call their play methods
public class UseMain {
    public static void main(String[] args) {
        Playable song = new Song();
        Playable video = new Video();

        song.play(); // Output: Playing a song...
        video.play(); // Output: Playing a video...
    }
}
