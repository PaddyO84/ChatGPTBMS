package com.justwork.app.viewmodels;

import com.justwork.app.data.TaskDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class TasksViewModel_Factory implements Factory<TasksViewModel> {
  private final Provider<TaskDao> daoProvider;

  public TasksViewModel_Factory(Provider<TaskDao> daoProvider) {
    this.daoProvider = daoProvider;
  }

  @Override
  public TasksViewModel get() {
    return newInstance(daoProvider.get());
  }

  public static TasksViewModel_Factory create(Provider<TaskDao> daoProvider) {
    return new TasksViewModel_Factory(daoProvider);
  }

  public static TasksViewModel newInstance(TaskDao dao) {
    return new TasksViewModel(dao);
  }
}
