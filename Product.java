package Seminar6home;

public class Product {
    
    public Brand brand;
    public Color color;
    public Processor processor;

    String displeiInfoProduct () {
        return String.format("Производитель: %s; Цвет: %s; Процессор: %s;", brand, color, processor);
    }

    Product() {
        /*
         * Можем вызывать в конструкторе другие контструкторы - например для защиты от неверного ввода информации
         */
        this(Brand.Значение_по_умолчанию_брэнд, Color.Значение_по_умолчанию_цвет, Processor.Значение_по_умолчанию_процессор);
    }

    Product(Brand brand, Processor processor) {
        this.brand = brand;
        this.processor = processor;
}

    Product(Brand brand, Color color, Processor processor) {
        this.brand = brand;
        this.color = color;
        this.processor = processor;
    }
    
}
