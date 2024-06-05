# OCP Java SE 17 Developer Study Guide
Study guide for the OCP Oracle Certified Professional Java SE 17 Developer Exam 1Z0-829

# JAVA
## Leaning About the Enviroment.
---------
### Major Components of Java
- Java : Execure the program
- JDK : Java Development Kit
- Javac : Java Compiler; Convert .java source files to .class bytecode
- Jar : Java ARchive; packages files together
- Javadoc : Generates Documention
- JVM : Java virtual machine
- JRE : Java Runtime Enviroment

Java'da yazma, derleme ve çalıştırma süreçleri ve bu süreçlerde kullanılan araçlar ve bileşenler şöyle açıklanabilir:

### 1. Yazma (Writing)

Java programları genellikle `.java` uzantılı dosyalarda yazılır. Bu dosyalar, metin editörleri veya daha gelişmiş entegre geliştirme ortamları (IDE'ler) kullanılarak oluşturulur.

### 2. Derleme (Compiling)

Yazılan Java kaynak kodları (`.java` dosyaları) `javac` adlı Java derleyicisi tarafından bytecode'a dönüştürülür. Bytecode, `.class` uzantılı dosyalarda saklanır.

- **JDK (Java Development Kit)**: Geliştiricilerin Java programları yazıp derleyebilmeleri için gerekli araçları içerir. JDK, JRE'yi de içerir.
- **Javac**: Java derleyicisidir ve kaynak kodları derleyerek bytecode'a dönüştürür.

### 3. Çalıştırma (Running)

Derlenen bytecode, JVM (Java Virtual Machine) tarafından çalıştırılır. JVM, platformdan bağımsız olarak bytecode'u çalıştırabilir.

- **JVM (Java Virtual Machine)**: Java bytecode'unu çalıştıran sanal makinedir.
- **JRE (Java Runtime Environment)**: JVM'in yanı sıra gerekli kütüphaneleri ve diğer bileşenleri içerir. JRE, Java uygulamalarını çalıştırmak için gerekli ortamı sağlar.
- **Java**: Bytecode'u çalıştıran komuttur. Örneğin, `java MyClass` komutu, MyClass adlı sınıfın bytecode'unu JVM üzerinde çalıştırır.

### Diğer Araçlar

- **jar (Java ARchive)**: Birden fazla `.class` dosyasını ve ilgili kaynakları (örneğin, resimler, meta veriler) bir araya getiren sıkıştırılmış dosya formatıdır. Java uygulamalarını dağıtmak için kullanılır. `jar` aracı, bu dosyaları oluşturmak ve yönetmek için kullanılır.
- **javadoc**: Java kaynak kodundaki yorumlardan otomatik olarak API dokümantasyonu oluşturan araçtır.

### Süreç Özeti

1. **Yazma**: Java kaynak kodu yazılır (MyClass.java).
2. **Derleme**: `javac MyClass.java` komutu ile kaynak kodu derlenir ve `MyClass.class` bytecode dosyası oluşturulur.
3. **Çalıştırma**: `java MyClass` komutu ile bytecode, JVM tarafından çalıştırılır.

### Örnek Süreç

1. **Yazma**:
   ```java
   public class MyClass {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```
   Bu kod, `MyClass.java` adlı dosyaya kaydedilir.

2. **Derleme**:
   ```bash
   javac MyClass.java
   ```
   Bu komut, `MyClass.class` adlı bytecode dosyasını oluşturur.

3. **Çalıştırma**:
   ```bash
   java MyClass
   ```
   Bu komut, `MyClass.class` dosyasını çalıştırır ve "Hello, World!" çıktısını verir.
------------------------------------------------

## Understanding the Class Structure.

- Class (Sınıf): Nesnelerin yapısını ve davranışlarını tanımlayan bir şablondur.
- Object (Nesne): Bir sınıfın örneği veya temsilcisidir; belirli özellikleri ve davranışları taşır.
- Fields (Alanlar): Bir sınıfın durumunu veya özelliklerini temsil eden değişkenlerdir.
- Methods (Metodlar): Bir sınıfın davranışlarını temsil eden ve belirli işlemleri gerçekleştiren kod bloklarıdır.
  Tabii, işte sırasıyla her biri hakkında açıklamalar:

1. **Class (Sınıf)**:
   Bir programlama dili, nesne yönelimli bir dilse, sınıflar temel yapı taşlarından biridir. Bir sınıf, bir nesnenin yapısını ve davranışlarını tanımlar. Bir sınıf, bir nesneyi oluşturmak için bir şablon görevi görür. Nesneler, aynı sınıftan birden çok oluşturulabilir ve her biri sınıfın tanımladığı özelliklere ve davranışlara sahip olabilir. Örneğin, bir "Araba" sınıfı, arabaların genel özelliklerini (renk, model, hız, vb.) ve davranışlarını (hızlan, fren yap, vb.) tanımlayabilir.

2. **Object (Nesne)**:
   Bir sınıfın örneği veya temsilcisidir. Bir nesne, bellekte fiziksel bir varlık olarak var olur ve bir sınıfın tanımladığı özellikleri ve davranışları taşır. Bir sınıftan birden çok nesne oluşturulabilir. Örneğin, "Araba" sınıfından bir nesne oluşturulduğunda, bu nesne belirli bir arabanın özelliklerini ve davranışlarını temsil eder.

3. **Fields (Alanlar)**:
   Sınıfın özelliklerini (durumunu) temsil eder. Bir alan, bir sınıfın durumunu tanımlayan değişkenlerdir. Alanlar, sınıfın özelliklerini depolarlar ve her nesne için farklı değerler alabilirler. Örneğin, bir "Araba" sınıfında, renk, model, hız gibi özellikler alanlara örnek olarak verilebilir.

4. **Methods (Metodlar)**:
   Sınıfın davranışlarını temsil eder. Bir metot, belirli bir işlemi gerçekleştiren kod bloğudur. Bir sınıfın metotları, sınıfın davranışlarını tanımlar ve bu davranışları gerçekleştirir. Metotlar, sınıfın alanlarını manipüle edebilir ve belirli işlemleri gerçekleştirebilirler. Örneğin, bir "Araba" sınıfında, hızlan, fren yap, vites değiştir gibi işlemleri gerçekleştiren metotlar bulunabilir.

**Önemli Noktalar**
1. Dosya ismi ve public sınıf ismi aynı olmak zorunda:
- Eğer bir sınıf public ise, bu sınıfın ismi dosya adıyla aynı olmalıdır. Örneğin, public class Animal varsa, dosya adı Animal.java olmalıdır.
2. Bir dosyada birden fazla sınıf yazılabilir ama en fazla bir tanesi public olabilir:
- Bir .java dosyasında birden fazla sınıf tanımlayabilirsiniz, ancak bu sınıflardan sadece bir tanesi public olabilir. Diğer sınıflar public olamaz.
3. Public sınıfın ismi dosya ismi ile aynı olmak zorunda:
- Eğer bir dosyada bir public sınıf varsa, bu public sınıfın ismi dosya ismi ile aynı olmalıdır. Örneğin, dosya adı Animal.java ise, içindeki public sınıfın adı Animal olmalıdır.


