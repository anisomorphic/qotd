package qotd

class BootStrap {

    def init = { servletContext ->


    new Quote("author": "Larry Wall", "content": "There is more than one method to our madness.").save()
    new Quote("author": "Chuck Norris Facts", "content": "Chuck Norris always uses his own design patterns, and his favorite is the Roundhouse Kick.").save()
    new Quote("author": "Eric Raymond", "content": "Being a social outcast helps you stay concentrated on the really important things, like thinking and hacking.").save()
    }
    def destroy = {
    }
}
