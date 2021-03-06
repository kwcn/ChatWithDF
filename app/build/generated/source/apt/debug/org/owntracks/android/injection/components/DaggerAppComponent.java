// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package org.owntracks.android.injection.components;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.greenrobot.eventbus.EventBus;
import org.owntracks.android.data.repos.ContactsRepo;
import org.owntracks.android.data.repos.MemoryContactsRepo;
import org.owntracks.android.data.repos.MemoryContactsRepo_Factory;
import org.owntracks.android.injection.modules.AppModule;
import org.owntracks.android.injection.modules.AppModule_ProvideAppContextFactory;
import org.owntracks.android.injection.modules.AppModule_ProvideEventbusFactory;
import org.owntracks.android.injection.modules.AppModule_ProvideResourcesFactory;
import org.owntracks.android.injection.modules.NetModule;

public final class DaggerAppComponent implements AppComponent {
  private Provider<Context> provideAppContextProvider;

  private Provider<Resources> provideResourcesProvider;

  private Provider<MemoryContactsRepo> memoryContactsRepoProvider;

  private Provider<ContactsRepo> bindContactsRepoProvider;

  private Provider<EventBus> provideEventbusProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideAppContextProvider =
        DoubleCheck.provider(AppModule_ProvideAppContextFactory.create(builder.appModule));

    this.provideResourcesProvider =
        DoubleCheck.provider(AppModule_ProvideResourcesFactory.create(builder.appModule));

    this.memoryContactsRepoProvider = DoubleCheck.provider(MemoryContactsRepo_Factory.create());

    this.bindContactsRepoProvider = (Provider) memoryContactsRepoProvider;

    this.provideEventbusProvider =
        DoubleCheck.provider(AppModule_ProvideEventbusFactory.create(builder.appModule));
  }

  @Override
  public Context context() {
    return provideAppContextProvider.get();
  }

  @Override
  public Resources resources() {
    return provideResourcesProvider.get();
  }

  @Override
  public ContactsRepo contactsRepo() {
    return bindContactsRepoProvider.get();
  }

  @Override
  public EventBus eventBus() {
    return provideEventbusProvider.get();
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder netModule(NetModule netModule) {
      Preconditions.checkNotNull(netModule);
      return this;
    }
  }
}
