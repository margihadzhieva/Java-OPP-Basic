package L06_Inheritance_Exercises.P05_OnlineRadioDatabase.SongExeptions;

public class InvalidSongMinutesException extends InvalidSongLengthException {
    public InvalidSongMinutesException(String s) {
        super(s);
    }
}
