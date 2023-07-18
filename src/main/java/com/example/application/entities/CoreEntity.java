package com.example.application.entities;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class CoreEntity<K> implements ICoreEntity<K> {
}
