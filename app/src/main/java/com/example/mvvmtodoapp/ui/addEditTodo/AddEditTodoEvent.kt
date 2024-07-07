package com.example.mvvmtodoapp.ui.addEditTodo

sealed class AddEditTodoEvent {
    data class OnTitleChange(val title: String) : AddEditTodoEvent()
    data class OnDescriptionChange(val description: String) : AddEditTodoEvent()
    data object OnSaveTodoClick : AddEditTodoEvent()
}