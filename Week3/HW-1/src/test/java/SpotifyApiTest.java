import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;
import spec.ResponseSpec;
import static org.hamcrest.MatcherAssert.assertThat;

public class SpotifyApiTest extends BaseServiceTest {

    @Test
    public void shouldGetCurrentUsersProfile() {
        Response currentUser = usersProfile.getCurrentUsers(ResponseSpec.checkStatusCodeOk());
        String userID = currentUser.getBody().jsonPath().getString("id");
        System.out.println("Mevcut Kullanici ID : " +userID);
        Assert.assertNotNull(userID);

    }

    @Test
    public void shouldGetUsersProfile() {
        Response currentUser = usersProfile.getCurrentUsers(ResponseSpec.checkStatusCodeOk());
        String userID = currentUser.getBody().jsonPath().getString("id");
        Response userProfile = usersProfile.getUsersWithID(userID, ResponseSpec.checkStatusCodeOk());
        String myUserID = userProfile.getBody().jsonPath().getString("id");
        System.out.println("Mevcut Kullanici ID : " +userID);
        System.out.println("Kullanıcı ID : " +userID);
        Assert.assertEquals(userID, myUserID);
    }

    @Test
    public void shouldCreatePlaylist() {
        Response currentUser = usersProfile.getCurrentUsers(ResponseSpec.checkStatusCodeOk());
        String userID = currentUser.getBody().jsonPath().getString("id");
        Response createPlaylist = playlist.cretePlaylist(userID, ResponseSpec.checkStatusCodeCreated());
        String playlistId = createPlaylist.getBody().jsonPath().getString("id");
        System.out.println("Kullanici ID : " +userID);
        System.out.println("Playlist ID : " +playlistId);
        Assert.assertNotSame(userID, playlistId);
    }

    @Test
    public void shouldChangePlaylistDetails() {
        Response currentUser = usersProfile.getCurrentUsers(ResponseSpec.checkStatusCodeOk());
        String userID = currentUser.getBody().jsonPath().getString("id");
        Response createPlaylist = playlist.cretePlaylist(userID, ResponseSpec.checkStatusCodeCreated());
        String playlistId = createPlaylist.getBody().jsonPath().getString("id");
        Response updatePlaylist = playlist.changePlaylist(playlistId, ResponseSpec.checkStatusCodeOk());
        updatePlaylist.prettyPeek();
    }

    @Test
    public void shouldSearchForItem() {
        Response artistTracks = search.getArtistTracks(ResponseSpec.checkStatusCodeOk());
        String trackText = artistTracks.getBody().asString();
        System.out.println(trackText);
        assertThat(trackText, Matchers.containsString("Ele Güne Karşı Yapayalnız"));
    }

}
