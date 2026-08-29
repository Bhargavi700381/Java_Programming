class pre_and post_increment_and_decrement {
    public static void main(String[] args) {
       int x = 2;
        int y = 3;
        int z = 4;
        int result = --x + y++ + ++z - x-- - --y + z++;
        System.out.println(result);
   
    }
}
