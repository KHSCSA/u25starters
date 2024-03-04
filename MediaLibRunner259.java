public class MediaLibRunner259{
    public static void main(String [] args){

        MediaLib myLib = new MediaLib();
        myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
        myLib.addBook(new Book("1984", "Orwell"));
        myLib.addSong(new Song("In Your Eyes"));
        System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);

    } // close main()
} // close runner class