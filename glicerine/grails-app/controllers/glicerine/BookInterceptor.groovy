package glicerine

/**
 * Created by jorge on 23/09/2015.
 */
class BookInterceptor {

    boolean before() {
        header( "Access-Control-Allow-Origin", "http://localhost:5000" )
        header( "Access-Control-Allow-Credentials", "true" )
        header( "Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE" )
        header( "Access-Control-Max-Age", "3600" )
        true
    }

    boolean after() { true }

}
