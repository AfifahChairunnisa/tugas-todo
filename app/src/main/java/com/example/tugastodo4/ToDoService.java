package com.example.tugastodo4;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ToDoService {
    @GET("todo.php")
    Call<List<ToDoItem>> getTodoList();
}

