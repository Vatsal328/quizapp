package com.vatsal.quizapp.service;

import com.vatsal.quizapp.Question;
import com.vatsal.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    @Autowired
    private QuestionDao questionDao;
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    public List<Question> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    public String addQuestion(Question question) {
        questionDao.save(question);
        return "Question added successfully";
    }

    public String deleteQuestion(Integer id) {
        Optional<Question> question = questionDao.findById(id);
        if (question.isPresent()) {
            questionDao.delete(question.get());
            return "Question deleted successfully";
        }
        else {
            return "Question with id " + id + " does not exist";
        }
    }
}
