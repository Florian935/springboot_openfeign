package com.florian935.orderserver.service;

import java.util.List;

public interface CrudService<ENTITY, ID> {

    List<ENTITY> findAll();

    ENTITY findById(ID id);
}
