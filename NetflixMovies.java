class NetflixMovies {

  static String englishMovies[] = {"Interstellar", "Fight Club", "Inception", "Pulp Fiction", "Deadpool"};
  static String kannadaMovies[] = {"Mungaru Male", "KGF: Chapter 1", "Lucia", "RangiTaranga", "Ugramm", "Kirik Party", "Mythri", "Ulidavaru Kandante", "Chowka"};
  static String hindiMovies[] = {"Sholay", "Dilwale Dulhania Le Jayenge", "Lagaan", "Kabhi Khushi Kabhie Gham", "Koi Mil Gaya"};
  static String teluguMovies[] = {"Maharshi", "Geetha Govindam", "Sye", "Magadheera", "Nuvvostanante Nenoddantana", "Eega", "Srimanthudu", "Mirchi"};
  static String malayalamMovies[] = {"Drishyam", "Bangalore Days","Premam","Maheshinte", "Prathikaaram","Charlie", "Kumbalangi Nights","Jallikattu","Uyare","Virus"};
  
  public static void main(String Netflix[]){
  System.out.println("These are the collection of english movies:");
  System.out.println(englishMovies.length);
  
  for(int movies=0; movies<englishMovies.length; movies++)
  System.out.println(englishMovies[movies]);

  System.out.println("------------------------------------------------------->");
  
  System.out.println("These are the collection of kannada movies:");
  System.out.println(kannadaMovies.length);
  
  for(int movies=0; movies<kannadaMovies.length; movies++)
  System.out.println(kannadaMovies[movies]);

  System.out.println("------------------------------------------------------->");
  
  System.out.println("These are the collection of hindi movies:");
  System.out.println(hindiMovies.length);
  
  for(int movies=0; movies<hindiMovies.length; movies++)
  System.out.println(hindiMovies[movies]);

  System.out.println("------------------------------------------------------->");
  
  System.out.println("These are the collection of kannada movies:");
  System.out.println(englishMovies.length);
  
  for(int movies=0; movies<kannadaMovies.length; movies++)
  System.out.println(kannadaMovies[movies]);

  System.out.println("------------------------------------------------------->");
  
  System.out.println("These are the collection of telugu movies:");
  System.out.println(teluguMovies.length);
  
  for(int movies=0; movies<teluguMovies.length; movies++)
  System.out.println(teluguMovies[movies]);

  System.out.println("------------------------------------------------------->");
  
  System.out.println("These are the collection of malayalam movies:");
  System.out.println(malayalamMovies.length);
  
  for(int movies=0; movies<malayalamMovies.length; movies++)
  System.out.println(malayalamMovies[movies]);
  }


}