package kaaes.spotify.webapi.android.models;

import java.util.List;
import java.util.Map;

/**
 * <a href="https://developer.spotify.com/web-api/object-model/#track-object-full">Track object model</a>
 */
public class Track {
    public AlbumSimple album;
    public List<ArtistSimple> artists;
    public List<String> available_markets;
    public int disc_number;
    public long duration_ms;
    public boolean explicit;
    public Map<String, String> external_ids;
    public Map<String, String> external_urls;
    public String href;
    public String id;
    public String name;
    public int popularity;
    public String preview_url;
    public int track_number;
    public String type;
    public String uri;
}
