class BadAssignment {
  public static void main(String args[]) {
    byte b;
    int i = 127;
    b =(byte) i;
    i =(int) b;
    
    System.out.println(i);
    System.out.println(b);

  }
}
