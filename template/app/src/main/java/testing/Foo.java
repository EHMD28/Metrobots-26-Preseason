package testing;

public class Foo {
    public interface Driveable {
        String speedUnits = "m/s";

        void stop();

        void drive(double speed);
    }

    public static class Car implements Driveable {
        @Override
        public void stop() {
            this.drive(0);
        }

        @Override
        public void drive(double speed) {
            System.out.println("This vehicle is going " + speed + " " + speedUnits);
        }

        public void startEngine() {
            System.out.println("Vroom");
        }
    };

    public interface BinaryOperation {
        double applyOp(double a, double b);
    }
}
