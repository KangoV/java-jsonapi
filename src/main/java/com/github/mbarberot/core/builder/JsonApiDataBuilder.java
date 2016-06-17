package com.github.mbarberot.core.builder;

import java.util.Map;

import static com.google.common.collect.ImmutableMap.of;

public class JsonApiDataBuilder extends MapBuilder {
    private final Object type;
    private final Object id;

    public static JsonApiDataBuilder data(Object type, Object id) {
        return new JsonApiDataBuilder(type, id);
    }

    public JsonApiDataBuilder(Object type, Object id) {
        this.type = type;
        this.id = id;
    }

    @Override
    public Map<String, Object> build() {
        map.putAll(of(
                "id", id,
                "type", type
        ));
        return map;
    }
}
