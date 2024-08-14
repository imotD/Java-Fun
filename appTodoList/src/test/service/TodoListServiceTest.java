package test.service;

import entity.TodoList;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {
  public static void main(String[] args) {
//    testShowTodoList();
//    testAddTodoList();
    testRemoveTodoList();
  }

  public static void testShowTodoList() {
    TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
    todoListRepository.data[0] = new TodoList("menaklukan java basic");
    todoListRepository.data[1] = new TodoList("menaklukan sprig boot");
    todoListRepository.data[2] = new TodoList("menaklukan backend infosys");

    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.showTodoList();
  }

  public static void testAddTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("menaklukan java basic");
    todoListService.addTodoList("menaklukan sprig boot");
    todoListService.addTodoList("menaklukan backend infosys");

    todoListService.showTodoList();
  }

  public static void testRemoveTodoList() {
    TodoListRepository todoListRepository = new TodoListRepositoryImpl();
    TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

    todoListService.addTodoList("menaklukan java basic");
    todoListService.addTodoList("menaklukan sprig boot");
    todoListService.addTodoList("menaklukan backend infosys");

    todoListService.showTodoList();

    todoListService.removeTodoList(2);

    todoListService.showTodoList();

  }
}
