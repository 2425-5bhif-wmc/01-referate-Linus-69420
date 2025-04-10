package at.htl.controller;

import at.htl.entity.Engine;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class EngineRepository {

    private List<Engine> engines = new ArrayList<>();

    public List<Engine> getAll() {
        return engines;
    }

    public void add(Engine engine) {
        engines.add(engine);
    }
}
