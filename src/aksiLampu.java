public class aksiLampu {
    public static void main(String[] args) {
      // membuat objek 
        Lampu lampuTidur = new Lampu();

        System.out.println();

        // menyalakan lampu
        lampuTidur.nyalakanLampu();
        System.out.println("Apakah lampu menyala? "+ lampuTidur.nyala);

        // mematikan lampu
        lampuTidur.matikanLampu();
        System.out.println("Apakah lampu menyala? "+ lampuTidur.nyala);

        System.out.println();

    }
}
