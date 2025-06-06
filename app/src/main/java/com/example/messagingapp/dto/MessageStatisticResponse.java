package com.example.messagingapp.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "Ответ со статистикой сообщений")
public class MessageStatisticResponse {

    @Schema(
            description = "Количество сообщений по статусам",
            allowableValues = {"PROCESSED", "FAILED"},
            example = "{\"PROCESSED\": 10, \"FAILED\": 5}"
    )
    private Map<String, Long> statisticMessages;

}
