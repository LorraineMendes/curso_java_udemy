package SecaoTrezeEnumeracoes;

import enums.OrderStatusSecaoTrezeEnumeracao;

import java.util.Date;

public class Program {
    public static void main(String[] args){
        Order order = new Order(1080, new Date(), OrderStatusSecaoTrezeEnumeracao.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatusSecaoTrezeEnumeracao os1 = OrderStatusSecaoTrezeEnumeracao.DELIVERED;
        OrderStatusSecaoTrezeEnumeracao os2 = OrderStatusSecaoTrezeEnumeracao.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);



    }
}
