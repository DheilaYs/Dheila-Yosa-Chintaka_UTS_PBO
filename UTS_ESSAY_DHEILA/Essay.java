//NAMA:DHEILA YOSA CHINTAKA
//NIM:4253250030
//KELAS:PSIK 25 C
//MATA KULIAH:PEMROGRAMAN BERBASIS OBJEK

/*
SOAL 1:
Jelaskan bagaimana prinsip encapsulation,inheritance, polymorphism, dan abstraction saling mendukung dalam membangun sistem perangkat lunak yang mudah dikembangkan dan dipelihara. Sertakan contoh analogi dalam kehidupan nyata untuk masingmasing konsep.
JAWABAN:
Keempat prinsip OOP yaitu abstraction, encapsulation, inheritance, dan polymorphism saling mendukung dalam membangun sistem perangkat lunak yang mudah dikembangkan dan dipelihara.
1. Abstraction + Encapsulation
Abstraction adalah proses menyederhanakan sistem dengan hanya menampilkan bagian penting kepada pengguna, tanpa memperlihatkan detail kompleks di dalamnya.
Encapsulation adalah proses menyembunyikan data (atribut) dan membatasi aksesnya melalui method tertentu (getter dan setter).
Hasilnya :Dengan abstraction dan encapsulation, sistem menjadi lebih aman karena data terlindungi dan lebih mudah digunakan karena kompleksitas disembunyikan.

Analogi: Seperti ATM, pengguna hanya melihat menu (abstraction), sementara data di dalam sistem ATM dilindungi dan tidak bisa diakses langsung (encapsulation).

2. Inheritance + Polymorphism
Inheritance adalah konsep pewarisan, di mana sebuah class dapat mewarisi atribut dan method dari class lain sehingga mengurangi duplikasi kode.
Polymorphism adalah konsep di mana satu method dapat memiliki banyak bentuk atau perilaku yang berbeda tergantung objeknya.
Hasil:Dengan inheritance dan polymorphism, sistem menjadi fleksibel dan mudah dikembangkan tanpa perlu mengubah struktur utama.

Analogi:Seperti remote TV universal, satu tombol yang sama bisa digunakan untuk berbagai jenis TV, tetapi cara kerjanya bisa berbeda.

3. Contoh Gabungan (Sistem Kendaraan)
Misalnya terdapat class Kendaraan:

- Abstraction:
  Class Kendaraan memiliki method umum seperti jalan().

- Encapsulation:
  Atribut seperti kecepatan dibuat private dan diakses melalui getter dan setter.

- Inheritance:
  Class Mobil dan Motor mewarisi dari class Kendaraan.

- Polymorphism:
  Method jalan() diimplementasikan berbeda pada Mobil dan Motor.
---------------------------------------------------------------------------------------------
SOAL 2:
Apa kelebihan menggunakan Java versi terbaru (Java21) dibanding versi-versi sebelumnya dalam konteks pengembangan berbasis OOP? 
Berikan minimal dua fitur modern Java 21 dan jelaskan bagaimana fitur tersebut menyederhanakan pengembangan aplikasi OOP.
JAWABAN:
Kelebihan menggunakan Java 21 dibanding versi sebelumnya dalam pengembangan OOP adalah menyediakan fitur modern yang membuat kode lebih sederhana, aman, dan mudah dipelihara. 
1) Record: Record adalah fitur untuk membuat class data secara ringkas tanpa perlu menulis boilerplate seperti getter, setter, toString, equals, dan hashCode. Hal ini sangat membantu dalam OOP karena mempermudah pembuatan objek yang bersifat immutable (tidak bisa diubah) sehingga kode lebih aman dan bersih. 
Analogi: seperti formulir otomatis yang langsung jadi tanpa harus ditulis ulang. 
2) Pattern Matching for switch: Fitur ini memungkinkan penggunaan switch yang lebih cerdas dengan berbagai tipe objek, sehingga mendukung polymorphism secara lebih sederhana dan mengurangi penggunaan if-else yang panjang. Hal ini membuat kode lebih mudah dibaca dan dikembangkan. 
Analogi: seperti alat sortir otomatis yang bisa mengenali berbagai jenis barang tanpa harus dicek satu per satu. Kesimpulan: Java 21 membantu pengembangan OOP menjadi lebih efisien, ringkas, dan mudah dipelihara melalui fitur-fitur modern yang mengurangi kompleksitas kode.
---------------------------------------------------------------------------------------------
SOAL 3:
Mahasiswa sering kali salah memahami perbedaanantara class dan object. 
Jelaskan secara detail perbedaan keduanya dan berikan contoh penggunaan class dan object dalam konteks program manajemen data mahasiswa.
JAWABAN:
1)Class adalah blueprint atau cetakan yang digunakan untuk membuat object, berisi atribut (variabel) dan method (fungsi). 
2)Object adalah hasil nyata (instance) dari class yang memiliki nilai/data spesifik dan dapat menjalankan method yang didefinisikan dalam class. 
Dengan kata lain, class itu seperti desain, sedangkan object adalah wujud nyata dari desain tersebut. 

Analogi: class seperti cetakan kue, sedangkan object adalah kue yang dihasilkan dari cetakan tersebut. 

Contoh dalam program manajemen data mahasiswa: class Mahasiswa memiliki atribut seperti nama, NIM, dan nilai, serta method seperti tampilData(). 
Kemudian dibuat object seperti mhs1 = new Mahasiswa("Dheila", "12345", 90); dan mhs2 = new Mahasiswa("Budi", "67890", 85);. Di sini Mahasiswa adalah class, sedangkan mhs1 dan mhs2 adalah object yang menyimpan data mahasiswa yang berbeda. 

Kesimpulan: class mendefinisikan struktur, sedangkan object merepresentasikan data nyata yang digunakan dalam program.
--------------------------------------------------------------------------------------------
SOAL 3:
Anda diminta membuat class BankAccount. Jelaskan bagaimana Anda akan menerapkan encapsulation agar data balance tidak bisa diubah sembarangan. 
Mengapa encapsulation penting untuk keamanan sistem?
JAWABAN:
Dalam class BankAccount, encapsulation diterapkan dengan menjadikan atribut balance sebagai private sehingga tidak bisa diakses atau diubah langsung dari luar class. 
Akses terhadap balance hanya diberikan melalui method tertentu seperti getter (getBalance()) untuk melihat saldo dan method seperti deposit() serta withdraw() untuk mengubah saldo dengan aturan tertentu (misalnya tidak boleh negatif atau melebihi saldo). 
Dengan cara ini, perubahan data selalu terkontrol. 

Encapsulation penting untuk keamanan sistem karena mencegah akses langsung ke data sensitif, menghindari manipulasi data sembarangan, menjaga konsistensi data, dan memastikan bahwa setiap perubahan mengikuti aturan bisnis yang telah ditentukan.
--------------------------------------------------------------------------------------------
SOAL 4:
Jelaskan bagaimana mekanisme constructor chaining bekerja pada pewarisan di Java. 
Apa yang terjadi jika constructor pada superclass tidak dipanggil secara eksplisit? 
Sertakan ilustrasi class Karyawan dan subclass Manager.
JAWABAN:
Constructor chaining pada pewarisan di Java adalah proses pemanggilan constructor secara berantai dari subclass ke superclass menggunakan keyword super(). Saat object subclass dibuat, constructor superclass akan dipanggil terlebih dahulu, kemudian constructor subclass dijalankan. Hal ini memastikan atribut yang diwarisi terinisialisasi dengan benar. 
Jika constructor superclass tidak dipanggil secara eksplisit, Java akan otomatis memanggil constructor default (tanpa parameter) dari superclass. Namun, jika superclass tidak memiliki constructor default, maka akan terjadi error kompilasi. 

Ilustrasi: class Karyawan memiliki constructor Karyawan(String nama), lalu subclass Manager extends Karyawan harus memanggil super(nama) di dalam constructornya. Jika tidak dipanggil, program akan error karena constructor di superclass membutuhkan parameter. 
--------------------------------------------------------------------------------------------
SOAL 5:
Polymorphism memungkinkan kita menulis kode yang fleksibel dan mudah di-maintain. 
Jelaskan bagaimana penggunaan interface mendukung konsep ini.
berikan contoh penggunaannya dalam sistem pemesanan makanan online.
JAWABAN:
Polymorphism memungkinkan satu interface digunakan oleh berbagai class dengan implementasi berbeda sehingga kode menjadi fleksibel dan mudah di-maintain. 
Penggunaan interface mendukung konsep ini karena interface hanya mendefinisikan method tanpa implementasi, sehingga setiap class yang mengimplementasikannya dapat memiliki perilaku berbeda. 

Dalam sistem pemesanan makanan online, misalnya dibuat interface Pembayaran dengan method bayar(). Kemudian class seperti EWallet, KartuKredit, dan TransferBank mengimplementasikan interface tersebut dengan cara pembayaran yang berbeda. 
Saat digunakan, program cukup memanggil method bayar() tanpa perlu tahu jenis pembayaran yang digunakan. Hal ini memudahkan penambahan metode pembayaran baru tanpa mengubah kode utama, sehingga sistem lebih fleksibel dan mudah dikembangkan.
--------------------------------------------------------------------------------------------
SOAL 6:
Abstraction membantu menyembunyikan kompleksitas internal. 
Bandingkan penggunaan abstract class, interface, dan sealed class di Java. 
Dalam kasus apa masing-masing lebih tepat digunakan?
JAWABAN:
Dalam Java, abstraction dapat diterapkan melalui abstract class, interface, dan sealed class dengan perbedaan penggunaan: 
 -Abstract class adalah class yang dapat memiliki method abstract dan non-abstract serta atribut, digunakan ketika beberapa class memiliki hubungan erat dan berbagi kode (misalnya class Kendaraan dengan method umum). 
 -Interface adalah kontrak yang hanya berisi deklarasi method (dan default/static method), digunakan ketika ingin mendefinisikan kemampuan yang bisa dimiliki berbagai class yang tidak harus memiliki hubungan hierarki (misalnya interface Pembayaran untuk berbagai metode bayar). 
 -Sealed class (Java 17+) adalah class yang membatasi class mana saja yang boleh menjadi subclass-nya, digunakan ketika ingin mengontrol pewarisan secara ketat untuk keamanan dan struktur yang lebih terprediksi (misalnya hanya kelas tertentu seperti Mobil dan Motor yang boleh turunan dari Kendaraan). 
 
abstract class untuk reuse + relasi erat, interface untuk fleksibilitas dan polymorphism, sealed class untuk kontrol pewarisan yang ketat.
--------------------------------------------------------------------------------------------

*/