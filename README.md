# MVVM Todo App

MVVM Todo App is a simple Android application built using Kotlin and Jetpack Compose. It allows users to manage their todo list with basic functionalities like adding, editing, and deleting tasks.

## Features

- **Add/Edit/Delete Todos:** Users can add new todos, edit existing ones, and delete todos when they're no longer needed.
- **Todo Status:** Each todo can be marked as done or undone.
- **Persistent Storage:** Todos are stored locally using Room Persistence Library.
- **MVVM Architecture:** The app follows the Model-View-ViewModel (MVVM) architectural pattern for clear separation of concerns and easier maintenance.

## Screenshots

**App Icon**
<p align="center">
  <img src="https://github.com/batooldshilleh/MVVMTodoApp/assets/93814390/a02c9af3-0586-474f-a135-7d44a9285fbc" alt="App Icon" style="width:30%" />
</p>
![Add/Edit Todo Screen](screenshots/add_edit_todo.png)

## Libraries Used

- **Room:** For local database storage.
- **Jetpack Compose:** For building the UI declaratively.
- **Hilt:** For dependency injection.
- **Coroutines:** For managing background threads with simplified code and reducing needs for callbacks.

## Setup

To run this project, clone the repository and open it using Android Studio. Make sure you have the latest Android SDK installed.

```bash
git clone https://github.com/your_username/mvvmtodoapp.git
```
## How to Use

   * Todo List Screen: View all your todos with options to mark as done, edit, or delete.
   * Add/Edit Todo Screen: Add a new todo or edit an existing one with a title and optional description.
