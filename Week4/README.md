# spotify-api-test

◻️ Bu proje Java dilinde **Rest Assured** ve **TestNG** kütüphanesi kullanılarak Spotify API için yazılmış api test projesidir. Projede Page Object Pattern kullanılmıştır.

◻️ https://www.spotify.com/tr/ linki üzerinden mevcut hesabınızda oturum açmalısınız.

◻️ https://developer.spotify.com/console/ linki üzerinden Spofiy Api requestlerini inceleyebilirsiniz. Token bilginizi alabilirsiniz.

> **Test1 :  shouldGetCurrentUsersProfile**

**API Reference :** Get Current User's Profile

**Endpoint :** https://api.spotify.com/v1/me

**HTTP Method :** GET

**OAuth :** Required

**Assertion :** Mevcut kullanıcının id’si NULL değildir.

![image](https://user-images.githubusercontent.com/55894683/144727349-cd148d18-4a8a-42c7-88ff-1b818a5a0e1e.png)

> **Test2: shouldGetUsersProfile**

**API Reference :** Get User's Profile

**Endpoint :** https://api.spotify.com/v1/users/{user_id}

**HTTP Method :** GET

**OAuth :** Required

**Assertion :** Tarayıcıda açık olan mevcut kullanıcının id’si ile kendi kullanıcımın id’si eşittir.

![image](https://user-images.githubusercontent.com/55894683/144727397-8fb2bfd3-e7dc-49cd-98e4-a98fd8e45ffd.png)

> **Test3: shouldCreatePlaylist**

**API Reference :**	Create Playlist

**Endpoint :** https://api.spotify.com/v1/users/{user_id}/playlists

**HTTP Method :** POST

**OAuth :** Required

**Assertion :** Kullanıcı id bilgisi ile oluşturulan playlist id bilgisi aynı değildir.

![image](https://user-images.githubusercontent.com/55894683/144727441-37e1a050-b61c-4213-860a-7c6da20fadd7.png)

**Result :** Spotify hesabına “**Spotify Api Test**” adında bir playlist eklenir.

![image](https://user-images.githubusercontent.com/55894683/144727537-3c9d7a35-6a07-4ab2-925c-32c7d5abd1bd.png)


> **Test4: shouldChangePlaylistDetails**

**API Reference :**	Change Playlist Details

**Endpoint :** https://api.spotify.com/v1/playlists/{playlist_id}

**HTTP Method :** PUT

**OAuth :** Required

![image](https://user-images.githubusercontent.com/55894683/144727497-f097b987-d600-4c6f-b8ac-f740dce2ea9a.png)

**Result :** Spotify hesabına “**Spotify Api Test**” adında bir playlist eklenir. Playlist adının “**Updated Spotify Api Test**” olarak update edildiği görülür.

![image](https://user-images.githubusercontent.com/55894683/144727542-1f7c609b-9b5c-4a74-8d5d-c0bb81fe946a.png)

> **Test5: shouldSearchForItem**

**API Reference :** Search for Item

**Endpoint :** https://api.spotify.com/v1/search

**HTTP Method :** GET

**OAuth :** Required

**Param :** q, type, market

**Assertion :** Aratılan sanatçının parçaları içerisinde “Ele Güne Karşı Yapayalnız” şarkısı mevcuttur.

![image](https://user-images.githubusercontent.com/55894683/144727579-d79ae7c7-867b-4c99-a087-a512fa0afd93.png)




