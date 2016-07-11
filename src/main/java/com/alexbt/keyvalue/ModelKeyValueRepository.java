package com.alexbt.keyvalue;

import org.springframework.data.keyvalue.repository.KeyValueRepository;
import org.springframework.stereotype.Repository;

public interface ModelKeyValueRepository extends KeyValueRepository<Model, String> {
}     