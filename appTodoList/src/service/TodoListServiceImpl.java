package service;

import entity.TodoList;
import repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService {

  private TodoListRepository todoListRepository;

  public TodoListServiceImpl(TodoListRepository todoListRepository) {
    this.todoListRepository = todoListRepository;
  }

  @Override
  public void showTodoList() {
    TodoList[] model = todoListRepository.getAll();

    System.out.println("## TODOLIST");

    for (var i = 0; i < model.length; i++) {
      var todolist = model[i];
      var no = i + 1;

      if (todolist != null) {
        System.out.println(no + ". " + todolist.getTodo());
      }
    }
  }

  @Override
  public void addTodoList(String todo) {
    TodoList todolist = new TodoList(todo);
    todoListRepository.add(todolist);

    System.out.println("Sukses menambahkan todo :# " + todo);
  }

  @Override
  public void removeTodoList(Integer number) {
    boolean success = todoListRepository.remove(number);

    if (success) {
      System.out.println("Sukses mengahapus todo:# " + number);
    } else {
      System.out.println("Gagal mengahapus todo:# " + number);
    }

  }
}
