package choreographywithidempotency.domain;

import choreographywithidempotency.domain.*;
import choreographywithidempotency.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class DeliveryFailed extends AbstractEvent {

    private String orderId;
    private String productId;
    private String productName;
    private Integer qty;
    private String customerId;
    private String address;
    private String status;
}
