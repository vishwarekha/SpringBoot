package todolist.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

@Autowired
ToDoRepository toDoRepository;

	public List<ToDo> getAllToDo(){
		List<ToDo> todos=new ArrayList<ToDo>();
		toDoRepository.findAll().forEach(todos::add);
		return todos;
	}
	
	public Optional<ToDo> getToDo(Integer id) {
		 return toDoRepository.findById(id);
	}
	
	public void createToDo(ToDo todo) {
	toDoRepository.save(todo);
	}

	public void updateToDo(Integer id, ToDo todo) {
		toDoRepository.save(todo);		
	}
	
	public void deleteToDo(Integer id) {
		toDoRepository.deleteById(id);
	}
}
