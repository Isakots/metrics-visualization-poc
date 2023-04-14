package hu.isakots.metricspoc.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import hu.isakots.metricspoc.entity.DummyEntity;
import hu.isakots.metricspoc.repository.DummyRepository;
import hu.isakots.metricspoc.rest.model.DummyDTO;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/dummies")
@RequiredArgsConstructor
public class DummyController {

    private final DummyRepository dummyRepository;

    @GetMapping("/{id}")
    DummyDTO getDummyById(@PathVariable Long id) {
        return dummyRepository.findById(id)
            .map(it -> new DummyDTO(it.getId(), it.getName()))
            .orElseThrow();
    }

    @PostMapping
    DummyDTO getDummyById(@RequestBody DummyDTO request) {
        DummyEntity entity = new DummyEntity();
        entity.setName(request.name());
        entity =  dummyRepository.save(entity);
        return new DummyDTO(entity.getId(), entity.getName());
    }

}
