package io.ashdavies.sample;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import javax.inject.Singleton;

@Singleton
@Component(
    modules = {
        ApplicationModule.class,
        ActivityBindingModule.class,
        AndroidSupportInjectionModule.class,
    }
)
public interface ApplicationComponent extends AndroidInjector<MainApplication> {

  @Component.Builder
  abstract class Builder extends AndroidInjector.Builder<MainApplication> {
  }
}
