public interface Printable {
    void print();

    public static void main(String[] args) {
        Printable document=new Document();
        Printable photo=new Photo();

        document.print();
        photo.print();
    }
}

class Document implements Printable {
    public void print() {
        System.out.println("Printing document...");
    }
}

class Photo implements Printable {
    public void print() {
        System.out.println("Printing photo...");
    }
}

class PrintableDemo {
    public static void main(String[] args) {
        Printable document=new Document();
        Printable photo=new Photo();

        document.print();
        photo.print();
    }
}


// 7th prg