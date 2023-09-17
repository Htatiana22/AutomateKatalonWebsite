package com.katalon_demo_cura.utils;

public enum UrlPage {
    URLPAGE ("https://katalon-demo-cura.herokuapp.com");
        private final String url;
        UrlPage(String url) {
            this.url = url;
        }
        public String url() {
            return url;
        }
    }

