

import modelo.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Persona p = new Persona();
    Cuenta c = new Cuenta();
    Producto pr = new Producto(150.4);
    Estudiante e = new Estudiante();
    Estudiante e1 = new Estudiante();
    CuentaBancaria cb = new CuentaBancaria();

    /*p.setNombre("Ana");
    System.out.println(p.getNombre());

    p.nombre = "Ana";
    System.out.println(p.nombre);


    c.setSaldo(-100);

    System.out.println(pr.getPrecio());

    e.setNombre("Sebastian");

    System.out.println("Nombre del producto: " + pr.getNombre());

    e.setNombre("Sebastian");
    e1.setNombre("Maye");
    System.out.println("Nombre del estudiante: " + e.getNombre());
    System.out.println("Nombre del estudiante: " + e1.getNombre());



    cb.setSaldo(450);
    System.out.println("Salgo guardado: " + cb.getSaldo());

    cb.setSaldo(-90);
    System.out.println("Saldo final: " + cb.getSaldo());*/
    cb.setSaldo(0);
    System.out.println("Saldo: " + cb.getSaldo());
}
