package co.com.you.crud.service;

import co.com.you.crud.model.Student;
import co.com.you.crud.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository iStudentRepository;

    public Student saveStudent(Student student){
        if(student.getId() != null){
            return  iStudentRepository.save(student);
        }
        return null;
    }

    public Page<Student> getAllStudent () {

        return iStudentRepository.findAll();
    }
}
