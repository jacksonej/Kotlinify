package `in`.jackz.kotlinify.Facade

/**
 * Created by jackson on 1/6/17.
 */
public class  FacadeImpl  private constructor() : Facade {

    companion object{
        private var facadeImpl: FacadeImpl? = null

        fun  getInstance(): FacadeImpl {
            if (facadeImpl == null)
                facadeImpl = FacadeImpl()

            return facadeImpl!!
        }
    }
    override fun getList() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}