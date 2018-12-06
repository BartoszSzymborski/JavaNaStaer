package pl.javastart.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "client_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order")
    private Long id;
    @Column(nullable = false)
    private String product;
    @Column(name = "details",length = 512)
    private String oderDetails;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    public Order() {
    }

    public Order(String product, String oderDetails) {
        this.product = product;
        this.oderDetails = oderDetails;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getOderDetails() {
        return oderDetails;
    }

    public void setOderDetails(String oderDetails) {
        this.oderDetails = oderDetails;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", oderDetails='" + oderDetails + '\'' +
                ", client=" + client +
                '}';
    }
}
