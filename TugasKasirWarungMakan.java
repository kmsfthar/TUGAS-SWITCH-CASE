package tugaskasirwarungmakan;
import java.util.Scanner;
public class TugasKasirWarungMakan {
    public static void main(String[] args) {
        //pilihan barang
        int varian,jumlah,Harga,kartu;
        double diskon = 0,Total = 0,kembalian;
        Scanner sc= new Scanner(System.in);
        System.out.println("SISTEM KASIR WARUNG MAKAN");
        System.out.println("==============================");
        System.out.println("");
        System.out.println("DAFTAR MENU");
        System.out.println("1.Sate");
        System.out.println("[11] Ayam : 1.500 per tusuk");
        System.out.println("[12] Kambing : 3000 per tusuk");
        System.out.println("");
        System.out.println("2.Pecel");
        System.out.println("[21] Lauk Ayam : 13000 per porsi");
        System.out.println("[22] Lauk Empal : 15000 per porsi");
        System.out.println("");
        System.out.println("3.Penyetan");
        System.out.println("[31] Lauk Tahu/Tempe : 5000 per porsi");
        System.out.println("[32] Lauk Telur : 7000 per porsi");
        System.out.println("[33] Lauk Ayam : 10000 per porsi");
        System.out.println("");
        System.out.println("===============================");
     
        //Memilih menu
        System.out.print("MENU YANG DIPILIH : ");
        int pilih=sc.nextInt();
        
        if (pilih>3){
            System.out.println("Menu tidak ada");
            System.exit(0);
        }
        System.out.print("PILIHAN VARIAN MENU : ");
        varian=sc.nextInt();
      switch(pilih){
          case 1:
                if(varian==11){
                    Harga = 1500;
                    System.out.print("Jumlah Pesanan : ");
                    jumlah = sc.nextInt();
                    Total = jumlah*Harga;
                    System.out.println("Total harga pesanan = "+Total);

             }else if(varian==12){
                 Harga = 3000;
                 System.out.print("Jumlah Pesanan : ");
                jumlah = sc.nextInt();
                Total = jumlah*Harga;
                System.out.println("Total harga pesanan = "+Total);

             }else {
                    System.out.print("PILIHAN TIDAK ADA");
                    System.exit(0);
             }
                break;
            case 2:
                if(varian==21){
                    Harga = 13000;
                    System.out.print("Jumlah Pesanan : ");
                    jumlah = sc.nextInt();
                    Total = jumlah*Harga;
                    System.out.println("Total harga pesanan = "+Total);

                }else if(varian==22){
                    Harga = 15000;
                    System.out.print("Jumlah Pesanan : ");
                    jumlah = sc.nextInt();
                    Total = jumlah*Harga;
                    System.out.print("Total harga pesanan = "+Total);

                }else {
                   System.out.print("PILIHAN TIDAK ADA");
                   System.exit(0); 
                }
                break;
            case 3:
                switch (varian){
                    case 31:
                        Harga = 5000;
                        System.out.print("Jumlah Pesanan : ");
                        jumlah = sc.nextInt();
                        Total = jumlah*Harga;
                        System.out.println("Total harga pesanan = "+Total);

                    break;
                    case 32:
                        Harga = 7000;
                        System.out.print("Jumlah Pesanan : ");
                        jumlah = sc.nextInt();
                        Total = jumlah*Harga;
                        System.out.println("Total harga pesanan = "+Total);

                    break;
                    case 33:
                        Harga = 10000;
                        System.out.print("Jumlah Pesanan : ");
                        jumlah = sc.nextInt();
                        Total = jumlah*Harga;
                        System.out.println("Total harga pesanan = "+Total);

                    break;
                    default:
                        System.out.println("PILIHAN TIDAK TERSEDIA");
                       
           
                }   
        }
       System.out.println("");
       System.out.println("===============================");
            
         //Diskon
         System.out.print("APAKAH ADA KARTU MEMBER : ");
         System.out.println("KETIK 1 JIKA ADA, KETIK 2 JIKA TIDAK");
         kartu=sc.nextInt();
         System.out.println("");
         
         if (kartu==1){
             System.out.println("MENDAPAT DISKON 5%");
             diskon = 0.05*Total;
             System.out.println("POTONGAN HARGA = "+diskon);
             Total=Total-diskon;
             System.out.println("HARGA AKHIR = "+Total);
             System.out.println("============TERIMA KASIH===============");
         }
       
         
            }
             
           
            
        
                                     
                    
            
                    
                }
                
        

