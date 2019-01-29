package InterfejsComparableiComparator.Comparator;

import java.util.Comparator;

public class Product implements Comparable<Product> {

    private String producer;
    private String name;
    private String category;

    public Product(String producer, String name, String category) {
        this.producer = producer;
        this.name = name;
        this.category = category;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "producer='" + producer + '\'' +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }



    @Override
    public int compareTo(Product p) {
        int categoryCopare = category.compareTo(p.getCategory());
        if (categoryCopare!=0){
            return categoryCopare;
        }
        int producerCompare = producer.compareTo(p.getProducer());
        if (producerCompare!=0){
            return producerCompare;
        }
        return name.compareTo(p.getName());
    }

    public static class ProductNameComparator implements Comparator<Product> {
        @Override
        public int compare(Product p1, Product p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }

}
