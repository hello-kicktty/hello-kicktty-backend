package org.hellokicktty.server.repository;

import org.hellokicktty.server.domain.RestrictLayer;
import org.hellokicktty.server.domain.SpareLayer;

import java.util.List;

public interface LayerRepository {

    public List<RestrictLayer> findAllRestrictLayers();

    public List<SpareLayer> findAllSpareLayers();
}