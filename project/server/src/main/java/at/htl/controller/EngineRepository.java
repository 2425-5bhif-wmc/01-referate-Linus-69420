package at.htl.controller;

import at.htl.entity.Engine;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EngineRepository implements PanacheRepository<Engine> {
}
