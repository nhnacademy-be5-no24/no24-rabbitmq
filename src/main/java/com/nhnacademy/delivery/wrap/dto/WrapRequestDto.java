package com.nhnacademy.delivery.wrap.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
/**
 * 포장 등록을 위한 request dto 입니다.
 *
 * @author : 박동희
 * @date : 2024-03-29
 **/
@Data
@AllArgsConstructor
@Builder
public class WrapRequestDto {
    private String wrapName;
    private Long wrapCost;
}