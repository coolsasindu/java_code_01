class BadAssignment {
  public static void main(String args[]) {
    byte b;
    int i = 127;
    b =(byte) i; // int data cast to byte
    i =(int) b; // // byte data cast to int
    
    System.out.println(i);
    System.out.println(b);

  }
}
