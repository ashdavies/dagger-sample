package io.ashdavies.sample;

import android.app.Application;
import dagger.Binds;
import dagger.Module;

@Module
abstract class ApplicationModule {

  @Binds
  public abstract Application application(MainApplication mainApplication);
}
