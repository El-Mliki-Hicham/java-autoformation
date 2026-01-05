public class Main {
    public static void main(String[] args) {
        try {
              Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
              Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);
            
              MagazineLibrary magazineLibrary = new MagazineLibrary();
                  magazineLibrary.addMagazine( magazine1);

                  magazineLibrary.addMagazine( magazine1);

            System.out.println(magazineLibrary.getMagazine(0));

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
