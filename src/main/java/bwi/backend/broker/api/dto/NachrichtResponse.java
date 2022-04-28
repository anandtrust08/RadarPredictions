package bwi.backend.broker.api.dto;

import java.util.List;


public class NachrichtResponse {

    private List<Radar> data;

    public NachrichtResponse(List<Radar> data) {
        this.data = data;
    }

    public List<Radar> getData() {
        return data;
    }
}
