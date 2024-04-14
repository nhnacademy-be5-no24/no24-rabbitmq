package com.nhnacademy.delivery.order.exception;

public class SaveOrderFailed extends RuntimeException {
    public SaveOrderFailed(Long orderId) {
        super("주문 등록에 실패했습니다." + orderId);
    }
}
