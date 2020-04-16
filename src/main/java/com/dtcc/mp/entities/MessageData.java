package com.dtcc.mp.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MESSAGE_DATA")
public class MessageData implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "ID")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "GUID")
  private String guid;

  @Column(name = "NAME")
  private String name;

  @Column(name = "COMPANY")
  private String company;

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }
}
