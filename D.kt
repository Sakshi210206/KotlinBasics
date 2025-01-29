class D : A,B {
    override fun foo() {
       super<A>.foo()
        super<B>.foo()
       println("D.foo")
    }

    override fun bar() {
        super<A>.foo()
        super<B>.foo()
        println("D.bar")
    }

}