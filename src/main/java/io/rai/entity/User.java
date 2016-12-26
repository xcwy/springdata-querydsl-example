package io.rai.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by rai on 16/12/26.
 */
@Entity
@Table(name = "r_user")
@Data
@EqualsAndHashCode(callSuper = false)
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  @Column
  private String name;

  @Column
  private Integer age;
}
