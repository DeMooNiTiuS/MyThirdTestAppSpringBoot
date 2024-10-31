package ru.massalskiy.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.massalskiy.MyThirdTestAppSpringBoot.exception.ValidationFailedException;
import ru.massalskiy.MyThirdTestAppSpringBoot.exception.UnsupportedCodeException;
import ru.massalskiy.MyThirdTestAppSpringBoot.model.Request;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
    void isCodeValid(Request request) throws UnsupportedCodeException;
}
