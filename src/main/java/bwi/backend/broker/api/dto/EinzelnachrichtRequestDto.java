package bwi.backend.broker.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class EinzelnachrichtRequestDto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private Double xCoordinate;
    private Double yCoordinate;
    private Double zCoordinate;
    private String label;

    public EinzelnachrichtRequestDto(Double xCoordinate, Double yCoordinate, Double zCoordinate, String label) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.zCoordinate = zCoordinate;
        this.label = label;
    }
}
