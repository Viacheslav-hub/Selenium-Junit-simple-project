public class TestRunner {




        public static void main(String args[]) {





            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\chromedriver\\chromedriver.exe");
            Webdriver webdriver = new Chromedriver();
          webdriver.get("https://yummyanime.club/");
    }
}
