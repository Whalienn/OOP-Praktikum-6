public class utama {
    public static void main(String[] args){
        bangundatar lingkaran = new lingkaran("pink",8);
        bangundatar segitiga = new segitiga("putih",7,4);
        bangundatar persegi = new persegi("coklat", 4,4);


        lingkaran.gambar();
        lingkaran.luas();
        System.out.println();
        segitiga.gambar();
        segitiga.luas();
        System.out.println();
        persegi.gambar();
        persegi.luas();







    }
    
}
