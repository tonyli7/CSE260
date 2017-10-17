import java.util.ArrayList;
public class Album{
    String name;
    ArrayList<Track> tracks;

    public Album(ArrayList<Track> tracks){
	this.tracks = tracks;
    }

}

class Blah implements Comparator<Album>{
    public int compare(Album a1, Album a2){
	return a1.name.compareTo(a2.name);
    }
}
