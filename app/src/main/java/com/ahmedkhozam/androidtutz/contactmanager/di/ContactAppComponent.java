package com.ahmedkhozam.androidtutz.contactmanager.di;

import com.ahmedkhozam.androidtutz.contactmanager.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class,RoomModule.class})
public interface ContactAppComponent {

    void inject(MainActivity mainActivity);
}
