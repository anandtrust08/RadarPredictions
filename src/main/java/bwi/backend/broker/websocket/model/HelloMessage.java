package bwi.backend.broker.websocket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * To model the message that carries the name
 */
public class HelloMessage {

    private String name;
}
