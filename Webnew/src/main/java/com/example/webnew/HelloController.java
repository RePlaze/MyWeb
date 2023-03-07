package com.example.webnew;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;
public class HelloController implements Initializable {
    @FXML
    private WebView webView;
    @FXML
    private TextField search;
    private WebEngine engine;
    private WebHistory history;
    private String homePage;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        engine = webView.getEngine();
        homePage = "www.google.com";
        search.setText(homePage);
        loadPage();

    }

    public void loadPage() {
        engine.load("http://"+search.getText());
    }

    public void refreshPage() {
        engine.reload();
    }

    public void displayHistory() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        for(WebHistory.Entry entry : entries) {
            System.out.println(entry.getUrl()+" "+entry.getLastVisitedDate());
        }
    }

    public void back() {
        history = engine.getHistory();
        ObservableList<WebHistory.Entry> entries = history.getEntries();
        history.go(-1);
        search.setText(entries.get(history.getCurrentIndex()).getUrl());
    }

}