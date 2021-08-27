package com.florian935.orderclient.service;

import java.util.List;

public interface CrudService<ENTITY, ID> {

    List<ENTITY> findAll();

    ENTITY findById(ID id);
}
