package SecaoTrezeEnumeracoes;

import java.util.Date;
import enums.OrderStatusSecaoTrezeEnumeracao;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatusSecaoTrezeEnumeracao status;

    public Order(){

    }

    public Order(Integer id, Date moment, OrderStatusSecaoTrezeEnumeracao status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusSecaoTrezeEnumeracao getStatus() {
        return status;
    }

    public void setStatus(OrderStatusSecaoTrezeEnumeracao status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
