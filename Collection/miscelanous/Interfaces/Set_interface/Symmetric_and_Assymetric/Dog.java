package Collection.miscelanous.Interfaces.Set_interface.Symmetric_and_Assymetric;


import java.util.HashSet;
import java.util.Set;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof Dog) {
            String objName = ((Dog) obj).getName();
            return this.name.equals(objName);
        }

        return false;
    }

    /**
     * Created by dev on 12/01/2016.
     */
    public static final class HeavenlyBody {
        private final String name;
        private final double orbitalPeriod;
        private final Set<HeavenlyBody> satellites;

        public HeavenlyBody(String name, double orbitalPeriod) {
            this.name = name;
            this.orbitalPeriod = orbitalPeriod;
            this.satellites = new HashSet<>();
        }

        public String getName() {
            return name;
        }

        public double getOrbitalPeriod() {
            return orbitalPeriod;
        }

        public boolean addMoon(HeavenlyBody moon) {
            return this.satellites.add(moon);
        }

        public Set<HeavenlyBody> getSatellites() {
            return new HashSet<>(this.satellites);
        }


        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            System.out.println("obj.getClass() is " + obj.getClass());
            System.out.println("this.getClass() is " + this.getClass());
            if ((obj == null) || (obj.getClass() != this.getClass())) {
                return false;
            }

            String objName = ((HeavenlyBody) obj).getName();
            return this.name.equals(objName);
        }

        @Override
        public int hashCode() {
            System.out.println("hashcode called");
            return this.name.hashCode() + 57;
        }
    }
}