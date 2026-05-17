void main() {

    // A
    byte valorByte = 29;
    short valorShort = valorByte;
    int valorInt = valorShort;
    long valorLong = valorInt;
    float valorFloat = valorLong;
    double valorDouble = valorFloat;

    System.out.println("Byte: " + valorByte);
    System.out.println("Short: " + valorShort);
    System.out.println("Int: " + valorInt);
    System.out.println("Long: " + valorLong);
    System.out.println("Float: " + valorFloat);
    System.out.println("Double: " + valorDouble);
    System.out.println();

    // B
    double valorDouble2 = 45.89;
    System.out.println("Double: " + valorDouble2);

    float valorFloat2 = (float) valorDouble2;
    System.out.println("Float: " + valorFloat2);

    // Desde aqui para abajo se pierde la parte decimal
    int valorInt2 = (int) valorDouble2;
    System.out.println("Int: " + valorInt2);

    short valorShort2 = (short) valorDouble2;
    System.out.println("Short: " + valorShort2);

    byte valorByte2 = (byte) valorDouble2;
    System.out.println("Byte: " + valorByte2);

    System.out.println();

    // C
    String str1 = "2024";
    String str2 = "98.6";
    String str3 = "false";

    int entero = Integer.parseInt(str1);
    double decimal = Double.parseDouble(str2);
    boolean bool = Boolean.parseBoolean(str3);

    System.out.println("Entero: " + entero);
    System.out.println("Decimal: " + decimal);
    System.out.println("Booleano: " + bool);

    System.out.println();

    String str4 = Integer.toString(entero);
    String str5 = Double.toString(decimal);
    String str6 = Boolean.toString(bool);

    /*
    TAMBIEN SE PUEDE HACER DE ESTA MANERA
    String str4 = String.valueOf(entero);
    String str5 = String.valueOf(decimal);
    String str6 = String.valueOf(bool);
    */


    Animal animal = new Perro();

    animal.mover();

    if (animal instanceof Perro) {
        Perro perro = (Perro) animal;
        perro.caminar();
    }
}
