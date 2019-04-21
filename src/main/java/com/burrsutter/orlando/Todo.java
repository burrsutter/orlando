package com.burrsutter.orlando;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Todo extends PanacheEntity {

  @NotBlank
  @Column(unique=true)
  public String title;

  public boolean completed;

  
  @Column(name = "ordering")
  public int order;


}