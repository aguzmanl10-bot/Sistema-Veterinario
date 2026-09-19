public class SimuladorVeterinaria
{
    public static void main(String[] args)
    {
        System.out.println("===== CASO 1: MAMIFERO =====");

        Propietario duenoPerro =
            new Propietario("Ana Guzman ", "8888-8181");

        Animal perro =
            new Mamifero("Dooggy",
                         8,
                         15.8,
                         duenoPerro);

        duenoPerro.agregarMascota(perro);

        duenoPerro.mostrarMascotas();

        RegistroMedico regPerro =
            new RegistroMedico(1001, perro);

        regPerro.mostrarRegistro();

        Cita citaPerro =
            new Cita("08/06/2026",
                     "Emergencia",
                     perro);

        citaPerro.confirmar();

        Tratamiento tratamientoPerro =
            new Tratamiento("Cirugia de emergencia",
                            perro);

        tratamientoPerro.aplicar();

        Medicamento medPerro =
            new Medicamento("Asomeprasol",
                            "Cada 6 horas");

        medPerro.mostrarMedicamento();

        System.out.println();


        System.out.println("===== CASO 2: AVE =====");

        Propietario duenoAve =
            new Propietario("Maria Ochoa",
                            "1111-1212");

        Animal loro =
            new Ave("Paco",
                    6,
                    6.4,
                    duenoAve);

        duenoAve.agregarMascota(loro);

        duenoAve.mostrarMascotas();

        RegistroMedico regAve =
            new RegistroMedico(1002, loro);

        regAve.mostrarRegistro();

        Cita citaAve =
            new Cita("08/11/2026",
                     "Consulta",
                     loro);

        citaAve.confirmar();

        Tratamiento tratamientoAve =
            new Tratamiento("Revision de alas",
                            loro);

        tratamientoAve.aplicar();

        System.out.println();


        System.out.println("===== CASO 3: REPTIL =====");

        Propietario duenoReptil =
            new Propietario("Jose Garcia",
                            "9999-9191");

        Animal iguana =
            new Reptil("atrapa ratas 3000",
                       1,
                       2.5,
                       duenoReptil);

        duenoReptil.agregarMascota(iguana);

        duenoReptil.mostrarMascotas();

        RegistroMedico regIguana =
            new RegistroMedico(1003,
                               iguana);

        regIguana.mostrarRegistro();

        Cita citaIguana =
            new Cita("9/09/2026",
                     "Domiciliar",
                     iguana);

        citaIguana.confirmar();

        Tratamiento tratamientoIguana =
            new Tratamiento("Control de piel",
                            iguana);

        tratamientoIguana.aplicar();

        System.out.println();


        System.out.println("===== CASO 4: ANFIBIO =====");

        Propietario duenoRana =
            new Propietario("Gabirela Guzman",
                            "8988-9989");

        Animal rana =
            new Anfibio("Ramona",
                        2,
                        1.2,
                        duenoRana);

        duenoRana.agregarMascota(rana);

        duenoRana.mostrarMascotas();

        RegistroMedico regRana =
            new RegistroMedico(1004,
                               rana);

        regRana.mostrarRegistro();

        Cita citaRana =
            new Cita("/11/2026",
                     "Seguimiento",
                     rana);

        citaRana.confirmar();

        Tratamiento tratamientoRana =
            new Tratamiento("Control respiratorio",
                            rana);

        tratamientoRana.aplicar();

        System.out.println();


        System.out.println("===== CASO 5: ESTETICA =====");

        Estetica estetica =
            new Estetica();

        estetica.banio();
        estetica.cortePelo();
        estetica.corteUnas();

        System.out.println();


        System.out.println("===== CASO 6: VENTA DE PRODUCTOS =====");

        Producto shampoo =
            new Producto("Shampoo para caballo",
                         150);

        Producto cepillo =
            new Producto("cepillo de pelo",
                         50);

        Venta venta1 =
            new Venta(shampoo);

        Venta venta2 =
            new Venta(cepillo);

        venta1.realizarVenta();
        venta2.realizarVenta();

        System.out.println();


        System.out.println("===== CASO 7: MEMBRESIA =====");

        Membresia membresia =
            new Membresia("membresia max premium",
                          25);

        System.out.println(
            "Tipo de membresia: "
            + membresia.getTipo()
        );

        System.out.println();


        System.out.println("===== CASO 8: FACTURACION =====");

        Factura factura =
            new Factura(500,
                        membresia.getDescuento());

        factura.generarFactura();

        System.out.println();


        System.out.println("===== CASO 9: PAGO EN EFECTIVO =====");

        Pago pago1 = new Pago(475);
        pago1.efectivo();

        System.out.println();


        System.out.println("===== CASO 10: PAGO CON TARJETA =====");

        Pago pago2 = new Pago(325);
        pago2.tarjeta();

        System.out.println();


        System.out.println("===== CASO 11: PAGO POR TRANSFERENCIA =====");

        Pago pago3 = new Pago(250);
        pago3.transferencia();

        System.out.println();
        System.out.println("===== FIN DEL SISTEMA =====");
    }
}