package by.IT.controlers;


import by.repositories.LibraryRepositories;
import net.sf.jsqlparser.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LibraryController {
    private LibraryRepositories repository;

    @Autowired
    public void setRepository(LibraryRepositories repository) {
        this.repository = repository;
    }

    @GetMapping
    public String getAll(Module module) {
        var libraries = repository.findAll();
        model.addAttribute("libraries", libraries);
        return "index";

    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable(name = "id") int id,
                       Model model) {
        var library = repository.findById(id).get();
        model.addAttribute("library"library);
        return "library";
    }
}
