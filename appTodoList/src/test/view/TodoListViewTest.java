package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {
  public static void main(String[] args) {
    testShowTodoList();
  }

  public static void testShowTodoList(){
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    TodoListView todoListView = new TodoListView(todoListService);

    todoListService.addTodoList("belajar java");
    todoListService.addTodoList("belajar springboot");
    todoListService.addTodoList("belajar database");

    todoListView.showTodoList();
  }
}
