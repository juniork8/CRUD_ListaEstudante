package br.com.devdojo.awesome.endpoint;

import br.com.devdojo.awesome.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import static java.util.Arrays.asList;

@RestController
@RequestMapping("student")
public class StudentEndpoint {

    @GetMapping
    public List<Student> listAll() {
        /*
        Student objDiogo = new Student("Diogo Moreira");
        Student objPablo = new Student("Pablo Bonilha");
        Student objPedro = new Student("Pedro Henrique");
        Student objArmando = new Student("Armando Thiago");
        Student objArnaldo = new Student("Arnaldo Salvador");

        return asList(objDiogo, objPablo, objPedro, objArmando, objArnaldo);
        */

      return asList(new Student("Diku"), new Student("Todoroki"));
    }
}

