package qotd

class QuoteController {
    static scaffold = Quote
    def quoteService
    static defaultAction = "home"

    def home() {
      render "<h1>Real Programmers do not eat Quiche</h1>"
    }

    def random() {
      def randomQuote = quoteService.getRandomQuote()
      [ quote : randomQuote ]
    }

}
