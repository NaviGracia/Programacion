package Ejercicio02;

public enum Formato {
    WAV("wav"), MP3("mp3"), MIDI("midi"), AVI("avi"), MOV("mov"), MPG("mpg"), CDAUDIO("cdAudio"), DVD("dvd");
    String formato;

    private Formato(String formato) {
        this.formato = formato;
    }

    public String getFormato(){
        return formato;
    }
}
