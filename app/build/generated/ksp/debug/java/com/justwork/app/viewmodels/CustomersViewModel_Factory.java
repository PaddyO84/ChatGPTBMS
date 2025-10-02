package com.justwork.app.viewmodels;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CustomersViewModel_Factory implements Factory<CustomersViewModel> {
  @Override
  public CustomersViewModel get() {
    return newInstance();
  }

  public static CustomersViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CustomersViewModel newInstance() {
    return new CustomersViewModel();
  }

  private static final class InstanceHolder {
    private static final CustomersViewModel_Factory INSTANCE = new CustomersViewModel_Factory();
  }
}
