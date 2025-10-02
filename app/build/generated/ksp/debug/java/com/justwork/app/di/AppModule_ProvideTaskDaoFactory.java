package com.justwork.app.di;

import com.justwork.app.data.AppDatabase;
import com.justwork.app.data.TaskDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideTaskDaoFactory implements Factory<TaskDao> {
  private final Provider<AppDatabase> dbProvider;

  public AppModule_ProvideTaskDaoFactory(Provider<AppDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public TaskDao get() {
    return provideTaskDao(dbProvider.get());
  }

  public static AppModule_ProvideTaskDaoFactory create(Provider<AppDatabase> dbProvider) {
    return new AppModule_ProvideTaskDaoFactory(dbProvider);
  }

  public static TaskDao provideTaskDao(AppDatabase db) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideTaskDao(db));
  }
}
