package com.nibsantoantonio.senib.dao;

import jakarta.persistence.EntityManager;

import java.io.Serializable;
public abstract class AbstractDao<T, PK extends Serializable>  {

    private EntityManager entityManager;
}
