//package problems.common.freshworks;
//
///**
// * @author ranjit
// *
// *         design a playlist like spotify lld
// */
//public class Main2 {
//
//class Songs{
//  String songname;
//  String singer;
//  boolean isPlaying;
//
//  ...
//}
//
//class User{
//  String userName;
//  ...
//}
//
//	class Manager {
//
//		Map<User, LinkedHashSet<Songs>> map;
//
//public void removeSong(User user, Song song){
//  if(map.containsKey(user)){
//    map.get(user).remove(song);
//  }
//  throw ...
//
//}
//
//		public void playSong(User user, boolean isLoop) {
//			if (map.containsKey(user)) {
//				Set<Song> set = map.get(user);
//				// itrenate get 1st one set the value isPlaying true.
//			}
//		}
//
//		public void addSong(User user, Song song) {
//			if (map.containsKey(user)) {
//				map.get(user).add(song);
//			}
//
//		}
//
//		public Set<Songs> listAllSongs(User user) {
//			if (map.containsKey(user)) {
//				return map.get(user);
//			}
//
//		}
//
//public List<Songs> listAllSongs(User user){
//  List<Song> list = new ArrayList<>();
//  if(map.containsKey(user)){
//    Set<Songs> songs = map.get(user);
//
//    Songs prev = null;
//    for(Songs song : songs){
//
//      if(list.size()==1){
//        list.add(song)
//      }
//      if(song.isPlaying){
//        list.(prev);
//      }
//      prev = song;
//    }
//  }
//
//}
//
//	}
//
//}
