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

**Note List Screen**
<p align="center">
  <img src="https://github.com/batooldshilleh/MVVMTodoApp/assets/93814390/57ceda97-d857-4e44-95e7-85917975bc8f" alt="Additional Screenshot 1" style="width:30%; margin-right: 5%;" />
  <img src="https://github.com/batooldshilleh/MVVMTodoApp/assets/93814390/4383b333-e62f-48d7-8bb7-b45357e34c8c" alt="Additional Screenshot 2" style="width:30%; margin-right: 5%;" />
  <img src="https://github.com/batooldshilleh/MVVMTodoApp/assets/93814390/44e9ecb7-ee3f-41c7-bf6a-645643903f21" alt="Additional Screenshot 2" style="width:30%; margin-right: 5%;" />
<img src="https://github.com/batooldshilleh/MVVMTodoApp/assets/93814390/d798c374-1017-4f36-9dc5-4b38bc42b919" alt="Additional Screenshot 2" style="width:30%; margin-right: 5%;" />
</p>

---

**Add Note Screen**
<p align="center">
<img src="https://github.com/batooldshilleh/MVVMTodoApp/assets/93814390/f619a176-48fd-44db-98f9-83b04bfe6739" alt="Additional Screenshot 2" style="width:30%; margin-right: 5%;" />
<img src="https://github.com/batooldshilleh/MVVMTodoApp/assets/93814390/dbef8090-b1fd-4a5a-871a-3a604c03a1d0" alt="Additional Screenshot 2" style="width:30%; margin-right: 5%;" />
<img src="https://github.com/batooldshilleh/MVVMTodoApp/assets/93814390/1ed7c679-0cf5-4e39-9c59-3b37b0075fb8" alt="Additional Screenshot 2" style="width:30%; margin-right: 5%;" />
</p>

***

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
