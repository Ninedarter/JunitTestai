package test_without_jUnit;

public class PhysicsMain {
    //testas be jUnit
    public static void main(String[] args) {
        PhysicsTeacher mokytojas  = new PhysicsTeacher();
        Double paskaiciuotasNuotolis = mokytojas.calculateDistance(10.0, 50.0);
        System.out.println(paskaiciuotasNuotolis);

        System.out.println("Paskaiciuotas nuotolis yra lygus, kai laikas yra 10 ir greitis yra 500 " +(paskaiciuotasNuotolis==500));
    }
}
