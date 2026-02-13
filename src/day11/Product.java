package day11;
// COMPARABLE
class Product implements Comparable<Product> {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product p) {
        // Ascending order by price if change vice versa then it will be like in descending order
//        if (this.price < p.price) return -1;
//        if (this.price > p.price) return 1;
//        return 0;
//        return Double.compare(this.price,p.price); // same as the above if statements

        return this.name.compareTo(p.name);
    }
}

