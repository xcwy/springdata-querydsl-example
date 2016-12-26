package io.rai.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by rai on 16/12/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserDraft {
  private String name;

  private Integer age;
}
