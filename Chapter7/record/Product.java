public record Product(String name, int cateId) {
    public Product {
        if (cateId <= 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}