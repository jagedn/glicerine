package glicerine

import grails.rest.Resource

/**
 * Created by jorge on 23/09/2015.
 */
@Resource(uri='/books', formats=['json'])
class Book {

    String title

    static constraints = {
        title blank:false
    }
}
