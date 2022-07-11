import javax.print.attribute.standard.Media;

public class MediaPlayerAdapter implements MediaPlayer{

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    public MediaPlayerAdapter() {
    }

    @Override
    public void reproduzir(TipoMedia tipoMedia,String nomeTipoMidia) {
        if(tipoMedia.equals(TipoMedia.VLC)){
         System.out.println("Reproduzindo VLC: "+nomeTipoMidia);
        }
    }
}
