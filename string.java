class string{
    public static void main(String[] args) {
        String bookTitle="Book";
        String authourName="John Doe";
        int totalPages=200;
        int menbershipNumber=67890;
        System.out.println("Book Title: "+bookTitle);
        System.out.println("Author: "+authourName);
        System.out.println("Total Pages: "+totalPages);
        System.out.println("Membership Number: "+menbershipNumber);
        String bookSummary = bookTitle+ "by" +authourName+ "has" +totalPages+ "pages. Borrowed by member #"+menbershipNumber; 
        System.out.println("Library Book Summary: " + bookSummary);
    }
}
