package bwi.backend.broker.controller;

import bwi.backend.broker.api.dto.EinzelnachrichtRequestDto;
import bwi.backend.broker.api.dto.Radar;
import bwi.backend.broker.repository.RadarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RadarController {

    @Autowired
    private RadarRepository radarRepository;

    @GetMapping("/predictions")
    public List<Radar> getRadarPredictions() {
        return mapToRadar((List<EinzelnachrichtRequestDto> )radarRepository.findAll());
    }

    @PostMapping("/predictions")
    void addRadarPredictions(@RequestBody List<Radar> predictions) {
        radarRepository.deleteAll();
        radarRepository.saveAll(mapToEizelnachricht(predictions));

    }

    private List<EinzelnachrichtRequestDto> mapToEizelnachricht(List<Radar> predictions) {
        List<EinzelnachrichtRequestDto> nachrichtenList = new ArrayList<>();
        predictions.forEach(p -> {
            EinzelnachrichtRequestDto nachricht = new EinzelnachrichtRequestDto(p.getCoords().get(0),
                    p.getCoords().get(1),p.getCoords().get(2), p.getLabel());
            nachrichtenList.add(nachricht);
        });
        return nachrichtenList;
    }

    public List<Radar> mapToRadar(List<EinzelnachrichtRequestDto> nachrichten) {
        List<Radar> predictions = new ArrayList<>();
        nachrichten.forEach(p -> {
            Radar prediction = new Radar(List.of(p.getXCoordinate(), p.getYCoordinate(), p.getZCoordinate()), p.getLabel());
            predictions.add(prediction);
        });
        return predictions;
    }
}
