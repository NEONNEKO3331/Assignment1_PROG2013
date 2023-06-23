import javax.swing.JOptionPane;

class EBook extends Book {
    private String fileFormat;

    public EBook(String title, String author, double price, int quantity, String fileFormat) {
        super(title, author, price, quantity);
        this.fileFormat = fileFormat;
    }

    // Getter and Setter methods
    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    // Task methods
    public void openBook() {
       JOptionPane.showMessageDialog(null, "The book is opened. You may start reading..", "Book Information",
        JOptionPane.INFORMATION_MESSAGE);
    }

    public void downloadBook() {
        JOptionPane.showMessageDialog(null, "The book is start downloading.", "Book Information",
        JOptionPane.INFORMATION_MESSAGE);
     
    }

    public boolean validateFormat() {
        return fileFormat.equals(".pdf") || fileFormat.equals(".epub");
        
    }
}