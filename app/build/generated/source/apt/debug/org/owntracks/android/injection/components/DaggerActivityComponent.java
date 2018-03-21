// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package org.owntracks.android.injection.components;

import android.content.Context;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.greenrobot.eventbus.EventBus;
import org.owntracks.android.data.repos.ContactsRepo;
import org.owntracks.android.injection.modules.ActivityModule;
import org.owntracks.android.injection.modules.ActivityModule_ProvideNavigatorFactory;
import org.owntracks.android.ui.base.navigator.Navigator;
import org.owntracks.android.ui.configuration.ConfigurationActivity;
import org.owntracks.android.ui.configuration.ConfigurationActivity_MembersInjector;
import org.owntracks.android.ui.configuration.ConfigurationMvvm;
import org.owntracks.android.ui.configuration.ConfigurationViewModel;
import org.owntracks.android.ui.configuration.ConfigurationViewModel_Factory;
import org.owntracks.android.ui.configuration.ConfigurationViewModel_MembersInjector;
import org.owntracks.android.ui.contacts.ContactsActivity;
import org.owntracks.android.ui.contacts.ContactsActivity_MembersInjector;
import org.owntracks.android.ui.contacts.ContactsMvvm;
import org.owntracks.android.ui.contacts.ContactsViewModel;
import org.owntracks.android.ui.contacts.ContactsViewModel_Factory;
import org.owntracks.android.ui.contacts.ContactsViewModel_MembersInjector;
import org.owntracks.android.ui.load.LoadActivity;
import org.owntracks.android.ui.load.LoadActivity_MembersInjector;
import org.owntracks.android.ui.load.LoadMvvm;
import org.owntracks.android.ui.load.LoadViewModel;
import org.owntracks.android.ui.load.LoadViewModel_Factory;
import org.owntracks.android.ui.load.LoadViewModel_MembersInjector;
import org.owntracks.android.ui.map.MapActivity;
import org.owntracks.android.ui.map.MapActivity_MembersInjector;
import org.owntracks.android.ui.map.MapMvvm;
import org.owntracks.android.ui.map.MapViewModel;
import org.owntracks.android.ui.map.MapViewModel_Factory;
import org.owntracks.android.ui.map.MapViewModel_MembersInjector;
import org.owntracks.android.ui.status.StatusActivity;
import org.owntracks.android.ui.status.StatusActivity_MembersInjector;
import org.owntracks.android.ui.status.StatusMvvm;
import org.owntracks.android.ui.status.StatusViewModel;
import org.owntracks.android.ui.status.StatusViewModel_Factory;
import org.owntracks.android.ui.status.StatusViewModel_MembersInjector;

public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<Navigator> provideNavigatorProvider;

  private MembersInjector<MapViewModel> mapViewModelMembersInjector;

  private Provider<Context> contextProvider;

  private Provider<ContactsRepo> contactsRepoProvider;

  private Provider<MapViewModel> mapViewModelProvider;

  private Provider<MapMvvm.ViewModel> bindMapViewModelProvider;

  private Provider<EventBus> eventBusProvider;

  private MembersInjector<MapActivity> mapActivityMembersInjector;

  private MembersInjector<ContactsViewModel> contactsViewModelMembersInjector;

  private Provider<ContactsViewModel> contactsViewModelProvider;

  private Provider<ContactsMvvm.ViewModel> bindContactsViewModelProvider;

  private MembersInjector<ContactsActivity> contactsActivityMembersInjector;

  private MembersInjector<StatusViewModel> statusViewModelMembersInjector;

  private Provider<StatusViewModel> statusViewModelProvider;

  private Provider<StatusMvvm.ViewModel> bindStatusViewModelProvider;

  private MembersInjector<StatusActivity> statusActivityMembersInjector;

  private MembersInjector<ConfigurationViewModel> configurationViewModelMembersInjector;

  private Provider<ConfigurationViewModel> configurationViewModelProvider;

  private Provider<ConfigurationMvvm.ViewModel> bindConfigurationViewModelProvider;

  private MembersInjector<ConfigurationActivity> configurationActivityMembersInjector;

  private MembersInjector<LoadViewModel> loadViewModelMembersInjector;

  private Provider<LoadViewModel> loadViewModelProvider;

  private Provider<LoadMvvm.ViewModel> bindLoadViewModelProvider;

  private MembersInjector<LoadActivity> loadActivityMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideNavigatorProvider =
        DoubleCheck.provider(ActivityModule_ProvideNavigatorFactory.create(builder.activityModule));

    this.mapViewModelMembersInjector =
        MapViewModel_MembersInjector.create(provideNavigatorProvider);

    this.contextProvider =
        new Factory<Context>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public Context get() {
            return Preconditions.checkNotNull(
                appComponent.context(), "Cannot return null from a non-@Nullable component method");
          }
        };

    this.contactsRepoProvider =
        new Factory<ContactsRepo>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public ContactsRepo get() {
            return Preconditions.checkNotNull(
                appComponent.contactsRepo(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.mapViewModelProvider =
        DoubleCheck.provider(
            MapViewModel_Factory.create(
                mapViewModelMembersInjector, contextProvider, contactsRepoProvider));

    this.bindMapViewModelProvider = (Provider) mapViewModelProvider;

    this.eventBusProvider =
        new Factory<EventBus>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public EventBus get() {
            return Preconditions.checkNotNull(
                appComponent.eventBus(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.mapActivityMembersInjector =
        MapActivity_MembersInjector.create(
            bindMapViewModelProvider, eventBusProvider, provideNavigatorProvider);

    this.contactsViewModelMembersInjector =
        ContactsViewModel_MembersInjector.create(provideNavigatorProvider);

    this.contactsViewModelProvider =
        DoubleCheck.provider(
            ContactsViewModel_Factory.create(
                contactsViewModelMembersInjector, contextProvider, contactsRepoProvider));

    this.bindContactsViewModelProvider = (Provider) contactsViewModelProvider;

    this.contactsActivityMembersInjector =
        ContactsActivity_MembersInjector.create(
            bindContactsViewModelProvider, eventBusProvider, provideNavigatorProvider);

    this.statusViewModelMembersInjector =
        StatusViewModel_MembersInjector.create(provideNavigatorProvider);

    this.statusViewModelProvider =
        DoubleCheck.provider(
            StatusViewModel_Factory.create(statusViewModelMembersInjector, contextProvider));

    this.bindStatusViewModelProvider = (Provider) statusViewModelProvider;

    this.statusActivityMembersInjector =
        StatusActivity_MembersInjector.create(
            bindStatusViewModelProvider, eventBusProvider, provideNavigatorProvider);

    this.configurationViewModelMembersInjector =
        ConfigurationViewModel_MembersInjector.create(provideNavigatorProvider);

    this.configurationViewModelProvider =
        DoubleCheck.provider(
            ConfigurationViewModel_Factory.create(configurationViewModelMembersInjector));

    this.bindConfigurationViewModelProvider = (Provider) configurationViewModelProvider;

    this.configurationActivityMembersInjector =
        ConfigurationActivity_MembersInjector.create(
            bindConfigurationViewModelProvider, eventBusProvider, provideNavigatorProvider);

    this.loadViewModelMembersInjector =
        LoadViewModel_MembersInjector.create(provideNavigatorProvider);

    this.loadViewModelProvider =
        DoubleCheck.provider(
            LoadViewModel_Factory.create(loadViewModelMembersInjector, contextProvider));

    this.bindLoadViewModelProvider = (Provider) loadViewModelProvider;

    this.loadActivityMembersInjector =
        LoadActivity_MembersInjector.create(
            bindLoadViewModelProvider, eventBusProvider, provideNavigatorProvider);
  }

  @Override
  public void inject(MapActivity activity) {
    mapActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(ContactsActivity activity) {
    contactsActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(StatusActivity activity) {
    statusActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(ConfigurationActivity activity) {
    configurationActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(LoadActivity activity) {
    loadActivityMembersInjector.injectMembers(activity);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private AppComponent appComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}