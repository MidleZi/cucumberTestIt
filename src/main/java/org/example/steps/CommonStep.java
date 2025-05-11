package org.example.steps;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Тогда;
//import lombok.extern.log4j.Log4j2;
//import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.Slf4j;
import org.example.common.Common;
import org.example.common.Context;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

@Slf4j
public class CommonStep {

    @Autowired
    private Context context;


    @Тогда("^добавим комментарий \"(.+?)\"$")
    public void comment(String comment) {
        log.info("\n\n=====================\n" + Common.parseInputStepParam(context, comment) + "\n=====================\n");
    }

    @Тогда("^добавим переменные$")
    public void createVars(DataTable dataTable) {
        dataTable.asLists().forEach(e ->
                context.put(e.get(0), e.get(1)));
    }

}
