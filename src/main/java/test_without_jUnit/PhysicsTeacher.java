package test_without_jUnit;

public class PhysicsTeacher {
    //JAVA DOKUMENTACIJA programuotojam
    /**
     * Apskaiciuoja nuvaziuota distancija pagal duota laika ir greiti.
     * @param time duotasis laiko tarpas
     * @param speed duotasis greitis, kuriuo vaziuoja automobilis.
     * @return paskaiciuota nuotoli.
     */

    public Double calculateDistance(Double time, Double speed) {
        if(time>0){
            return time*speed;
        }else{
            return 0.0;
        }

    }
}
