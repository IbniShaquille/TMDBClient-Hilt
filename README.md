# TMDB Client Hilt Version

This project is about retrieve a popular list movies, TvShows, and Artist. This project learning about converting from Dagger to Hilt Dependency Injection. You can download Dagger version: [Dagger TMDB Client Version](https://github.com/IbniShaquille/TMDBClient/).

## Features

- Home\
  The home screen serves as the central hub of the application, displaying a list of 3 button, Movie, Artist, and TvShow button. if Button click, it will redirect with the new path.
- Movie\
  The Movie Screen will show a list of popular movie from TMDB. If you want refresh for the new list, just click update button.
- TvShow\
  The TvShow Screen will show a list of popular TvShow from TMDB. If you want refresh for the new list, just click update button.
- Artist\
  The Artist Screen will show a list of popular Artist from TMDB. If you want refresh for the new list, just click update button.

## Permission

- Internet\
  The application requires internet access to communicate with the API from TMDB.

## Build With

- [Kotlin](https://kotlinlang.org) - Version 2.0.0
- [RecyclerView](https://developer.android.com/develop/ui/views/layout/recyclerview)
- [Retrofit2](https://github.com/square/retrofit) - Version 2.11.0
- [GSON Converter](https://github.com/square/retrofit/tree/master/retrofit-converters/gson) - Version 2.11.0
- [OkHttp3](https://github.com/square/okhttp) - Version 4.12.0
- [Lifecycle](https://developer.android.com/jetpack/androidx/releases/lifecycle) - Version 2.8.1
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Version 2.8.1
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - Version 2.8.1
- [Glide](https://github.com/bumptech/glide) - Version 4.16.0
- [Room Database](https://developer.android.com/jetpack/androidx/releases/room) - Version 2.6.1
- [Coroutines](https://kotlinlang.org/docs/coroutines-overview.html) - Version 1.9.0-RC
- [Core KTX](https://developer.android.com/jetpack/androidx/releases/core) - Version 1.13.1
- [JUnit](https://junit.org/junit4/) - Version 4.13.2
- [AppCompat](https://developer.android.com/jetpack/androidx/releases/appcompat) - Version 1.7.0
- [Activity KTX](https://developer.android.com/jetpack/androidx/releases/activity) - Version 1.9.0
- [ConstraintLayout](https://developer.android.com/jetpack/androidx/releases/constraintlayout) - Version 2.1.4
- [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - Version 2.44
- [DataBinding](https://developer.android.com/topic/libraries/data-binding) - Version 8.4.1

## Installation

Instructions to install your project:

1. Clone this repository:
    ```bash
    git clone https://github.com/username/project.git
    ```
2. Navigate to the project directory:
    ```bash
    cd project
    ```
3. Sync and build the project using Android Studio.

## Converting the Project from Dagger to Hilt

Here are the steps to convert the project from Dagger to Hilt (TMDBClient project with Hilt available to download in the resources of this lesson).

### 1) Fix Gradle Files

**For the app-level Gradle file:**

- Remove dagger dependencies and sync.
- Add the hilt plugin definition to the top.
- Add hilt dependencies to the bottom.

**For the project-level Gradle file:**

- Add hilt classpath.
- Finally, sync the Gradle (do not rebuild the project at this point).

For more tutorials, refer to the official documentation: [Hilt on Android](https://developer.android.com/training/dependency-injection/hilt-android).

### 2) Application Class (App.kt)

- Remove all the code.
- Add this code:
    ```kotlin
    @HiltAndroidApp
    class App : Application()
    ```

### 3) di Package

- Delete the Injector interface.

### 4) di/core Package

- Delete AppComponent.
- Delete AppModule.
- Add `@InstallIn(SingletonComponent::class)` to all Modules.
- In DataBaseModule, use `app: Application` for the context.
- In NetModule, remove the constructor parameter and use `BuildConfig.BASE_URL` instead.
- In RemoteDataModule, remove the constructor parameter and use `BuildConfig.API_KEY` instead.

### 5) di/artist, di/movie, di/tvshow Packages

- Delete all Scopes and Subcomponents.
- Use `@InstallIn(ActivityComponent::class)` and `@ActivityScoped` instead. (Please check the final project of this lesson.)

### 6) ArtistActivity, MovieActivity, and TvShowActivity

- Annotate each activity class with `@AndroidEntryPoint`.
- Remove dagger injector code.

### 7) Final Step

- Clean and rebuild the project.
- Run the app. It will work as it did before.

## Credits

The tutorial for converting from Dagger to Hilt was adapted from the guide created by **Anushka Madusanka**.
