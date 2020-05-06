package qotd

class QuoteController {

    static defaultAction = "home"

    def home() {
      render "<h1>Real Programmers do not eat Quiche</h1>"
    }

    def random() {
      def staticAuthor = "Anonymous"
      def staticContent = "Real Programmers don't each much quiche"
      [ author: staticAuthor, content: staticContent ]
    }

}