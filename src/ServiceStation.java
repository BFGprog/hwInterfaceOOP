public interface  ServiceStation {

    public default void check() {
        if (this instanceof Car) {
            System.out.println("Обслуживаем " + ((Car) this).getModelName());
            for (int i = 0; i < ((Car) this).getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
        } else if (this instanceof Truck) {
            System.out.println("Обслуживаем " + ((Truck) this).getModelName());
            for (int i = 0; i < ((Truck) this).getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
            checkTrailer();
        } else if (this instanceof Bicycle) {
            System.out.println("Обслуживаем " + ((Bicycle) this).getModelName());
            for (int i = 0; i < ((Bicycle) this).getWheelsCount(); i++) {
                updateTyre();
            }
        }
    }
    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    private void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
