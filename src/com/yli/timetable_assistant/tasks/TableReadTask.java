package com.yli.timetable_assistant.tasks;

import com.yli.timetable_assistant.fx.FXUtils;
import com.yli.timetable_assistant.res.StringsBundle;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.IOException;
import java.net.*;
import java.util.ResourceBundle;

public class TableReadTask extends CallbackTask<Workbook> {


    private final File file;


    public TableReadTask(TaskCallbacks<Workbook> callbacks,File file) {
        super(callbacks);
        this.file = file;
    }

    @Override
    protected Workbook call() throws Exception {
        //The file that's passed must never be null!
        if (file==null){
            throw new IllegalArgumentException("File passed must never be null");
        }

        return WorkbookFactory.create(file);

    }



}
