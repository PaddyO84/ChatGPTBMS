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
public final class JobsViewModel_Factory implements Factory<JobsViewModel> {
  @Override
  public JobsViewModel get() {
    return newInstance();
  }

  public static JobsViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static JobsViewModel newInstance() {
    return new JobsViewModel();
  }

  private static final class InstanceHolder {
    private static final JobsViewModel_Factory INSTANCE = new JobsViewModel_Factory();
  }
}
