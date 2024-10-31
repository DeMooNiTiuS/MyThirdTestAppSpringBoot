package ru.massalskiy.MyThirdTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.massalskiy.MyThirdTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}
