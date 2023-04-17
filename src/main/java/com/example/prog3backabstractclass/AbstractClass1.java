package com.example.prog3backabstractclass;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public abstract class AbstractClass1 {
  protected final ConcreteDependance1 concreteDependance1;
  protected final ConcreteDependance2 concreteDependance2;
}
